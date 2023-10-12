import java.util.Scanner;

public class _2_MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceHeWalk = Double.parseDouble(scanner.nextLine());
        double timeHeWalk1Meter = Double.parseDouble(scanner.nextLine());

        double totalTimeHeWalk = distanceHeWalk * timeHeWalk1Meter;
        double timeHeWalkSlope = (Math.floor(distanceHeWalk / 50)) * 30;
        double totalTime = totalTimeHeWalk + timeHeWalkSlope;


        if (totalTime < recordInSeconds){
            System.out.printf("Yes! The new record is %.2f seconds.",totalTime);
        }else{
            System.out.printf("No! He was %.2f seconds slower.",totalTime - recordInSeconds);
        }

    }
}
