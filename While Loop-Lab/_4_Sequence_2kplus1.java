import java.util.Scanner;

public class _4_Sequence_2kplus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        // 1 до n,което  се променя --> * 2 + 1
        //повтаряме: отпечатваме число
        //начало: 1
        // стоп : n
        // продължаваме: * 2 + 1

//        for (int i = 1;i <= n; i = i * 2 + 1){
//            System.out.println(i);
//        }

        int number = 1;
        while (number <= n){
            System.out.println(number);
            number = number * 2 + 1;
        }
    }
}
