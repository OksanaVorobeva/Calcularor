package calculator;

public class Fraction {
    private int denominator;
    private int numerator;

    public Fraction(int denominator, int numerator) {
        this.denominator = denominator; // знаменатель
        this.numerator = numerator; // числитель
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    @Override
    public String toString() {
     
        return denominator+"/"+numerator;
    }

}
