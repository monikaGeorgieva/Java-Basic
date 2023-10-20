import java.util.Scanner;

public class _6_Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum1st = Integer.parseInt(scanner.nextLine());
        int secondNum1st = Integer.parseInt(scanner.nextLine());
        int firstNum2nd = Integer.parseInt(scanner.nextLine());
        int secondNum2nd = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = firstNum1st; i <= 8 ; i++) {
            if(count >= 6){
                break;
            }
            for (int j = 9; j >= secondNum1st ; j--) {
                if(count >= 6){
                    break;
                }
                for (int k = firstNum2nd; k <= 8 ; k++) {
                    if(count >= 6){
                        break;
                    }
                    for (int l = 9; l >= secondNum2nd ; l--) {

                        if(i % 2 == 0 && k % 2 == 0 && j % 2 != 0 && l % 2 != 0){
                            if(i!=k || j != l){
                                System.out.printf("%d%d - %d%d%n", i, j, k, l);
                                count++;
                            }
                            else{  System.out.println("Cannot change the same player.");}

                        }

                        if(count >= 6){
                            break;
                        }

                    }

                }

            }

        }
    }
}
