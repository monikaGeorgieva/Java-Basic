import java.util.Scanner;

public class projectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int numProjects = Integer.parseInt(scanner.nextLine()) ;
        int hourCoplete = numProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s."
                ,name,hourCoplete,numProjects);
    }
}
