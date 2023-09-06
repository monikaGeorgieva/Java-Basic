import java.util.Scanner;

public class newHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFlowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budjet = Integer.parseInt(scanner.nextLine());

        double total = 0;
        if (typeFlowers.equals("Roses")){
            total = countFlowers * 5;
            if (countFlowers > 80){
                total = total - (total * 0.1);
            }

        } else if (typeFlowers.equals("Dahlias")) {
            total = countFlowers * 3.80;
            if (countFlowers > 90) {
                total = total -(total * 0.15);
            }

        } else if (typeFlowers.equals("Tulips")) {
            total = countFlowers * 2.80;
            if (countFlowers > 80){
                total = total - total * 0.15;
            }

        } else if (typeFlowers.equals("Narcissus")) {
            total = countFlowers * 3;
            if (countFlowers < 120 ){
                total = total + total * 0.15;
            }
        }else if (typeFlowers.equals("Gladiolus")){
            total = countFlowers * 2.50;
            if (countFlowers < 80){
                total = total + (total * 0.20);
            }
        }


        if (budjet >= total){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",countFlowers,typeFlowers,budjet - total);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",total - budjet);
        }
    }
}