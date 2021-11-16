import java.util.ArrayList;

public class Exo6 {

    public static ArrayList reverse(ArrayList<Integer> liste){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (Integer i = liste.size()-1; i >= 0; i--){
            res.add(liste.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<Integer>();

        int[] nbrs = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < nbrs.length; i++) {
            liste.add(nbrs[i]);
        }

        ArrayList<Integer> res = reverse(liste);

        System.out.println(res);
    }
}
