import java.util.Scanner;

public class _8_TennisRanklist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int tournamentPoints = 0;
        int tournamentWin = 0;
        for (int i = 0; i < tournaments ; i++) {
            String placeCurrentTournament = scanner.nextLine();
            switch (placeCurrentTournament){
                case "W":
                    tournamentPoints += 2000;
                    tournamentWin++;
                    break;
                case  "F":
                    tournamentPoints += 1200;
                    break;
                case  "SF":
                    tournamentPoints += 720;
                    break;
            }
        }
        int totalPoints = tournamentPoints + initialPoints;
        double averagePoints = tournamentPoints * 1.00 / tournaments;
        double persentWins = (tournamentWin * 1.00 / tournaments) * 100;

        System.out.printf("Final points: %d\n",totalPoints);
        System.out.printf("Average points: %.0f\n",Math.floor(averagePoints));
        System.out.printf("%.2f%%\n",persentWins);
    }
}
//5
//1400
//F
//SF
//W
//W
//SF
