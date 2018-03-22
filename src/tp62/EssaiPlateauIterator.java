package tp62;

import java.util.Arrays;

public class EssaiPlateauIterator {
    public static void main(String[] args) {
        int[][] tab = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        for(int[] val: tab) {
            System.out.println(Arrays.toString(val));
        }

        PlateauIterator p = new PlateauIterator(tab);

        int idx = 0;
        while(p.hasNext()){
            System.out.printf("%4d", p.next());
            if(++idx%tab[0].length == 0) System.out.println();
        }
    }
}
