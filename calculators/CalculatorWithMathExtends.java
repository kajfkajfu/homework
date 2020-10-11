package calculators;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalc {

    @Override
    public double pow(double x, int y) {
        return Math.pow(x,y);
    }

    @Override
    public double abs(double x) {
        return Math.abs(x);
    }

    @Override
    public int root(int x) {
        return (int) Math.sqrt(x);
    }
}
