public class Excecao {
    public static void main(String[] args) {
        try {
            int[] vetor = new int[4];
            System.out.println("Antes da exceção");
            vetor[4] = 1;
            System.out.println("Esse texto não vai aparecer");
        } catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Tentou entrar onde n tinha nada");
        }
        System.out.println("Rodou aqui em pai");
    }
}