import java.util.Scanner;

public class _1_Exersice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPaper = Integer.parseInt(scanner.nextLine());
        int countClothMaterial = Integer.parseInt(scanner.nextLine());
        double glueLiter = Double.parseDouble(scanner.nextLine());
        int persentDiscount = Integer.parseInt(scanner.nextLine());

        double pricePaper = countPaper * 5.80;
        double priceClothMaterial = countClothMaterial * 7.20;
        double priceGloe = glueLiter * 1.20;

        double totalPrice = (priceGloe + priceClothMaterial + pricePaper);
        double totalPriceDiscount = totalPrice - (totalPrice * persentDiscount / 100);
        System.out.printf("%.3f",totalPriceDiscount);
    }
}
//7
//8
//0.5
//45
//54,340 отговор
