import java.util.Scanner;

public class _1_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favouriteBook = scanner.nextLine();
        int checkedBooks = 0;
        String books = scanner.nextLine();

       while (!books.equals("No More Books")){

           if (books.equals(favouriteBook)){
               System.out.printf("You checked %d books and found it.",checkedBooks);
               return;
           }
           checkedBooks++;
           books = scanner.nextLine();
       }
        System.out.println("The book you search is not here!");
        System.out.printf("You checked %d books.", checkedBooks);
    }
}
