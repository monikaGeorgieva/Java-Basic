import java.util.Scanner;

public class foodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chikenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegMenu = Integer.parseInt(scanner.nextLine());

        double priceMenus = (chikenMenu * 10.35)+(fishMenu * 12.40)+(vegMenu * 8.15);
        double priceDessert =  (priceMenus * 0.20);
        double total = priceDessert + priceMenus + 2.50;
        System.out.println(total);

    }
}
