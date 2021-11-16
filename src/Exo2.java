import java.util.ArrayList;
import java.util.List;

public class Exo2 {

    public static void main(String [] args) {
        List<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");

        for(String s : languages) {
            System.out.println(s);
        }
    }
}
