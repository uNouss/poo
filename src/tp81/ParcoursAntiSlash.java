package tp81;

public class ParcoursAntiSlash extends Parcours{
    public ParcoursAntiSlash(int[][] tab) {
        super(tab);
    }

    @Override
    public boolean hasNext() {
        return ycor < tab.length && xcor < tab[0].length;
    }

    @Override
    public Integer next() {
        Integer value = tab[tab.length - ycor -1 ][tab[ycor].length - xcor - 1];
        suivant();
        return value;
    }

    private void suivant() {
        ycor++;
        if(ycor == tab.length){
            ycor = 0;
            xcor++;
        }
        xcor++;
        if(xcor == tab[ycor].length){
            xcor = 0;
            ycor++;
        }
    }
}
