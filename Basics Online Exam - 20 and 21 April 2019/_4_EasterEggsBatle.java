import java.util.Scanner;

public class _4_EasterEggsBatle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggsFirstPlayer = Integer.parseInt(scanner.nextLine());
        int eggsSecondPlayer = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("End")){
            switch (input){
                case "one":
                    eggsSecondPlayer -= 1;
                    break;
                case  "two":
                    eggsFirstPlayer -= 1;
                    break;
            }
             if (eggsFirstPlayer == 0 ){
                 System.out.printf("Player one is out of eggs. Player two has %d eggs left.",eggsSecondPlayer);
                 return;
             } else if (eggsSecondPlayer == 0) {
                 System.out.printf("Player two is out of eggs. Player one has %d eggs left.",eggsFirstPlayer);
                 return;
             }
            input=scanner.nextLine();
        }
        System.out.printf("Player one has %d eggs left.\n",eggsFirstPlayer);
        System.out.printf("Player two has %d eggs left.\n",eggsSecondPlayer);
    }
}
