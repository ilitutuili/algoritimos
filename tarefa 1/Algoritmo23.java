import java.util.Scanner;

public class Algoritmo23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, d;

        System.out.print("Digite numero de tres casas: ");
        a = scanner.nextInt();  // lê o número de 3 dígitos

        d = (a % 100) / 10;  // pega o algarismo da casa das dezenas

        System.out.println("Algarismo da casa das dezenas: " + d);

        scanner.close();
    }
}
