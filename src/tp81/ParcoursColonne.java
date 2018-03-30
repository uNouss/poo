package tp81;

public class ParcoursColonne extends Parcours{
    public ParcoursColonne(int[][] tab) {
        super(tab);
    }

    @Override
    public boolean hasNext() {
        return ycor < tab.length && xcor < tab[0].length;
    }

    @Override
    public Integer next() {
        Integer value = tab[ycor][xcor];
        suivant();
        return value;
    }

    private void suivant() {
        ycor++;
        if(ycor == tab.length){
            ycor = 0;
            xcor++;
        }
    }
}
