import java.util.Scanner;

public class _1_ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            System.out.printf("%s\n",input);
            input = scanner.nextLine();
        }
    }
}

//Sofia
//Berlin
//Moscow
//Athens
//Madrid
//London
//Paris
//Stop
//
