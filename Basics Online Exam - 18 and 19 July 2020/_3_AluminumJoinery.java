import java.util.Scanner;

public class _3_AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String pvcKind = scanner.nextLine();
        String delivery = scanner.nextLine();
        double sum = 0;

        if (count < 10) {
            System.out.println("Invalid order");
            return;
        }

        switch (pvcKind) {
            case "90X130":
                sum = count * 110;
                if (count > 30 && count <= 60) {
                    sum -=  sum * 0.05;
                } else if (count > 60) {
                    sum *= 0.92;
                }
                break;
            case "100X150":
                sum = count * 140;
                if (count > 40 && count <= 80) {
                    sum *= 0.94;
                } else if (count > 80) {
                    sum *= 0.90;
                }
                break;
            case "130X180":
                sum = count * 190;
                if (count > 20 && count <= 50) {
                    sum *= 0.93;
                } else if (count > 50) {
                    sum *= 0.88;
                }
                break;
            case "200X300":
                sum = count * 250;
                if (count > 25 && count <= 50) {
                    sum *= 0.91;
                } else if (count > 50) {
                    sum *= 0.86;
                }
                break;
        }

        if (delivery.equals("With delivery")) {
            sum += 60;

        }
        if (count > 99) {
            sum -= sum * 0.04;
        }
        System.out.printf("%.2f BGN", sum);
    }
}

//40
//90X130
//Without delivery
