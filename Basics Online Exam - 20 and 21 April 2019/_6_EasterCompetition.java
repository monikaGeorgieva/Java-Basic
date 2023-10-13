import java.util.Scanner;

public class _6_EasterCompetition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int easterBreads = Integer.parseInt(scanner.nextLine());

        int maxPoints = 0;
        String winner = "";

        for (int count = 1; count <= easterBreads; count++) {

            String bakerName = scanner.nextLine();
            int totalPoints = 0;

            String input = scanner.nextLine(); // "Stop" или число

            while (!input.equals("Stop")) {

                int points = Integer.parseInt(input); // превръщаме низа в цяло число!!!
                totalPoints += points;

                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", bakerName, totalPoints);

            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                winner = bakerName;
                System.out.printf("%s is the new number 1!%n", bakerName);
            }

        }
        System.out.printf("%s won competition with %d points!%n", winner, maxPoints);
    }
}
//3
//Chef Manchev
//10
//10
//10
//10
//Stop
//Natalie
//8
//2
//9
//Stop
//George
//9
//2
//4
//2
//Stop