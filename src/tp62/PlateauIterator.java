package tp62;

import java.util.Iterator;

public class PlateauIterator implements Iterator<Integer>{
    private int[][] tab;
    private int row;
    private int col;

    public PlateauIterator(int[][] tab) {
        this.tab = tab;
        this.col = 0;
        this.row = 0;
    }

    @Override
    public boolean hasNext() {
        return this.row < tab.length;
    }

    @Override
    public Integer next() {
        int res = tab[row][col];
        this.col++;
        if(this.col >= tab[row].length) {
            this.row++;
            this.col = 0;
        }
        return res;
    }
}
