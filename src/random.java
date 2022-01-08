import java.util.Arrays;

public class random {

    public static int[] add(int[] ary1, int[] ary2) {

        int[] arynew = new int[ary1.length + ary2.length];

        for (int i = 0; i < ary1.length; i++) {
            arynew[i] = ary1[i];
        }
        for (int i = 0; i < ary2.length; i++) {
            arynew[i + ary1.length] = ary2[i];
        }
        return arynew;
    }

    public static int[][] multadd(int[][] ary1, int[][] ary2) {
        int[][] arynew;

        //längste Lenge finden
        if (ary1.length > ary2.length) {
            arynew = new int[ary1.length][];
        } else {
            arynew = new int[ary2.length][];
        }
        int counter = 0;
        //arrays durchlaufen
        for (int i = 0; i < arynew.length; i++) {
            //innere erste Dimension größe initialisieren
            //bsp
            //ary1[0].length = {1, 2} = 2
            //ary2[0].length = {3, 4} = 2
            arynew[i] = new int[ary1[i].length + ary2[i].length];
            //mit vorheriger Methode alles rein
            arynew[i] = add(ary1[i], ary2[i]);
        }

        return arynew;
    }


    public static void main(String[] args) {

        int[] ary1 = {1, 2};
        int[] ary2 = {3, 4};
        int[][] ary3 = {{1, 2}, {5, 6}};
        int[][] ary4 = {{3, 4}, {7, 8}};

        System.out.println(Arrays.toString(add(ary1, ary2)));
        System.out.println(Arrays.deepToString(multadd(ary3, ary4)));

    }
}
