import java.util.Scanner;

public class bonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startPoints = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        if (startPoints <= 100){
            bonus+=5;
        }else if (startPoints > 100 && startPoints < 1000){
            bonus = startPoints * 0.20;
        }else if (startPoints > 1000){
            bonus = startPoints * 0.10;
        }
        if (startPoints % 2 == 0){
            bonus += 1;
        }else if (startPoints % 10 == 5){
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(bonus + startPoints);
    }
}
