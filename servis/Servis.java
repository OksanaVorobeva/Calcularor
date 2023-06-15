package servis;

import java.util.List;

import calculator.Calculator;
import calculator.Fraction;
import calculator.Operation;
import calculator.Parser;

public class Servis {

   private Parser parser;
   private Calculator calculator;

   public Servis() {
      parser = new Parser();
      calculator = new Calculator();

   }

   public void get(String primer) {

      parser.setPrimer(primer);
      List<Fraction> fractions = parser.getFractions();
      List<Character> sings = parser.getSings();
      Fraction fraction = calculator.getAnswer(fractions, sings);

   }

}
