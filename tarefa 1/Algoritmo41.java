import java.util.Scanner;

public class Algoritmo41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c, d, mp;

        System.out.print("Entre com 1 numero: ");
        a = scanner.nextDouble();

        System.out.print("Entre com 2 numero: ");
        b = scanner.nextDouble();

        System.out.print("Entre com 3 numero: ");
        c = scanner.nextDouble();

        System.out.print("Entre com 4 numero: ");
        d = scanner.nextDouble();

        mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10;

        System.out.println("Media ponderada: " + mp);

        scanner.close();
    }
}