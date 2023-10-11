import java.util.Scanner;

public class _5_BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFootballer = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        String bestPlayer = "";

        while (!nameFootballer.equals("END")){
            int goalScored = Integer.parseInt(scanner.nextLine());

            if (max < goalScored){
                max = goalScored;
                bestPlayer = nameFootballer;
            }
            if (max >= 10){
               break;
            }

            nameFootballer = scanner.nextLine();
        }

        if(max >= 3){
            System.out.printf("%s is the best player!\n",bestPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!",max);
        }else{
            System.out.printf("%s is the best player!\n",bestPlayer);
            System.out.printf("He has scored %d goals.",max);
        }

    }
}
//Neymar
//2
//Ronaldo
//1
//Messi
//3
//END
