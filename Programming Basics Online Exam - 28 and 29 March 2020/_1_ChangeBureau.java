import java.util.Scanner;

public class _1_ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chineseUna = Double.parseDouble(scanner.nextLine());
        double commision = Double.parseDouble(scanner.nextLine());

        double bitcoinPrice = bitcoin * 1168;
        double totalinLeva = (chineseUna * 0.15) * 1.76;
        double LevaTotal = bitcoinPrice + totalinLeva;
        double conevertEuro = LevaTotal / 1.95;
        double commisionTotal = conevertEuro * (commision / 100);

        System.out.printf("%.2f",conevertEuro - commisionTotal);
    }
}
