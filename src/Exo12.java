import java.util.*;

public class Exo12 {

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

        System.out.println(contains(tab2, Arrays.stream(tab).max().getAsInt()));
    }
}
