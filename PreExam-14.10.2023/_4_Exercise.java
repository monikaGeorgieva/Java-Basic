import java.util.Scanner;

public class _4_Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countSudents = Integer.parseInt(scanner.nextLine());
        int countGroup1 = 0;
        int countGroup2 = 0;
        int countGroup3 = 0;
        int countGroup4 = 0;
        double totalGrade = 0;
        for (int counter = 1; counter <= countSudents ; counter++) {
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade >= 2.00 && currentGrade < 3.00){
                countGroup4++;
                totalGrade += currentGrade;
            } else if (currentGrade >= 3.00 && currentGrade <= 3.99) {
                countGroup3++;
                totalGrade += currentGrade;
            } else if (currentGrade >= 4.00 && currentGrade <= 4.99) {
                countGroup2++;
                totalGrade += currentGrade;
            } else if (currentGrade >= 5.00) {
                countGroup1++;
                totalGrade += currentGrade;
            }
        }

        System.out.printf("Top students: %.2f%%\n",(countGroup1 * 1.00 / countSudents) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n",(countGroup2 * 1.00 / countSudents)*100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n",(countGroup3 * 1.00 / countSudents) * 100);
        System.out.printf("Fail: %.2f%%\n",(countGroup4 * 1.00 / countSudents) * 100);
        System.out.printf("Average: %.2f\n",totalGrade / countSudents);
    }
}
