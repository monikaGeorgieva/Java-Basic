import java.util.Scanner;

public class _5_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double increase = 0.00;
        double sum = 0.00;

        while (!command.equals("NoMoreMoney")){
            increase = Double.parseDouble(command);
            if (increase < 0 ){
                break;
            }
            sum += increase;
            System.out.printf("Increase: %.2f\n",increase);
            command = scanner.nextLine();
        }
        if (increase < 0){
            System.out.println("Invalid operation!");
        }
        System.out.printf("Total: %.2f",sum);
    }
}
