import java.util.Scanner;

public class _5_CareofPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodBoughtKg = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int totalFood = 0;
        while (!input.equals("Adopted")){
            int currentFoodAte = Integer.parseInt(input);
            totalFood += currentFoodAte;

            input = scanner.nextLine();
        }

        int foodGrams = foodBoughtKg * 1000;
        if (foodGrams >= totalFood){
            System.out.printf("Food is enough! Leftovers: %d grams.",foodGrams - totalFood);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.",totalFood - foodGrams);
        }
    }
}
