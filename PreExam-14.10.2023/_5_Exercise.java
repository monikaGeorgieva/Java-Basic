import java.util.Scanner;

public class _5_Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = 8848;
        int countDays = 1;
        int totalWalked = 5364;
        String input = scanner.nextLine();
        while (!input.equals("END")){
            if (input.equals("Yes")){
                countDays += 1;
            }
            int walkedMeters = Integer.parseInt(scanner.nextLine());

            if (countDays > 5){
                System.out.println("Failed!");
                System.out.printf("%d",totalWalked);
                break;
            }
            totalWalked += walkedMeters;
              if (totalWalked >= end){
                  System.out.printf("Goal reached for %d days!",countDays);
                  break;
              }


            input = scanner.nextLine();
        }
        if (input.equals("END")){
            System.out.println("Failed!");
            System.out.printf("%d",totalWalked);
        }
    }
}
