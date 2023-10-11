import java.util.Scanner;

public class _4_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     //   1. От конзолата се чете 1 цяло число N, което е броят на топките в диапазон (0-1000).
      //  2. След това се четат N на брой цветове.
        int countBalls = Integer.parseInt(scanner.nextLine());
        double totalPoints = 0;
        int countRed = 0;
        int countOrange = 0;
        int countYellow = 0;
        int countWhite = 0;
        int countOther = 0;
        int countDividesBlack = 0;

        for (int i = 1; i <= countBalls; i++) {
            String color = scanner.nextLine();
            switch (color){
                case "red":
                    countRed++;
                    totalPoints += 5;
                    break;
                case "orange":
                    countOrange++;
                    totalPoints += 10;
                    break;
                case "yellow":
                    countYellow++;
                    totalPoints += 15;
                    break;
                case  "white":
                    countWhite++;
                    totalPoints += 20;
                    break;
                case "black":
                    countDividesBlack++;
                    totalPoints = Math.floor(totalPoints  / 2);
                    break;
                default:
                    countOther++;
            }
        }
        System.out.printf("Total points: %.0f\n",totalPoints);
        System.out.printf("Red balls: %d\n",countRed);
        System.out.printf("Orange balls: %d\n",countOrange);
        System.out.printf("Yellow balls: %d\n",countYellow);
        System.out.printf("White balls: %d\n",countWhite);
        System.out.printf("Other colors picked: %d\n",countOther);
        System.out.printf("Divides from black balls: %d\n",countDividesBlack);
    }
}
