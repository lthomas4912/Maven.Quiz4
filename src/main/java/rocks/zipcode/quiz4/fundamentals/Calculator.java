package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return Math.pow(value,2);
    }

    public static Double[] squareRoots(Double... value) {
        Double [] sqrt = new Double[value.length];
        for (int i = 0; i < sqrt.length; i++) {
            sqrt [i] = squareRoot(value[i]);
        }
        return sqrt;
    }

    public static Double[] squares(Double... values) {
        Double [] twoTimes = new Double[values.length];
        for (int i = 0; i < twoTimes.length ; i++) {
            twoTimes[i] = square(values[i]);
        }
        return twoTimes;
    }

    public static Double add(Double value1, Double value2) {
        return new Double(value1 + value2);
    }

    public static Double subtract(Double value1, Double value2) {
        return new Double((value1 - value2));
    }


    public static Double divide(Double divisor, Double dividend) {
        return new Double(divisor / dividend);
    }
}
