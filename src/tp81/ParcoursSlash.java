package tp81;

public class ParcoursSlash extends Parcours{
    public ParcoursSlash(int[][] tab) {
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
        xcor--;
        if(xcor < 0 && ycor < tab.length){
            xcor = ycor;
            ycor = 0;
        }
        if(ycor >= tab.length){
            xcor = 3;
        }
    }
}
