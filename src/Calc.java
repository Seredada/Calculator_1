import java.util.Scanner;

public class Calc {
    public void calcul() {

        double rezul;
        double operand1;
        double operand2;
        char operation;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первуй цифру: ");
        operand1 = scanner.nextDouble();
        System.out.print("Введите действие + - * /: ");
        operation = scanner.next().charAt(0);
        System.out.print("Введите вторую цифру: ");
        operand2 = scanner.nextDouble();

        switch (operation){
            case '+': rezul = operand1 + operand2;
                break;

            case '-': rezul = operand1 - operand2;
                break;

            case '*': rezul = operand1 * operand2;
                break;

            case '/': rezul = operand1 / operand2;
                break;

            default:
                System.out.println("Неправильно ввел действие");
                return;
        }

        System.out.print( operand1 + " " + operation + " " + operand2 + " = ");

        System.out.printf("%.3f",rezul);

    }

}

