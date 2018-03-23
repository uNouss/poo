package tp71;

import java.time.LocalDate;

public class EssaiMediatheque {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();

        mediatheque.ajouterDocument(new Document("001122", "Balzac", "Whaaa", LocalDate.now()));
        mediatheque.ajouterDocument(new Document("001133", "Zola", "Germinal", LocalDate.now()));
        mediatheque.ajouterDocument(new Document("001144", "Rousseau", "Okay", LocalDate.now()));

        //System.out.println(mediatheque.rechercheCote("001155"));
        //System.out.println(mediatheque.rechercheCote("001122"));

        //System.out.println(mediatheque);

        Livre livre1 = new Livre("001155", "Balzac", "Whaaa", LocalDate.now(), "La Contre allée", 120);
        Livre livre2 = new Livre("001166", "Zola", "Germinal", LocalDate.now(), "Matlab", 220);

        Dvd dvd1 = new Dvd("001177", "M", "Loumali", LocalDate.now(), "Toumani", 150);
        Dvd dvd2 = new Dvd("001188", "D", "Album", LocalDate.of(2015,1,2), "Prod", 78);

        mediatheque.ajouterDocument(livre1);
        mediatheque.ajouterDocument(livre2);
        mediatheque.ajouterDocument(dvd1);
        mediatheque.ajouterDocument(dvd2);

        //System.out.println(mediatheque);

        mediatheque.emprunter("001155", 10);
        mediatheque.emprunter("001188", 10);

        System.out.println(mediatheque.emprunts());
        System.out.println(mediatheque.rechercheCote("001155").getDateRetour());
        System.out.println(mediatheque.rechercheCote("001188").getDateRetour());
    }
}
