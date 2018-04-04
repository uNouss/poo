package tp82;

import java.time.LocalDate;

public class EssaiPersonnelEntreprise {
    public static void main(String[] args) {
        PersonnelEntreprise personnel = new PersonnelEntreprise();

        personnel.ajoutEmploye(new Vendeur("Samuel", LocalDate.of(2014,12,25), 2000));
        personnel.ajoutEmploye(new Ouvrier("Nicolas", LocalDate.of(2015,12,25), 2000));
        personnel.ajoutEmploye(new Representant("David", LocalDate.of(2016,12,25), 5000));
        personnel.ajoutEmploye(new Vendeur("Sow", LocalDate.of(2017,12,25), 3000));


        Commercial.setObjectif(5000);
        Ouvrier.setObjectif(1000);

        System.out.println(personnel);

    }
}
