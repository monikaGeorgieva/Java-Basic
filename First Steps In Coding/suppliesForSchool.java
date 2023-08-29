import java.util.Scanner;

public class suppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int packPens = Integer.parseInt(scanner.nextLine());
        int packMarkers = Integer.parseInt(scanner.nextLine());
        int packDetergent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double totalPrice = ((packPens * 5.80) + (packMarkers * 7.20) + (packDetergent * 1.20));
        double priceWithDiscount = totalPrice - (totalPrice * discount/100);
        System.out.println(priceWithDiscount);
    }
}
