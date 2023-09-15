import java.util.Scanner;

public class vowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        /*
         буква  :a e i o u
         стойност :1 2 3 4 5
        */
        int sum = 0; //сума от гласните букви
        for (int i = 0; i <= text.length() - 1 ; i++) {
            char currentLetter = text.charAt(i);
            /* буквата намираща
             се на тази позиция i
             */
            switch (currentLetter){
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;

            }

        }
        System.out.println(sum);

    }
}
