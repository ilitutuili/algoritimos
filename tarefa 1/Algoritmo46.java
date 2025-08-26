import java.util.Scanner;

public class Algoritmo46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo, nsaldo;

        System.out.print("Digite saldo: ");
        saldo = scanner.nextDouble();

        nsaldo = saldo * 1.01;

        System.out.println("Novo saldo: " + nsaldo);

        scanner.close();
    }
}