import java.util.Scanner;

public class _3_combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
      // x1 + x2 + x3 = n
        int validCombinations = 0;
        for (int x1 = 0; x1 <= n ; x1++) {
            for (int x2 = 0; x2 <= n ; x2++) {
                for (int x3 = 0; x3 <= n ; x3++) {
                    int total = x1 + x2 + x3;
                  if (total == n){
                      validCombinations++;
                  }

                }
            }
        }
        System.out.printf("%d",validCombinations);
    }
}
//25 --- > 351
