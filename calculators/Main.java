package thirdHomework;

public class Main {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();
        CalculatorWithCounter calc4 = new CalculatorWithCounter(calc1);
        CalculatorWithMemory calc5 = new CalculatorWithMemory(calc1);

        int resultOfOperations = 0;
        double result = 0;
        double tmp = 0;

        tmp = calc1.div(28,5);
        result = calc1.add(15,7);
        result = calc1.plus(4.1, result);
        result = calc1.plus(result, tmp);
        result = calc1.pow(result,2);

        System.out.printf("%.5s \n",result);
        System.out.println(result/0);
        System.out.println(result/0.0d);
        System.out.println("-------------------------");

        tmp = calc2.div(28,5);
        result = calc2.add(15,7);
        result = calc2.plus(4.1, result);
        result = calc2.plus(result, tmp);
        result = calc2.pow(result,2);

        System.out.printf("%.5s \n",result);
        System.out.println(result/0);
        System.out.println(result/0.0d);
        System.out.println("-------------------------");

        tmp = calc3.div(28,5);
        result = calc3.add(15,7);
        result = calc3.plus(4.1, result);
        result = calc3.plus(result, tmp);
        result = calc3.pow(result,2);

        System.out.printf("%.5s \n",result);
        System.out.println(result/0);
        System.out.println(result/0.0d);
        System.out.println("-------------------------");

        tmp = calc4.div(28,5);
        result = calc4.add(15,7);
        result = calc4.plus(4.1, result);
        result = calc4.plus(result, tmp);
        result = calc4.pow(result,2);
        resultOfOperations = calc4.getCounter();

        System.out.printf("%.5s \n",result);
        System.out.println("Result of operations : " + resultOfOperations);
        System.out.println(result/0);
        System.out.println(result/0.0d);
        System.out.println("-------------------------");

        double tmp1 = 0;
        double tmp2 = 0;
        double tmp3 = 0;
        double tmp4 = 0;
        double tmp5 = 0;
        tmp = calc5.div(28,5);
        tmp1 = calc5.getMemory();
        result = calc5.add(15,7);
        tmp2 = calc5.getMemory();
        result = calc5.plus(4.1, tmp2);
        tmp3 = calc5.getMemory();
        result = calc5.plus(tmp3, tmp1);
        tmp4 = calc5.getMemory();
        result = calc5.pow(tmp4,2);
        tmp5 = calc5.getMemory();

        System.out.printf("%.5s \n",tmp5);
        System.out.printf("result of last the operation from memory : %.5s \n",calc5.getMemory());
        System.out.println(result/0);
        System.out.println(result/0.0d);
        System.out.println("-------------------------");

    }
}
