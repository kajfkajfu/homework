package ThirdHomework;

public class CalculatorWithOperator implements ICalc {

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
        double result = 1;
        for (int i = 1; i < y; i++) {
            result = x * x;
        }
        return result;
    }

    public double abs(double x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }

    public int root(int x) {
        int root = 1;
        while (root * root <= x) {
            root++;
        }
        return --root;
    }
}
