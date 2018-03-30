package tp81;

import java.util.Arrays;

public class EssaiTableauEntier {
    public static void main(String[] args) {
        int[][] tab = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        TableauEntier te = new TableauEntier(tab);
        System.out.println(Arrays.deepToString(tab));
        te.maTrace();
    }
}
