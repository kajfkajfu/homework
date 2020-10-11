package thirdHomework;

public class CalculatorWithCounter implements ICalc {

    private ICalc calc;
    private int counter = 0;

    public CalculatorWithCounter(ICalc calc) {
        this.calc = calc;
    }

    public double div(double x, double y) {
        this.counter++;
        return calc.div(x, y);
    }

    public double add(double x, double y) {
        this.counter++;
        return calc.add(x, y);
    }

    public double minus(double x, double y) {
        this.counter++;
        return calc.minus(x, y);
    }

    public double plus(double x, double y) {
        this.counter++;
        return calc.plus(x, y);
    }

    public double pow(double x, int y) {
        this.counter++;
        return calc.pow(x,y);
    }

    public double abs(double x) {
        this.counter++;
        return calc.abs(x);
    }

    public int root(int x){
        this.counter++;
        return calc.root(x);
    }

    public int getCounter() {
        return this.counter;
    }
}
