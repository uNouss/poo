package tp82;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PersonnelEntreprise {
    private ArrayList<Employe> salarie;

    public PersonnelEntreprise() {
        this.salarie = new ArrayList<>();
    }

    public void ajoutEmploye(Employe e){
        salarie.add(e);
    }

    public void supprEmploye(int idEmploye){
        if(idEmploye >= 0 && idEmploye < salarie.size()) salarie.remove(idEmploye);

    }

    public void supprEmploye(Employe e){
        if(salarie.contains(e)) salarie.remove(e);
    }

    @Override
    public String toString() {
        return "Personnel de l'entreprise: \n"+
                "salarie=" + salarie ;
    }

    public void trierSalarie(){
        Collections.sort(salarie);
    }

    public void licenciement(int nb){
        ArrayList<Employe> aLicencier = new ArrayList<>();
        trierSalarie();
        for(int i = 0; i < nb; i++){
            aLicencier.add(salarie.get(i));
        }
        salarie.removeAll(aLicencier);
    }

    public void licenciement(){
        EmployeInsatisfaisantIterator ite = new EmployeInsatisfaisantIterator(salarie);
        ArrayList<Employe> aLicencier = new ArrayList<>();
        while(ite.hasNext()){
            aLicencier.add(ite.next());
        }
        salarie.removeAll(aLicencier);
    }

}
