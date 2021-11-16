import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Exo8 {

    public static void main(String [] args) {

        ArrayList<String> languages = new ArrayList<String>();

        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Ada");

        System.out.println(languages);

        Collections.sort(languages);

        System.out.println(languages);
    }
}
