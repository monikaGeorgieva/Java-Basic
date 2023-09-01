import java.util.Scanner;

public class toyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzleNum = Integer.parseInt(scanner.nextLine());
        int dollNum = Integer.parseInt(scanner.nextLine());
        int teddyNum = Integer.parseInt(scanner.nextLine());
        int minionNum = Integer.parseInt(scanner.nextLine());
        int truckNum = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.60;
        double dollPrice = 3;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;

        double totalPriceToys = puzzlePrice * puzzleNum + dollNum * dollPrice + teddyNum * teddyBearPrice + minionPrice * minionNum + truckPrice * truckNum;
        double totalToys = puzzleNum + dollNum + teddyNum + minionNum + truckNum;
        if (totalToys >= 50){
            totalPriceToys = totalPriceToys - totalPriceToys * 0.25;
        }
        double rent =  (totalPriceToys * 0.10);
        double profit = totalPriceToys - rent;
        if (profit >= excursionPrice){
            double moneyLeft = profit - excursionPrice;
            System.out.printf("Yes! %.2f lv left.",moneyLeft);
        }else if (excursionPrice > profit){
            double moneyLeft = excursionPrice - profit;
            System.out.printf("Not enough money! %.2f lv needed.",moneyLeft);
        }


    }
}
