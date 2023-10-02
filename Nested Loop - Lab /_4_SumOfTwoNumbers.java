import java.util.Scanner;

public class _4_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beggining = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int countCombination = 0;
        for (int i = beggining; i <= endInterval ; i++) {
            for (int j = beggining; j <= endInterval ; j++) {
                countCombination++;
                int total = i + j;
                if (total == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)",countCombination,i,j,total);
                    return;
                }
            }

        }
        System.out.printf("%d combinations - neither equals %d",countCombination,magicNumber);
    }
}
//вход
//1
//10
//5
//Combination N:4 (1 + 4 = 5)
