import java.util.Scanner;

public class Algoritmo40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quoc, rest, val1, val2;

        System.out.print("Entre com o dividendo: ");
        val1 = scanner.nextInt();

        System.out.print("Entre com o divisor: ");
        val2 = scanner.nextInt();

        quoc = val1 / val2;
        rest = val1 % val2;

        System.out.println("\n\n\n");
        System.out.println("Dividendo: " + val1);
        System.out.println("Divisor: " + val2);
        System.out.println("Quociente: " + quoc);
        System.out.println("Resto: " + rest);
        System.out.println();
        
        scanner.close();
    }
}