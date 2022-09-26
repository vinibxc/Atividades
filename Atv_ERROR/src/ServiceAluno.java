import java.util.Scanner;

public class ServiceAluno {
    // Atributos
    protected String nome;
    protected String endereco;
    protected int matricula;
    static int tamanho = AppAluno.tamanho;
    protected static Aluno[] alunos = new Aluno[tamanho];
    protected int[] matriculas = new int[tamanho];
    static int cont = 0;

    public void SetNome(String nome){
        this.nome = nome;
    }
    public void SetEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
        verificar();
    }

    // Construtor
    public ServiceAluno(){

    }
    // Metodos
    public void verificar(){
            try {
                for(int x = 0; x < tamanho; x++) {
                    if (matricula == matriculas[x]) {
                        throw new MatriculaErro(matricula);
                    }
                }
            }
            catch (MatriculaErro e) {
                System.out.println("Ocorreu um erro!!");
                System.out.println(e.getMessage());
                novaMatricula();

            }catch(ArrayIndexOutOfBoundsException exception) {
                System.out.println("Tentou entrar onde n tinha nada");
            }
        cadastrar();
    }

    private void cadastrar() {
        alunos[cont] = new Aluno(nome, endereco, matricula);
        matriculas[cont] = matricula;
        cont += 1;
    }
    public void novaMatricula(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma nova matricula valida:");
        matricula = teclado.nextInt();
        try {
            for(int x = 0; x < tamanho; x++) {
                if (matricula == matriculas[x]) {
                    throw new MatriculaErro(matricula);
                }
            }
        }
        catch (MatriculaErro e) {
            System.out.println("Ocorreu um erro!!");
            System.out.println(e.getMessage());
            novaMatricula();

        }
        teclado.close();
    }
    public void exibir() {
        for(int x = 0; x < tamanho; x++ ) {
            System.out.println(x+1 + "° aluno:");
            System.out.println("Nome:" + alunos[x].nome);
            System.out.println("Endereço:" + alunos[x].endereco);
            System.out.println("Matricula:" + alunos[x].matricula);
            System.out.println("-----------------------------------------------------------------------------");
        }
    }


}
