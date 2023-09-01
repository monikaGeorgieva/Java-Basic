import java.util.Scanner;

class sumSeconds{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int seccond = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int total = first + seccond + third;
        int minutes = total / 60;
        int seconds = total % 60;

        if (seconds > 10){
            System.out.printf("%d:%d",minutes,seconds);
        }else{
            System.out.printf("%d:0%d",minutes,seconds);
        }
    }
}