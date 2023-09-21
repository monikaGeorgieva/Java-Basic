import java.util.Scanner;

public class _6_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int judgersCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < judgersCount ; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
            //Точките, които актьора получава: дължината
            // на името на оценявщия умножено по точките, които дава делено на две.

            points += judgeName.length() * judgePoints / 2;

            if (points > 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,points);
                return;
            }
        }

        System.out.printf("Sorry, %s you need %.1f more!",actorName,1250.5 - points);

    }
}
/*
Zahari Baharov
205
4
Johnny Depp
45
Will Smith
29
Jet Lee
10
Matthew Mcconaughey
39
 */