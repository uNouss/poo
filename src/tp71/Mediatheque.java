package tp71;

import javax.print.Doc;
import java.time.LocalDate;
import java.util.ArrayList;

public class Mediatheque {
    private ArrayList<Document> contenu;

    public Mediatheque(){
        this.contenu = new ArrayList<>();
    }

    public Document rechercheCote(String cote){
        int idxDoc = getIndiceDocumentByCote(cote);
        if(idxDoc != -1) return contenu.get(idxDoc);
        return null;
    }


    public void ajouterDocument(Document document){
        contenu.add(document);
    }

    public void supprimerDocument(Document document){
        int idxDoc = getIndiceDocumentByCote(document.getCote());
        if(idxDoc != -1) contenu.remove(idxDoc);
    }

    @Override
    public String toString() {
        return "Mediatheque{\n" +
                "contenu=" + contenu +
                "\n}";
    }

    private int getIndiceDocumentByCote(String cote){
        int idx = -1;
        for(Document doc: contenu){
            idx++;
            if(doc.aPourCote(cote)) break;
        }
        return idx;
    }

    public String emprunts(){
        String res = "";
        for(Document document: contenu){
            if(!document.estLibre()) res += document.getCote()+":"+document.getEmprunteur()+"\n";
        }
        return res;
    }

    public boolean emprunter(String cote, int emprunteur){
        if( emprunteur < 0 ) return false;
        Document document = this.rechercheCote(cote);
        if(document != null && document.estLibre()) {
            document.setEmprunteur(emprunteur);
            document.setDateEmprunt(LocalDate.now());
            return true;
        }
        return false;
    }

    public boolean restituer(String cote){
        Document document = this.rechercheCote(cote);
        if(document != null && !document.estLibre()){
            document.setDateEmprunt(null);
            document.setEmprunteur(-1);
            return true;
        }
        return false;
    }
}
