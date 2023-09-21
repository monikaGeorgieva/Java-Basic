import java.util.Scanner;

public class _5_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOpenTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countOpenTabs ; i++) {
            String webPage = scanner.nextLine();
            switch (webPage){
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0){
                System.out.println("You have lost your salary.");
                return;
            }
        }
        System.out.printf("%d",salary);
    }
}
