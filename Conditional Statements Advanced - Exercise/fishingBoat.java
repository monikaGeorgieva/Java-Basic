import java.util.Scanner;

public class fishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermans = Integer.parseInt(scanner.nextLine());

        double total = 0;
         if (season.equals("Spring")) {
            if (fishermans <= 6){
                total = 3000 - (3000 * 0.10);
            } else if (fishermans >= 7 && fishermans <= 11) {
                total = 3000 - (3000 * 0.15);
            } else  {
                total = 3000 - (3000 * 0.25);
            }

        } else if (season.equals("Autumn") || season.equals("Summer")) {
            if (fishermans <= 6){
                total = 4200 - (4200 * 0.10);
            } else if (fishermans >= 7 && fishermans <= 11) {
                total = 4200 - (4200 * 0.15);
            } else {
                total = 4200 - (4200 * 0.25);
            }

        } else if (season.equals("Winter")) {
             if (fishermans <= 6){
                 total = 2600 - (2600 * 0.10);
             } else if (fishermans >= 7 && fishermans <= 11) {
                 total = 2600 - (2600 * 0.15);
             } else  {
                 total = 2600 - (2600 * 0.25);
             }
        }

       if (!season.equals("Autumn")){
           if (fishermans % 2 == 0){
               total = total - (total * 0.05);
           }
       }

       if (budget >= total){
           System.out.printf("Yes! You have %.2f leva left.",budget - total);
       }else{
           System.out.printf("Not enough money! You need %.2f leva.",total - budget);
       }
    }

}
