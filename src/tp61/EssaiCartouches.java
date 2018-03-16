package tp61;

public class EssaiCartouches {
    public static void main(String[] args) {
        Cartouche c1 = new Cartouche("P45HP-42J", "Cartouche Toner", 54.99);
        Cartouche c2 = new Cartouche("ICWCP45-3D", "Cartouche 3DInk-HP", 72.50);
        Cartouche c3 = new Cartouche("GC42-L42", "Cartouche Toner", 41.99);


        /*ICollCartouches mesCartouches1 = new TabCartouches();
        ICollCartouches mesCartouches2 = new TabCartouches();*/

        ICollCartouches mesCartouches1 = new ListCartouches();
        ICollCartouches mesCartouches2 = new ListCartouches();

        Imprimante imp1 = new Imprimante("HPIJ3", TypeImprimante.jetencre, "HP InkJet 3", mesCartouches1);
        Imprimante imp2 = new Imprimante("HPDJ560C", TypeImprimante.laser, "", mesCartouches2);
        imp1.addCartouche(c1);
        imp1.addCartouche(c2);
        imp1.addCartouche(c3);
        imp1.addCartouche(c2);

        System.out.println(imp1);
        System.out.println(imp2);
    }
}
