mport java.util.Scanner;

public class _2_Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pocketMoneyTeresa =Double.parseDouble(scanner.nextLine());
        double dayProfitMoney = Double.parseDouble(scanner.nextLine());
        double expenceTotal = Double.parseDouble(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());

        double totalPocketMoney = pocketMoneyTeresa * 5;
        double totalProfit = dayProfitMoney * 5;
        double totalSavedMoney = (totalPocketMoney + totalProfit) - expenceTotal;
        if (totalSavedMoney > priceGift){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",totalSavedMoney);
        }else{
            System.out.printf("Insufficient money: %.2f BGN.",priceGift - totalSavedMoney);
        }


    }
}
//5.12
//32.05
//15
//150
