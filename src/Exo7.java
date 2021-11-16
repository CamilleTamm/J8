import java.util.ArrayList;
import java.util.List;

public class Exo7 {

    public static void main(String [] args) {

        List<String> languages = new ArrayList<String>();

        languages.add("PHP");
        languages.add("Java");
        languages.add("Python");

        System.out.println(languages.contains("PHP"));
        System.out.println(languages.contains("C++"));
    }
}
