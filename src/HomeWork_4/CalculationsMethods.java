package HomeWork_4;

public class CalculationsMethods {

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

                result = (((float)a / 100) * b);
                break;


        }
        return (result);
    }
}
