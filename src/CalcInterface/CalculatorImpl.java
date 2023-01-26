package CalcInterface;

public class CalculatorImpl implements Calculator {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {

        if (b == 0) {
            System.out.println("You can't divide by zero");
            return 0;
        }
        return a / b;
    }
}
