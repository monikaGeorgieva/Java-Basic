import java.util.Scanner;

public class _2_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int current = first; current <= second ; current++) {
            String numText = current + "";

            int evenSum = 0;
            int oddSum = 0;
            for (int position = 0; position < numText.length(); position++) {
                int currentDigit = Integer.parseInt(String.valueOf(numText.charAt(position)));
                if (position % 2 == 0){
                    evenSum += currentDigit;
                }else{
                    oddSum += currentDigit;
                }
            }
            if (evenSum == oddSum){
                System.out.print(current + " ");
            }
        }
    }
}
//Вход:
//100000
//100050