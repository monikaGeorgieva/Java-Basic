import java.util.Scanner;

public class smallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double total = 0;

        if (town.equals("Sofia")){
           if (product.equals("coffee")){
               total = 0.50 * quantity;
           }else if (product.equals("water")) {
               total = 0.80 * quantity;
           }else if (product.equals("beer")) {
               total = 1.20 * quantity;
           }else if (product.equals("sweets")) {
               total = 1.45 * quantity;
           }else if (product.equals("peanuts")) {
            total = 1.60 * quantity;
        }
        }else if (town.equals("Plovdiv")){
            if (product.equals("coffee")){
                total = 0.40 * quantity;
            }else if (product.equals("water")) {
                total = 0.70 * quantity;
            }else if (product.equals("beer")) {
                total = 1.15 * quantity;
            }else if (product.equals("sweets")) {
                total = 1.30 * quantity;
            }else if (product.equals("peanuts")) {
                total = 1.50 * quantity;
            }
        }else  if (town.equals("Varna")){
            if (product.equals("coffee")){
                total = 0.45 * quantity;
            }else if (product.equals("water")) {
                total = 0.70 * quantity;
            }else if (product.equals("beer")) {
                total = 1.10 * quantity;
            }else if (product.equals("sweets")) {
                total = 1.35 * quantity;
            }else if (product.equals("peanuts")) {
                total = 1.55 * quantity;
            }
        }

        System.out.println(total);
    }
}
