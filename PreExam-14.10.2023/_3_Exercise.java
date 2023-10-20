import java.util.Scanner;

public class _3_Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDancers = Integer.parseInt(scanner.nextLine());
        double countPoints = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        //"summer" или "winter"
        String place = scanner.nextLine();
        //"Bulgaria" или "Abroad"
            double winMoney = 0;
            double moneyAfterDiscount = 0;
            double moneyCharity = 0;
            double moneyLeft = 0;
            if (season.equals("summer")){
                switch (place){
                    case "Bulgaria":
                        winMoney = countDancers * countPoints;
                        winMoney -= winMoney * 0.05;
                        break;
                    case "Abroad":
                        winMoney = (countDancers * countPoints);
                        winMoney += (winMoney * 0.50);
                        winMoney -=  (winMoney * 0.10);
                        break;
                }
            } else if (season.equals("winter")) {
                switch (place){
                    case "Bulgaria":
                        winMoney = countDancers * countPoints;
                        winMoney -= winMoney * 0.08;
                        break;
                    case "Abroad":
                        winMoney = (countDancers * countPoints);
                        winMoney += (winMoney * 0.50);
                        winMoney -=  (winMoney * 0.15);
                        break;
                }
            }
        moneyCharity = winMoney * 0.75;
        moneyLeft = winMoney - moneyCharity;
        System.out.printf("Charity - %.2f\n",moneyCharity);
        System.out.printf("Money per dancer - %.2f",moneyLeft /countDancers);
    }
}
