import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double total = 0;
        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit){
                    case "banana":
                        total = 2.50 * quantity;
                        System.out.printf("%.2f",total);
                        break;
                    case "apple":
                        total = 1.20 * quantity;
                        System.out.printf("%.2f",total);
                        break;
                    case "orange":
                        total = 0.85 * quantity;
                        System.out.printf("%.2f",total);
                        break;
                    case "grapefruit":
                        total = 1.45 * quantity;
                        System.out.printf("%.2f",total);
                        break;
                    case "kiwi":
                        total = 2.70 * quantity;
                        System.out.printf("%.2f",total);
                        break;
                    case "pineapple":
                        total = 5.50 * quantity;
                        System.out.printf("%.2f",total);
                        break;
                    case "grapes":
                        total = 3.85 * quantity;
                        System.out.printf("%.2f",total);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }

                break;
            case "Saturday":
            case "Sunday":
                switch (fruit){
                    case "banana":
                        total = 2.70 * quantity;
                        System.out.printf("%.2f",total);
                        break;
                    case "apple":
                        total = 1.25 * quantity;
                        System.out.printf("%.2f",total);
                        break;
                    case "orange":
                        total = 0.90 * quantity;
                        System.out.printf("%.2f",total);
                        break;
                    case "grapefruit":
                        total = 1.60 * quantity;
                        System.out.printf("%.2f",total);
                        break;
                    case "kiwi":
                        total = 3.00 * quantity;
                        System.out.printf("%.2f",total);
                        break;
                    case "pineapple":
                        total = 5.60 * quantity;
                        System.out.printf("%.2f",total);
                        break;
                    case "grapes":
                        total = 4.20 * quantity;
                        System.out.printf("%.2f",total);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
        }

    }
}