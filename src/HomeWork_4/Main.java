package HomeWork_4;

public class Main {
    public static void main(String[] args) {

        int a = Inputs.firstOperand();
        char symbol = Inputs.action();
        Inputs.secondPhrase(symbol);
        int b = Inputs.secondOperand(symbol);


        Inputs.resultPhrase(symbol);

        System.out.print(CalculationsMethods.calculate(a, b, symbol));




    }
}
