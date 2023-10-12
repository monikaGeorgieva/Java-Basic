import java.util.Scanner;

public class _4_FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double totalFoodQuantity = Double.parseDouble(scanner.nextLine());
        double totalFoodDog = 0.00;
        double totalFoodCat = 0.00;
        double biscuit = 0.00;
        for (int currentDay = 1; currentDay <= days; currentDay++) {
            int countDogFood = Integer.parseInt(scanner.nextLine());
            int countCatFood = Integer.parseInt(scanner.nextLine());
            totalFoodDog += countDogFood;
            totalFoodCat += countCatFood;

                if (currentDay % 3 == 0 ) {
                    biscuit  += (countCatFood + countDogFood) * 0.10;
                }
        }
        double totalFood = totalFoodCat + totalFoodDog;
        System.out.printf("Total eaten biscuits: %dgr.\n",Math.round(biscuit));
        System.out.printf("%.2f%% of the food has been eaten.\n",(totalFood / totalFoodQuantity) * 100);
        System.out.printf("%.2f%% eaten from the dog.\n",(totalFoodDog /totalFood) * 100 );
        System.out.printf("%.2f%% eaten from the cat.\n",(totalFoodCat / totalFood) * 100);
    }
}
