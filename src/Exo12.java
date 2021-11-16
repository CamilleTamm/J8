import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Exo12 {

    public static int max_value(int [] tab) {
        int max = tab[0];

        for(int i = 1; i < tab.length; i++) {
            if(tab[i] > max) {
                max = tab[i];
            }
        }

        return max;
    }

    public static boolean contains(int [] tab, int value) {
        for(int i : tab) {
            if(i == value) {
                return true;
            }
        }

        return false;
    }

    public static void main(String [] args) {

        int tab [] = {0,1,2,3,4,5,6,7,8,9,10};
        int tab2 [] = {1,2,10};

        System.out.println(contains(tab2, max_value(tab)));
    }
}
