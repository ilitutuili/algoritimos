import java.util.Scanner;

public class Algoritmo25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int data, dia, mes, ano;

        System.out.print("Digite data no formato DDMMAA: ");
        data = scanner.nextInt();

        dia = data / 10000;
        mes = (data % 10000) / 100;
        ano = data % 100;

        System.out.println("DIA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("ANO: " + ano);

        scanner.close();
    }
}
