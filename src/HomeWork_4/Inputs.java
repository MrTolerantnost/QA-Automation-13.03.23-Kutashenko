package HomeWork_4;

import java.util.Scanner;

public class Inputs {

    static Scanner scanner = new Scanner(System.in);

    // This method prompts the user to input the first operand and returns it as an integer
    public static int firstOperand() {
        System.out.println("Please input first operand");
        int firstOperand = scanner.nextInt();
        return firstOperand;
    }

    // This method prompts the user to input the second operand and checks if it's 0 for division operations.
    // If the second operand is 0, it prompts the user to input a valid value and returns it as an integer
    public static int secondOperand(char symbol) {
        int secondOperand = scanner.nextInt();
        if (symbol == '/') {
            while (secondOperand == 0) {
                System.out.println("Division by zero is forbidden. Please enter a valid value except 0");
                secondOperand = scanner.nextInt();
            }
        }
        return secondOperand;
    }

    // This method prompts the user to input the mathematical operation and returns it as a char
    public static char action() {
        System.out.println("Please input mathematical operation");
        char action = scanner.next().charAt(0);
        return action;
    }

    // This method displays a message asking for the second operand based on the mathematical operation provided as a parameter
    public static void secondPhrase(char symbol) {
        switch (symbol) {
            case '+':
                System.out.println("Input second operand to calculate sum of both");
                break;
            case '-':
                System.out.println("Input second operand to calculate difference between them except 0");
                break;
            case '*':
                System.out.println("Input second operand to calculate multiplication");
                break;
            case '/':
                System.out.println("Input second operand to calculate division");
                break;
            case '%':
                System.out.println("Input second operand to calculate percentage of first");
                break;
        }
    }

    // This method displays a message indicating the result of the mathematical operation performed based on the mathematical operation provided as a parameter
    public static void resultPhrase(char symbol) {
        switch (symbol) {
            case '+':
                System.out.print("The sum of both operands = ");
                break;
            case '-':
                System.out.print("Difference between two operands = ");
                break;
            case '*':
                System.out.print("Result of multiplication of two operands = ");
                break;
            case '/':
                System.out.print("Result of division =  ");
                break;
            case '%':
                System.out.print("Result = ");
                break;
        }
    }
}