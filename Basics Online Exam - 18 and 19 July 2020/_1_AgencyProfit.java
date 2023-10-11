import java.util.Scanner;

public class _1_AgencyProfit {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        //5. Цената на такса обслужване - реално число в диапазона [10.0…50.0]

        String nameAvioCompany = scanner.nextLine();
        int  countAdultTockets = Integer.parseInt(scanner.nextLine());
        int  countChildTickets = Integer.parseInt(scanner.nextLine());
        double priceAdultTicket = Double.parseDouble(scanner.nextLine());
        double taxPrice = Double.parseDouble(scanner.nextLine());

        double priceChildTicket = priceAdultTicket - (priceAdultTicket * 0.70);
        double adultTicketPriceWtax = priceAdultTicket + taxPrice;
        double childTicketPriceWtax = priceChildTicket + taxPrice;

        double totalPriceTicket = (countChildTickets * childTicketPriceWtax) + (countAdultTockets * adultTicketPriceWtax);
        double profit = (totalPriceTicket * 0.20);
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",nameAvioCompany,profit);



    }
}
