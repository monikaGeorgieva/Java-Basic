import java.util.Scanner;

public class _7_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int min = Integer.MAX_VALUE;

        while (!input.equals("Stop")){
            int currentNumber = Integer.parseInt(input);
            if (min > currentNumber){
                min = currentNumber;
            }
            input = scanner.nextLine();
        }
        System.out.println(min);
    }
}
//Вход
//100
//99
//80
//70
//Stop