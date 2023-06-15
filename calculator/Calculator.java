package calculator;

import java.util.List;

public class Calculator {

    private List<Fraction> fraction;
    private List<Character> signs;
    private Operation operation;

    public Fraction getAnswer(List<Fraction> fraction, List<Character> signs) {
        this.fraction = fraction;
        this.signs = signs;
        while (signs.contains('*')) {
            int index = signs.indexOf('*');
            Fraction fraction2 = operation.multiplication(fraction.get(index), fraction.get(index + 1));
            fraction.remove(index);
            fraction.remove(index);
            fraction.add(index, fraction2);
            signs.remove(index);
        }

        while (fraction.size() > 1) {
            Fraction fraction2;
            int index = 0;
            if (signs.get(index) == '+') {
                fraction2 = operation.sum(fraction.get(index), fraction.get(index + 1));

            } else {
                fraction2 = operation.subtyaction(fraction.get(index), fraction.get(index + 1));

            }
            fraction.remove(index);
            fraction.remove(index);
            fraction.add(index, fraction2);
            signs.remove(index);
            System.out.println(fraction.get(0).toString());
        }

        return fraction.get(0);

    }

    public Calculator() {
        operation = new Operation();
    }

}
