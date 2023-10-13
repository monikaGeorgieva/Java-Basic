import java.util.Scanner;

public class _5_EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countEggs = Integer.parseInt(scanner.nextLine());

        int countRed = 0;
        int countOrange = 0;
        int countBlue = 0;
        int countGreen = 0;
        int max = Integer.MIN_VALUE;
        String currentColor = "";
        for (int i = 1; i <= countEggs ; i++) {
            String colors = scanner.nextLine();
            switch (colors){
                case "red":
                    countRed++;
                    break;
                case  "orange":
                    countOrange++;
                    break;
                case  "blue":
                    countBlue++;
                    break;
                case  "green":
                    countGreen++;
                    break;
            }
        }
        if (max < countRed){
            max = countRed;
            currentColor = "red";
        }
        if (max < countOrange) {
            max = countOrange;
            currentColor = "orange";
        }
        if (max < countBlue) {
            max = countBlue;
            currentColor = "blue";
        }
        if (max < countGreen) {
            max = countGreen;
            currentColor = "green";
        }
        System.out.printf("Red eggs: %d\n",countRed);
        System.out.printf("Orange eggs: %d\n",countOrange);
        System.out.printf("Blue eggs: %d\n",countBlue);
        System.out.printf("Green eggs: %d\n",countGreen);
        System.out.printf("Max eggs: %d -> %s\n",max,currentColor);
    }
}
