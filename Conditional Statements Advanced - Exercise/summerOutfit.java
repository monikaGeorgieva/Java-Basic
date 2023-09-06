import java.util.Scanner;

public class summerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degreese = Double.parseDouble(scanner.nextLine());
       String typeDay = scanner.nextLine();
       String outfit = "";
       String shoes = "";

       if (degreese >= 10 && degreese <= 18){
           if (typeDay.equals("Morning")){
               outfit = "Sweatshirt";
               shoes = "Sneakers";
           } else if ((typeDay.equals("Afternoon")) || (typeDay.equals("Evening"))) {
               outfit = "Shirt";
               shoes = "Moccasins";
           }
       } else if (degreese > 18 && degreese <= 24) {
           if (typeDay.equals("Morning")){
               outfit = "Shirt";
               shoes = "Moccasins";
           } else if (typeDay.equals("Afternoon")) {
               outfit = "T-Shirt";
               shoes = "Sandals";
           } else if (typeDay.equals("Evening")) {
               outfit = "Shirt";
               shoes = "Moccasins";
           }
       } else if (degreese >= 25) {
           if (typeDay.equals("Morning")){
               outfit = "T-Shirt";
               shoes = "Sandals";
           } else if (typeDay.equals("Afternoon")) {
               outfit = "Swim Suit";
               shoes = "Barefoot";
           } else if (typeDay.equals("Evening")) {
               outfit = "Shirt";
               shoes = "Moccasins";
           }
       }
        System.out.printf("It's %.0f degrees, get your %s and %s.",degreese,outfit,shoes);
    }
}
