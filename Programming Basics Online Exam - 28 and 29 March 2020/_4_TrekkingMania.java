import java.util.Scanner;

public class _4_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGroup = Integer.parseInt(scanner.nextLine());
        int countMusala = 0;
        int countMonblan = 0;
        int countKilimandjaro = 0;
        int countK2 = 0;
        int countEverest = 0;
        int totalCount = 0;
        for (int i = 1; i <= countGroup ; i++) {
            int countPeopleInGroup = Integer.parseInt(scanner.nextLine());
            if (countPeopleInGroup <= 5){
                countMusala += countPeopleInGroup;
                totalCount += countPeopleInGroup;
            } else if (countPeopleInGroup >= 6 && countPeopleInGroup <= 12) {
                countMonblan += countPeopleInGroup;
                totalCount += countPeopleInGroup;
            } else if (countPeopleInGroup >= 13 && countPeopleInGroup <= 25) {
                countKilimandjaro += countPeopleInGroup;
                totalCount += countPeopleInGroup;
            } else if (countPeopleInGroup >= 26 && countPeopleInGroup <= 40) {
                countK2 += countPeopleInGroup;
                totalCount += countPeopleInGroup;
            } else if (countPeopleInGroup >= 41) {
                countEverest += countPeopleInGroup;
                totalCount += countPeopleInGroup;
            }
        }
        System.out.printf("%.2f%%\n",(countMusala * 1.00)/ totalCount* 100);
        System.out.printf("%.2f%%\n",(countMonblan * 1.00)/ totalCount* 100);
        System.out.printf("%.2f%%\n",(countKilimandjaro * 1.00)/ totalCount* 100);
        System.out.printf("%.2f%%\n",(countK2 * 1.00)/ totalCount* 100);
        System.out.printf("%.2f%%\n",(countEverest * 1.00)/ totalCount* 100);

    }
}
