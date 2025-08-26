import java.util.Scanner;

public class Algoritmo42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double angulo, rang;

        System.out.print("Digite um angulo em graus: ");
        angulo = scanner.nextDouble();

        rang = angulo * Math.PI / 180;

        System.out.println("Seno: " + Math.sin(rang));
        System.out.println("Co-seno: " + Math.cos(rang));
        System.out.println("Tangente: " + Math.tan(rang));
        System.out.println("Co-secante: " + (1 / Math.sin(rang)));
        System.out.println("Secante: " + (1 / Math.cos(rang)));
        System.out.println("Co-tangente: " + (1 / Math.tan(rang)));

        scanner.close();
    }
}
