import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeTicets = scanner.nextLine();
        double row = Double.parseDouble(scanner.nextLine());
        double colon = Double.parseDouble(scanner.nextLine());
        double total = 0;
        if (typeTicets.equals("Premiere")){
            total = row * colon * 12.00;
        } else if (typeTicets.equals("Normal")) {
            total = row * colon * 7.50;
        } else if (typeTicets.equals("Discount")) {
            total = row * colon * 5.00;
        }
        System.out.printf("%.2f leva",total);
    }
}
