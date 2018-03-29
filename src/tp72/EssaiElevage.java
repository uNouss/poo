package tp72;

public class EssaiElevage {
    public static void main(String[] args) {
        Elevage monElevage = new Elevage(100);

        for(int i = 150, j = 380; i < 153; i++, j++) {
            monElevage.ajouter(new Poulet(i, 0.250));
            monElevage.ajouter(new Canard(j, 0.250));
        }

        System.out.println(monElevage);

        System.out.println("gain "+monElevage.gainPossible());

        for(int i = 700; i < 705; i++) {
            monElevage.ajouter(new Poulet(i, 0.250));
        }
        monElevage.ajouter(new Canard(825, 0.750));

        //System.out.println(monElevage);

        //System.out.println("gain "+monElevage.gainPossible());

        monElevage.changerPoids(150, 1.3);
        monElevage.changerPoids(151, 1.3);

        monElevage.changerPoids(380, 1.5);
        monElevage.changerPoids(381, 1.5);

        System.out.println("gain "+monElevage.gainPossible());

        System.out.println(monElevage);
    }
}
