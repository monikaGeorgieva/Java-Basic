import java.util.Scanner;

public class operationBetweenNumMoni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();


        if (n2 == 0 && (operator.equals("/") || operator.equals("%"))){
            System.out.printf("Cannot divide %d by zero",n1);
            return;
        }

        double total = 0.00;
        String oddOrEven = "";

        if (operator.equals("+")){
            total = n1 + n2;
            if (total % 2 == 0){
                oddOrEven = "even";
            }else{
                oddOrEven = "odd";
            }
        } else if (operator.equals("-")) {
            total = n1 - n2;
            if (total % 2 == 0){
                oddOrEven = "even";
            }else{
                oddOrEven = "odd";
            }
        }else if (operator.equals("*")){
            total = n1  * n2;
            if (total % 2 == 0){
                oddOrEven = "even";
            }else{
                oddOrEven = "odd";
            }
        } else if (operator.equals("/")) {
            total = n1 * 1.0 / n2;
        } else if (operator.equals("%")) {
            total = n1 % n2;
        }

        if (operator.equals("+")|| operator.equals("-") || operator.equals("*")){
            System.out.printf("%d %s %d = %.0f - %s",n1,operator,n2,total,oddOrEven);
        }else if(operator.equals("/")){
            System.out.printf("%d %s %d = %.2f",n1,operator,n2,total);
        } else if (operator.equals("%")) {
            System.out.printf("%d %s %d = %.0f",n1,operator,n2,total);
        }
    }
}
