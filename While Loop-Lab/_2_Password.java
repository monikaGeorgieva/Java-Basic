import java.util.Scanner;

public class _2_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String input = scanner.nextLine();

        while (!password.equals(input)){
            input = scanner.nextLine();
        }
        System.out.printf("Welcome %s!\n",username);
    }
}
//вход:
//Nakov
//1234
//pass
//1324
//1234
