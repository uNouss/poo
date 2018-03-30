package tp81;

public class TableauEntier{
    private int[][] tab;
    private Parcours mit;

    public TableauEntier(int[][] tab) {
        this.tab = tab;
        this.mit = new ParcoursSlash(tab);
    }

    public TableauEntier(int col, int row) {
        this(new int[col][row]);
    }

    public int getValueAt(int idCol, int idRow) {
        return isValidIndice(idCol, idRow) ? tab[idCol][idRow]: Integer.MIN_VALUE;
    }

    public void setValueAt(int idCol, int idRow, int value) {
        if(isValidIndice(idCol, idRow)) this.tab[idCol][idRow] = value;
    }

    private boolean isValidIndice(int idCol, int idRow) {
        return idCol >= 0 && idCol < getWidth()
                && idRow >=0 && idRow < getHeight();
    }

    public int getWidth(){
        return this.tab[0].length;
    }

    public int getHeight(){
        return this.tab.length;
    }

    public void maTrace() {
        mit.maTrace();
    }
}
