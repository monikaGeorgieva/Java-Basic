import java.util.Scanner;

public class _6_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;

        while (!input.equals("Stop")){
            int currentNumber = Integer.parseInt(input);
            if (max < currentNumber){
                max = currentNumber;
            }
            input = scanner.nextLine();
        }
        System.out.println(max);
    }
}
//Вход
//100
//99
//80
//70
//Stop
