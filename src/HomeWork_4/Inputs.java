package HomeWork_4;


import java.util.Scanner;


public class Inputs {

    static Scanner scanner = new Scanner(System.in);


    public static int firstOperand() {
        System.out.println("Please input first operand");
        int firstOperand = scanner.nextInt();
        return firstOperand;
    }

    public static int secondOperand(char symbol) {
        //System.out.println("Please input second operand");
        int secondOperand = scanner.nextInt();
        if (symbol == '/') {
            while (secondOperand == 0) {
                System.out.println("Division by zero is forbidden. Please enter valid value excep 0");
                secondOperand = scanner.nextInt();
            }
        }


        return secondOperand;
    }

    public static char action() {
        System.out.println("Please input mathematical operations");
        char action = scanner.next().charAt(0);
        return action;

    }

    public static void secondPhrase(char symbol) {

        switch (symbol) {
            case '+':
                System.out.println("Input second operand to calculate sum of both");
                break;
            case '-':
                System.out.println("Input second operand to calculate deference between them Except 0");
                break;
            case '*':
                System.out.println("Input second operand to calculate multiplication");
                break;
            case '/':
                System.out.println("Input second operand to calculate division");
                break;
            case '%':
                System.out.println("Input second operand to calculate percents of first");
                break;

        }

    }

    ;

    public static void resultPhrase(char symbol) {

        switch (symbol) {
            case '+':
                System.out.print("The sum of both operands = ");
                break;
            case '-':
                System.out.print("Deference between two operands = ");
                break;
            case '*':
                System.out.print("Result of multiplication this two operands = ");
                break;
            case '/':
                System.out.print("Result of division =  ");
                break;
            case '%':
                System.out.print("Result =");
                break;

        }

    }

    ;
}
