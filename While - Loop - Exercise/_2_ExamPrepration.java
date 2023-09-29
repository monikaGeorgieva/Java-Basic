import java.util.Scanner;

public class _2_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failedTaskAvailability = Integer.parseInt(scanner.nextLine());
        int failedTaks = 0;
        int tasks = 0; //всички задачи които той решел
        double totalGrades = 0.00;
        String lastProblem = "";
        //Начална стойност
        String taskName = scanner.nextLine();
        //Условие за край
        while (!taskName.equals("Enough")){
            int mark = Integer.parseInt(scanner.nextLine());
            tasks++;
            totalGrades += mark;

            if (mark <= 4){
                failedTaks++;

                if (failedTaks == failedTaskAvailability){
                    System.out.printf("You need a break, %d poor grades.",failedTaks);
                    return;
                }
            }
            lastProblem = taskName;
            //Стъпка напред
            taskName = scanner.nextLine();
        }
        // "Number of problems: {броя на всички задачи}"
        //"Last problem: {името на последната задача}"


        System.out.printf("Average score: %.2f\n",totalGrades/tasks );
        System.out.printf("Number of problems: %d\n",tasks);
        System.out.printf("Last problem: %s\n",lastProblem);
    }
}
//Вход:
//2
//Income
//3
//Game Info
//6
//Best Player
//4
