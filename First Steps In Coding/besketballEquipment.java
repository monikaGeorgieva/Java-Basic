import java.util.Scanner;

public class besketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearFee = Integer.parseInt(scanner.nextLine());

        double trainers = yearFee - yearFee * 0.40;
        double tracksuit = trainers - trainers * 0.20;
        double ball = tracksuit * 1/4;
        double accesories = ball * 1/5;
        double total = yearFee+tracksuit + trainers + ball + accesories;
        System.out.println(total);
    }
}



