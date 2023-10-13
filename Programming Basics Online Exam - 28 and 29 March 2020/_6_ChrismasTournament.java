import java.util.Scanner;

public class _6_ChrismasTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  daysTournament = Integer.parseInt(scanner.nextLine());
        double totalWinMoney = 0;
        int countWinTotal = 0;
        int countLoseTotal = 0;

        for (int i = 1; i <= daysTournament; i++) {
            String typeGame = scanner.nextLine();
            int winMoney = 0;
            int countWin = 0;
            int countLoose = 0;
            while (!typeGame.equals("Finish")){
                String gameEnd = scanner.nextLine();
                switch (gameEnd){
                    case "win":
                        winMoney += 20;
                        countWin++;
                        countWinTotal ++;
                        break;
                    case  "lose":
                        countLoose++;
                        countLoseTotal++;
                        break;
                }
                typeGame = scanner.nextLine();
            }
            if (countWin > countLoose){
                winMoney += (winMoney * 0.10);
                totalWinMoney += winMoney;
            }else{
                totalWinMoney += winMoney;
            }
        }
            if (countWinTotal > countLoseTotal){
                totalWinMoney += totalWinMoney  * 0.20;
                System.out.printf("You won the tournament! Total raised money: %.2f",totalWinMoney);
            }else{
                System.out.printf("You lost the tournament! Total raised money: %.2f",totalWinMoney);
            }
    }
}
//2
//volleyball
//win
//football
//lose
//basketball
//win
//Finish
//golf
//win
//tennis
//win
//badminton
//win
//Finish
