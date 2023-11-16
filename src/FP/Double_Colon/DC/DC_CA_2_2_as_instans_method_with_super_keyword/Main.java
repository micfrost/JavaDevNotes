package FP.Double_Colon.DC.DC_CA_2_2_as_instans_method_with_super_keyword;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Text {
     String drucken(String s) {
        return "Hello " + s + ".\n";
    }
}

public class Main extends Text {


    @Override
    String drucken(String s) {

        Function<String, String> func = super::drucken;
        String newValue = func.apply(s);
        newValue = newValue + "Bye " + s +".\n";

        System.out.println(newValue);
        return newValue;
    }


    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("Emmanuel");
        students.add("Albert");
        students.add("Maria");

        students.forEach(new Main()::drucken);

    }

}
