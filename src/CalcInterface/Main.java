package CalcInterface;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        double res = calculator.divide(10, 2);
        System.out.println(res);
    }
}