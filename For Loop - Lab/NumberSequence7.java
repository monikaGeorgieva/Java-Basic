import java.util.Scanner;

public class NumberSequence7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNum = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <=countNum ; i++) {
            int currentInteger = Integer.parseInt(scanner.nextLine());
            if (currentInteger > max){
                max = currentInteger;
            }else if (currentInteger < min ){
                min = currentInteger;
            }
        }
        System.out.println("Max number: " + max);
        System.out.printf("Min number: " + min);
    }
}
