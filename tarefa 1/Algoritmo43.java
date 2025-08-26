import java.util.Scanner;

public class Algoritmo43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num, logaritmo;

        System.out.print("Entre com o logaritmando: ");
        num = scanner.nextDouble();

        logaritmo = Math.log10(num);

        System.out.println("Logaritmo: " + logaritmo);

        scanner.close();
    }
}