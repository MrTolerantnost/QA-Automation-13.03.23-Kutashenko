package HomeWork_4;

public class CalculationsMethods {

    // This method performs the mathematical operation based on the two operands and the mathematical operation provided as parameters
    // The result is returned as a float
    public static float calculate(int a, int b, char symbol) {
        float result = 0;

        switch (symbol) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            case '%':
                // For percentage operation, the first operand is divided by 100 and then multiplied by the second operand
                result = (((float)a / 100) * b);
                break;
        }
        return (result);
    }
}