import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDogFood = Integer.parseInt(scanner.nextLine());
        int countCatsFood = Integer.parseInt(scanner.nextLine());

        double total = countDogFood * 2.50 + countCatsFood * 4;
        System.out.printf("%.1f lv.",total);
    }
}
