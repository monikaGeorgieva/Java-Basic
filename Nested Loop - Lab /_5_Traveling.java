import java.util.Scanner;

public class _5_Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameDestination = scanner.nextLine();

        while (!nameDestination.equals("End")){
            double budget = Double.parseDouble(scanner.nextLine());
            double saveMoney = 0;
            while (saveMoney < budget){
                double money = Double.parseDouble(scanner.nextLine());
                saveMoney += money;
            }
            System.out.printf("Going to %s!%n",nameDestination);
          nameDestination = scanner.nextLine();
        }
    }
}
//Вход
//Greece
//1000
//200
//200
//300
//100
//150
//240
//Spain
//1200
//300
//500
//193
//423
//End

//outPut:   Going to Greece!
//          Going to Spain!
