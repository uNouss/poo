package tp82;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeInsatisfaisantIterator implements Iterator<Employe>{
    private ArrayList<Employe> employes;
    private int idx;
    private int taille;

    public EmployeInsatisfaisantIterator(ArrayList<Employe> employes) {
        this.employes = employes;
        this.taille = employes.size();
        this.idx = -1;
        suivant();
    }

    private void suivant() {
        int idEmploye = idx+1;
        while(idEmploye < taille && employes.get(idEmploye).satisfaitObjectif()){
            idEmploye++;
        }
        this.idx = idEmploye;
    }

    @Override
    public boolean hasNext() {
        return idx < taille;
    }

    @Override
    public Employe next() {
        Employe employe = employes.get(idx);
        suivant();
        return employe;
    }
}
