import java.util.Scanner;

public class timePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int hourInput = Integer.parseInt(scanner.nextLine());
       int minutesInpus = Integer.parseInt(scanner.nextLine());

       int hour = hourInput * 60;
       int minutes = minutesInpus + 15;
       int total = hour + minutes;

       int printHour = total / 60;
       int printMinutes = total % 60;

       if (printHour == 24){
           printHour = 0;
       }
        if (printMinutes < 10){
            System.out.printf("%d:0%d",printHour,printMinutes);
        }else {
            System.out.printf("%d:%d",printHour,printMinutes);
        }


       }


    }

