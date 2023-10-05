import java.util.Scanner;

public class _1_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int current = 1;
        for (int row = 1; row <= n; row++) {
            for (int colum = 1; colum <= row ; colum++) {
                System.out.print(current + " ");
                if (current == n){
                   return;
                }
                current++;
            }
            System.out.println();
        }
    }
}
//1
//2 3
//4 5 6
//7
