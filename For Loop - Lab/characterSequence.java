import java.util.Scanner;

public class characterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

//        System.out.println(word.charAt(0));
//        System.out.println(word.charAt(word.length() - 1));

        //позиции : 0 до последната (дъльината - 1)
        // повтаряме : отпечатваме символа на дадена позиция
        // начало: 0
        // край : дължината
        // промяната: +1
        for (int i = 0; i <= word.length() - 1; i++) {
            System.out.println(word.charAt(i));
        }
    }
}

