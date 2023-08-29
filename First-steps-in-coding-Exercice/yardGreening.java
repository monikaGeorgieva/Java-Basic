import java.util.Scanner;

public class yardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yard = Double.parseDouble(scanner.nextLine());
        double priceForGreening = yard * 7.61;
        double discount = (priceForGreening * 0.18);
        double total = priceForGreening - discount;
        System.out.printf("The final price is: %.2f lv.%n",total);
        System.out.printf("The discount is: %.2f lv.",discount);
    }
}
