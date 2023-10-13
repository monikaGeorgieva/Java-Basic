import java.util.Scanner;

public class _3_EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Първи ред - дестинация - текст "France", "Italy" или "Germany"
        // Втори ред - дати,  - текст с възможности "21-23",
        //"24-27" или "28-31"
        // Трети ред - брой нощувки - цяло число в интервала [1… 100]

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        if (destination.equals("France")){
            switch (dates){
                case "21-23":
                    totalPrice = days * 30;
                    break;
                case  "24-27":
                    totalPrice = days * 35;
                    break;
                case  "28-31":
                    totalPrice = days * 40;
                    break;
            }

        }else if (destination.equals("Italy")){
            switch (dates){
                case "21-23":
                    totalPrice = days * 28;
                    break;
                case  "24-27":
                    totalPrice = days * 32;
                    break;
                case  "28-31":
                    totalPrice = days * 39;
                    break;
            }
        } else if (destination.equals("Germany")) {
            switch (dates){
                case "21-23":
                    totalPrice = days * 32;
                    break;
                case  "24-27":
                    totalPrice = days * 37;
                    break;
                case  "28-31":
                    totalPrice = days * 43;
                    break;
            }
        }
        System.out.printf("Easter trip to %s : %.2f leva.",destination,totalPrice);

    }
}
