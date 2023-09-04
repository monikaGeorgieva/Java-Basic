import java.util.Scanner;

public class animalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.next();

        switch (animal){
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
            case "tortoise":
            case "crocodile":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}
