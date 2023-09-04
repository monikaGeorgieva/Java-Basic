import java.util.Scanner;

public class weekendOrWorkingDay {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String day = scanner.nextLine();
    switch (day){
        case "Monday":
        case "Tuesday":
        case "Wednesday":
        case "Thursday":
        case "Friday":
            System.out.println("Working day");
            break;
        case "Saturday":
            System.out.println("Weekend");
            break;
        case "Sunday":
            System.out.println("Weekend");
            break;
        default:
            System.out.println("Error");
        }
    }
}
