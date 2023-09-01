import java.util.Scanner;

public class worldSwimmingReccord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeHeSwimMeter = Double.parseDouble(scanner.nextLine());


        double distanceNeededToSwim = distanceInMeters * timeHeSwimMeter;
        double addedTime = Math.floor(distanceInMeters / 15) * 12.5;
        double totalTime = distanceNeededToSwim + addedTime;
        if (recordSeconds <= totalTime){
            double dif = totalTime - recordSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.",dif);

        }else {
            double total = distanceNeededToSwim  + addedTime;
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",total);
        }



    }
}
