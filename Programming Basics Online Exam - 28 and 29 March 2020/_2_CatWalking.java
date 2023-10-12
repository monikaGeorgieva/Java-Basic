import java.util.Scanner;

public class _2_CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minWalking = Integer.parseInt(scanner.nextLine());
        int countWalks = Integer.parseInt(scanner.nextLine());
        int calloriesIntake = Integer.parseInt(scanner.nextLine());

        int totalTimeWallks = minWalking * countWalks;
        int calloriesBurnedPerDay = totalTimeWallks * 5;
        double enoughtColories = calloriesIntake  * 0.50;

        if (calloriesBurnedPerDay >= enoughtColories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",calloriesBurnedPerDay);
        }else{
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",calloriesBurnedPerDay);
        }
    }
}
