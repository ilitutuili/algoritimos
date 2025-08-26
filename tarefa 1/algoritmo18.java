import java.util.Scanner;

public class algoritmo18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // cria objeto para leitura
        String nome;

        System.out.print("Digite o seu nome: ");
        nome = scanner.nextLine(); // lê uma linha de texto

        System.out.println("Olá, " + nome + "!");
        
        scanner.close(); // boa prática: fechar o scanner
    }
}
