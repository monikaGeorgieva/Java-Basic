import java.util.Scanner;

public class _1_BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rentRoom = Double.parseDouble(scanner.nextLine());
        double cake = rentRoom * 0.20;
        double drinks = cake - (cake * 0.45);
        double priceAnimator = (rentRoom * 1/3);

        double total = rentRoom + cake + drinks + priceAnimator;
        System.out.printf("%.1f",total);

    }
}
