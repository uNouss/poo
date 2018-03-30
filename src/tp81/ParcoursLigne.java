package tp81;

public class ParcoursLigne extends Parcours{
    public ParcoursLigne(int[][] tab) {
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
        xcor++;
        if(xcor == tab[ycor].length){
            xcor = 0;
            ycor++;
        }
    }
}
