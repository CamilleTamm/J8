import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exo10 {

    public static void displayEvenIndex(ArrayList<Integer> liste) {
        System.out.print('{');

       /*for (int i : liste){
            if(i%2 == 0) {
                System.out.print(liste.get(i) + ",");
            }
        }*/
       for(int i = 0; i < liste.size(); i++) {
            if(i%2 == 0) {
                System.out.print(liste.get(i) + ",");
            }
        }
        System.out.print("}\n");
    }

    public static void main(String [] args) {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);
        System.out.print(liste);
        displayEvenIndex(liste);
    }
}
