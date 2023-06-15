import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String primer = "2/3-1/6+1";

        List<String> inpuList = List.of(primer.split("[\\Q+-*\\E]+"));
        // System.out.println(inpuList);

        for (int i = 0; i < inpuList.size(); i++) {
            String[] s = inpuList.get(i).split("/"); // 1/2, 1/6,1
            int denominator;
            int numerator;
            if (s.length == 1) {
                numerator = Integer.parseInt(s[0]);
                denominator = 1;
                // System.out.println(denominator);
                // System.out.println(numerator);
            } else {
                numerator = Integer.parseInt(s[0]);
                denominator = Integer.parseInt(s[1]);
                // System.out.println(numerator);
                // System.out.println(denominator);
            }
            List<Integer> fractions = new ArrayList<>();

            fractions.add(numerator);
            fractions.add(denominator);

            System.out.println(fractions);
        }
        List<Character> sings = new ArrayList<>();
        for (int i = 0; i < primer.length(); i++) {
            if (primer.charAt(i) == '-' || primer.charAt(i) == '+' || primer.charAt(i) == '*') {

                sings.add(primer.charAt(i));
            }

        }
        System.out.println(sings);

    }
}
