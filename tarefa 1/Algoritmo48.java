import java.util.Scanner;

public class Algoritmo48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sm, qtade, preco, vp, vd;

        System.out.print("Entre com o salário mínimo: ");
        sm = scanner.nextDouble();

        System.out.print("Entre com a quantidade em quilowatt: ");
        qtade = scanner.nextDouble();

        preco = sm / 700; // valor de 1 quilowatt
        vp = preco * qtade; // valor a ser pago
        vd = vp * 0.9; // valor com desconto de 10%

        System.out.println("Preço do quilowatt: " + preco);
        System.out.println("Valor a ser pago: " + vp);
        System.out.println("Valor com desconto: " + vd);

        scanner.close();
    }
}