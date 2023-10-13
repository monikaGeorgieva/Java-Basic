import java.util.Scanner;

public class _2_EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGuest = Integer.parseInt(scanner.nextLine());
        double pricePerPerson = Double.parseDouble(scanner.nextLine());
        double desiBudget = Double.parseDouble(scanner.nextLine());
        double cakePrice = desiBudget * 0.10;
        double totalPrice = 0;
         if (countGuest >= 10 && countGuest <= 15){
            pricePerPerson -=  pricePerPerson * 0.15;
        } else if (countGuest > 15 && countGuest <= 20) {
            pricePerPerson -= pricePerPerson * 0.20;
        }else if (countGuest > 20){
            pricePerPerson -= pricePerPerson * 0.25;
        }
        totalPrice = pricePerPerson * countGuest + cakePrice;
        if (desiBudget > totalPrice){
            System.out.printf("It is party time! %.2f leva left.",desiBudget - totalPrice);
        }else{
            System.out.printf("No party! %.2f leva needed.",totalPrice - desiBudget);
        }
    }

}
