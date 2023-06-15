package calculator;

import java.util.ArrayList;
import java.util.List;

public class Operation {

    public Fraction sum(Fraction fraction, Fraction fraction2) {

        int denominator = fraction.getDenominator() * fraction2.getNumerator()
                + fraction2.getDenominator() * fraction.getNumerator();
        int numerator = fraction.getNumerator() * fraction2.getNumerator();

        Fraction fraction3 = new Fraction(denominator, numerator);

        return reduction(fraction3);

    }

    public Fraction subtyaction(Fraction fraction, Fraction fraction2) {

        int denominator = fraction.getDenominator() * fraction2.getNumerator()
                - fraction2.getDenominator() * fraction.getNumerator();
        int numerator = fraction.getNumerator() * fraction2.getNumerator();

        Fraction fraction3 = new Fraction(denominator, numerator);

        return reduction(fraction3);
    }

    public Fraction multiplication(Fraction fraction, Fraction fraction2) {

        int numerator = fraction.getNumerator() * fraction2.getNumerator();
        int denominator = fraction.getDenominator() * fraction2.getDenominator();

        Fraction fraction3 = new Fraction(denominator, numerator);

        return reduction(fraction3);
    }

    private Fraction reduction(Fraction fraction) {
        int numerator = fraction.getNumerator();
        int denominator = fraction.getDenominator();
        for (int index = numerator; index > 0; index--) {
            if (denominator % index == 0 && numerator % index == 0) {
                denominator = denominator / index;
                numerator = numerator / index;
                Fraction fraction3 = new Fraction(denominator, numerator);
                return fraction3;
            }

        }
        return fraction;
    }

}
