import java.util.Scanner;

public class Algoritmo44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num, base, logaritmo;

        System.out.print("Entre com o logaritmando: ");
        num = scanner.nextDouble();

        System.out.print("Entre com a base: ");
        base = scanner.nextDouble();

        logaritmo = Math.log(num) / Math.log(base);

        System.out.println("O logaritmo de " + num + " na base " + base + " é: " + logaritmo);

        scanner.close();
    }
}