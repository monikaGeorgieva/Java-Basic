import java.util.Scanner;

public class evenPowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //четни степени: 0 до n -> 2,4,6
        // повтарям : отпечатвам 2 на степен 
        //начало: 0
        // край n
        // промяна : +2

        for (int i = 0; i <= n; i += 2) {
            System.out.println(Math.pow(2,i));
        }
    }
}
