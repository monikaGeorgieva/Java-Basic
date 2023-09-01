import java.util.Scanner;

public class lunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = (scanner.nextLine());
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime / 8.00;
        double relaxtime = breakTime / 4.00;

        double totalRelaxTime = breakTime - lunchTime - relaxtime;
        if (totalRelaxTime >= episodeTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",movieName,Math.ceil(totalRelaxTime - episodeTime));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",movieName,Math.ceil(episodeTime - totalRelaxTime));
        }
    }
}
