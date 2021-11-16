import java.util.ArrayList;
import java.util.List;

public class Exo3 {

    public static void main(String [] args) {
        List<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");

        languages.add(0, "Pascal");

        System.out.println(languages);
    }
}
