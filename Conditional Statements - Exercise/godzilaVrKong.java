import java.util.Scanner;

public class godzilaVrKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetMovie = Double.parseDouble(scanner.nextLine());
        int statistNum = Integer.parseInt(scanner.nextLine());
        double priceClouthing = Double.parseDouble(scanner.nextLine());

        double decorTotal = budgetMovie * 0.10;
        double clouthingTotal = statistNum * priceClouthing;

        if (statistNum > 150){
            clouthingTotal =clouthingTotal -  clouthingTotal * 0.10;

        }
        double total = decorTotal + clouthingTotal;

        if (total > budgetMovie){
            double moneyLeft = total - budgetMovie;
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.",moneyLeft);
        }else{
            double moneyLeft = budgetMovie - total;
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.",moneyLeft);
        }

    }
}
