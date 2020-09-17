package ThirdHomework;

public class CalculatorWithMathCopy implements ICalc {
    public double div(double x, double y) {
        return x / y;
    }

    public double add(double x, double y) {
        return x * y;
    }

    public double minus(double x, double y) {
        return x - y;
    }

    public double plus(double x, double y) {
        return x + y;
    }

    public double pow(double x, int y) {
        return Math.pow(x, y);
    }

    public double abs(double x) {
        return Math.abs(x);
    }

    public int root(int x) {
        return (int) Math.sqrt(x);
    }
}
