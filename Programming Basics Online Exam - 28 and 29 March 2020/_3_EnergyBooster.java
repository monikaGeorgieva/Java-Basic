import java.util.Scanner;

public class _3_EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.  "Watermelon", "Mango", "Pineapple" или "Raspberry"
        //2. Размерът на сета -  "small"(2) или "big"(5)
        //3. Брой на поръчаните сетове - цяло число в интервала [1 … 10000]

        String flavor = scanner.nextLine();
        String typeSet = scanner.nextLine();
        int countOrder = Integer.parseInt(scanner.nextLine());
        double pricePerPac = 0;
        double pricePerSet = 0;

        if (flavor.equals("Watermelon")){
            switch (typeSet){
                case "small":
                    pricePerPac = 2 * 56;
                break;
                case "big":
                    pricePerPac = 5 * 28.70;
                break;
            }
            pricePerSet = pricePerPac * countOrder;
        } else if (flavor.equals("Mango")) {
            switch (typeSet){
                case "small":
                    pricePerPac = 2 * 36.66;
                    break;
                case "big":
                    pricePerPac = 5 * 19.60;
                    break;
            }
            pricePerSet = pricePerPac * countOrder;
        } else if (flavor.equals("Pineapple")) {
            switch (typeSet){
                case "small":
                    pricePerPac = 2 * 42.10;
                    break;
                case "big":
                    pricePerPac = 5 * 24.80;
                    break;
            }
            pricePerSet = pricePerPac * countOrder;

        } else if (flavor.equals("Raspberry")) {
            switch (typeSet){
                case "small":
                    pricePerPac = 2 * 20;
                    break;
                case "big":
                    pricePerPac = 5 * 15.20;
                    break;
            }
            pricePerSet = pricePerPac * countOrder;
        }
        if (pricePerSet >= 400 && pricePerSet <= 1000){
            pricePerSet -= pricePerSet * 0.15;
        } else if (pricePerSet > 1000) {
            pricePerSet -= pricePerSet * 0.50;
        }
        System.out.printf("%.2f lv.",pricePerSet);
    }
}
