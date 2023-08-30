import java.util.Scanner;

public class areaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double sideA = Double.parseDouble(scanner.nextLine());
        if (figure.equals("square")){
            double total = sideA * sideA;
            System.out.printf("%.3f",total);
        }else if (figure.equals("circle")){
            double total = Math.PI * sideA*sideA;
            System.out.printf("%.3f",total);
        }else if(figure.equals("rectangle")){
            double sideB = Double.parseDouble(scanner.nextLine());
            double total = (sideB * sideA);
            System.out.printf("%.3f",total);
        }else if (figure.equals("triangle")){
           double sideB = Double.parseDouble(scanner.nextLine());
           double total = (sideA * sideB)/2;
           System.out.printf("%.3f",total);
        }
    }
}
