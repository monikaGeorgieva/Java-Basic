import java.util.Scanner;

public class _1_EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceSweetBread = 3.20;
        double priceEggs12 = 4.35;
        double cookiesPriceKg = 5.40;
        double pricePaintEggs = 0.15;

        int countSweetBread = Integer.parseInt(scanner.nextLine());
        int countEggs = Integer.parseInt(scanner.nextLine());
        int countCokieskg = Integer.parseInt(scanner.nextLine());

        double totalPticeSweetBread = countSweetBread * priceSweetBread;
        double totalPriceEggs = countEggs * priceEggs12;
        double totalPriceCookies = cookiesPriceKg * countCokieskg;
        double totalPricePaint = countEggs * 12 * pricePaintEggs;

        double total = totalPriceCookies + totalPticeSweetBread + totalPriceEggs + totalPricePaint;
        System.out.printf("%.2f",total);
    }
}
