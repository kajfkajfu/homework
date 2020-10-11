package calculators;

public class CalculatorWithMemory implements ICalc {
    private ICalc calc;
    private double memory = 0;


    public CalculatorWithMemory(ICalc calc) {
        this.calc = calc;
    }

    public double div(double x, double y) {
        setMemory(calc.div(x, y));
        calc.div(x, y);
        return calc.div(x, y);
    }

    public double add(double x, double y) {
        setMemory(calc.add(x, y));
        calc.add(x, y);
        return calc.add(x, y);
    }

    public double minus(double x, double y) {
        setMemory(calc.minus(x, y));
        return calc.minus(x, y);
    }

    public double plus(double x, double y) {
        setMemory(calc.plus(x, y));
        return calc.plus(x, y);
    }

    public double pow(double x, int y) {
        setMemory(calc.pow(x, y));
        return calc.pow(x, y);
    }

    public double abs(double x) {
        setMemory(calc.abs(x));
        return calc.abs(x);
    }

    public int root(int x) {
        setMemory(calc.root(x));
        return calc.root(x);
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getMemory() {
        double tmp = this.memory;
        this.memory = 0;
        return tmp;
    }
}
