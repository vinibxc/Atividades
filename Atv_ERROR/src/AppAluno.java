import java.util.Scanner;
public class AppAluno {
    protected static int tamanho;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantos alunos serão cadastrados:");
        tamanho = teclado.nextInt();
        ServiceAluno servico = new ServiceAluno();
        for(int x = 0; x < tamanho; x++) {
            System.out.println("Digite o nome do aluno:");
            String nome = teclado.next();
            servico.SetNome(nome);
            System.out.println("Digite o endereço do aluno:");
            String endereco = teclado.next();
            servico.SetEndereco(endereco);System.out.println("Digite a matrícula do aluno:");
            int matricula = teclado.nextInt();
            servico.setMatricula(matricula);
        }
        for(int x = 0; x < tamanho; x++) {
            servico.exibir();
        }
        teclado.close();
    }

}
