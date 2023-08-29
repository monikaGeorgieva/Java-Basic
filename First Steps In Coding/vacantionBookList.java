import java.util.Scanner;

public class vacantionBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPages = Integer.parseInt(scanner.nextLine());
        int pagesForHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int total = (totalPages / pagesForHour) / days;
        System.out.println(total);
    }
}
