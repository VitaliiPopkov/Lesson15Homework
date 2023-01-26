package CalcInterface;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        double res = calculator.add(10, 15);
        System.out.println(res);
    }
}