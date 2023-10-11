import java.util.Scanner;

public class _2_AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceLuggageAbove20KG = Double.parseDouble(scanner.nextLine());
        double weightOfLuggage = Double.parseDouble(scanner.nextLine());
        int daysBeforeFlight = Integer.parseInt(scanner.nextLine());
        int countBags = Integer.parseInt(scanner.nextLine());

        double totalPriceBags = 0.00;

        if (weightOfLuggage < 10){
           totalPriceBags  = (priceLuggageAbove20KG * 0.20);
        } else if (weightOfLuggage >= 10 && weightOfLuggage <= 20) {
          totalPriceBags   = priceLuggageAbove20KG * 0.50;
        }else {
          totalPriceBags   = priceLuggageAbove20KG;
        }

        if (daysBeforeFlight > 30){
            totalPriceBags += (totalPriceBags * 0.10);
        } else if (daysBeforeFlight >= 7  && daysBeforeFlight <= 30) {
            totalPriceBags += (totalPriceBags * 0.15);
        }else if (daysBeforeFlight < 7){
            totalPriceBags += (totalPriceBags * 0.40);
        }
        System.out.printf("The total price of bags is: %.2f lv.",totalPriceBags * countBags );
    }
}
