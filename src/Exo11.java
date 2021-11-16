import java.util.ArrayList;

public class Exo11 {

    public static int sommeNegatifs(ArrayList<Integer> liste) {
        int count = 0;

        for(Integer i : liste) {
            if(i < 0) {
                count += i;
            }
        }

        return count;
    }

    public static void main(String [] args) {

        ArrayList<Integer> liste = new ArrayList<Integer>();

        liste.add(1);
        liste.add(-2);
        liste.add(3);
        liste.add(-4);
        liste.add(-5);
        liste.add(6);
        liste.add(7);

        System.out.println(sommeNegatifs(liste));



    }
}
