package calculator;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    private String primer;
    private List<String> inpuList;
    private List<Fraction> fractions;
    private List<Character> sings;

    public Parser() {

        fractions = new ArrayList<>();
        sings = new ArrayList<>();
    }

    public void setPrimer(String primer) {
        this.primer = primer;
    }

    public List<Fraction> getFractions() {

        inpuList = List.of(primer.split("[\\Q+-*\\E]+"));

        for (int i = 0; i < inpuList.size(); i ++) {
            String[] s = inpuList.get(i).split("/"); // 1/2, 1/6,1
            int denominator;
            int numerator;
            if (s.length == 1) {
                denominator = Integer.parseInt(s[0]);
                numerator = 1;

            } else {
                denominator = Integer.parseInt(s[0]);
                numerator = Integer.parseInt(s[1]);
            }
            Fraction fraction = new Fraction(denominator, numerator);
            fractions.add(fraction);

        }
        return fractions;
    }

    public List<Character> getSings() {
        for (int i = 0; i < primer.length(); i++) {
            if (primer.charAt(i) == '-' || primer.charAt(i) == '+' || primer.charAt(i) == '*') {
                sings.add(primer.charAt(i));
            }
        }
        return sings;

    }

}
