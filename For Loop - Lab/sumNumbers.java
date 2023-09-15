import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int sum = 0; // сума на въведените числа

        //повтаряме: въвеждаме стойноста на числото + съмиране
        // начаало: първото число (1)
        //края : последното число (n)
        //промяна: +1
        for (int i = 1; i <= a  ; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;
        }

        System.out.println(sum);


    }
}
