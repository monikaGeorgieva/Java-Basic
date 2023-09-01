import java.util.Scanner;

public class shippingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int proccesors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double priceVideoCards = videoCards * 250;
        double priceProccessors = (priceVideoCards * 0.35) * proccesors;
        double priceRam = (priceVideoCards * 0.10) * ram;


        double total = priceVideoCards + priceProccessors + priceRam;
        if (videoCards >= proccesors){
            total = total - (total * 0.15);
        }
       if (budget >= total){
           double diff = budget - total;
           System.out.printf("You have %.2f leva left!",diff);
       }else if(budget < total){
           double diff = total - budget;
           System.out.printf("Not enough money! You need %.2f leva more!",diff);
       }
    }
}
