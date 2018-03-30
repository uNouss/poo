package tp81;

import java.util.Iterator;

public abstract class Parcours implements Iterator<Integer>{
    protected int xcor;
    protected int ycor;
    protected int[][] tab;

    public Parcours(int[][] tab) {
        this.tab = tab;
        this.xcor = 0;
        this.ycor = 0;
    }

    public void maTrace(){
        while(this.hasNext()){
            System.out.print(this.next()+" ");
        }
    }
}
