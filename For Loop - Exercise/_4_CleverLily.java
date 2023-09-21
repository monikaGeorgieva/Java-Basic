import java.util.Scanner;

public class _4_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());
        int toys = 0;
        double moneyBirthay = 10.00;
        double lilyMoney = 0.00;
        for (int i = 1; i <= age ; i++) {
            if (i % 2 == 0){ //even
                lilyMoney += moneyBirthay;
                moneyBirthay += 10.00;
                lilyMoney -= 1.00;
            }else {
                toys++;
            }
        }
        lilyMoney += toys * pricePerToy;

        //⦁	"Yes! {N}" - където N е остатъка пари след покупката
        //⦁	"No! {М}" - където M е сумата, която не достига
        //Числата N и M- форматирани до вторият знак след десетичната запетая.

        //10 170.00 6
        if (lilyMoney >= priceWashingMachine){
            System.out.printf("Yes! %.2f",lilyMoney - priceWashingMachine);
        }else{
            System.out.printf("No! %.2f",priceWashingMachine - lilyMoney);
        }
    }
}
//вход
//10
//170.00
//6