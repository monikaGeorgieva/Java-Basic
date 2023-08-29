import java.util.Scanner;

public class fishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int  hight = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = length * width * hight;
        double volumeLiters = volume * 0.001;
        double total = volumeLiters * (1 - percent/100 );
        System.out.println(total);

    }
}
