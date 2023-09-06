import java.util.Scanner;

public class journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String place = "";
        double price = 0;
        if (budget <= 100){
            destination = "Bulgaria";
            switch (season){
                case "summer": place = "Camp";
                    price = (budget * 0.30);
                break;
                case  "winter": place = "Hotel";
                    price = (budget * 0.70);
                break;
            }

        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season){
                case "summer": place = "Camp";
                price = budget * 0.40;
                    break;
                case  "winter": place = "Hotel";
                price = budget * 0.80;
                    break;
            }
        }else{
            destination = "Europe";
            place = "Hotel";
            price = budget * 0.90;
        }
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",place,price);
    }
}
