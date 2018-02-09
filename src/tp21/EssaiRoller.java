package tp21;

public class EssaiRoller {
	public Inscrit[] inscrits;
	public int nbInscrit;
	public EssaiRoller(int max) {
		this.inscrits = new Inscrit[max];
		this.nbInscrit = 0;
	}
	
	public void inscrire(Inscrit i) {
		if(i.dossard != null ) {
			this.inscrits[this.nbInscrit++] = i;
		}
	}
	
	public void afficher() {
		for(int idx = 0; idx < this.nbInscrit; idx++) {
			System.out.println(this.inscrits[idx]);
		}
	}
	
	public static void main(String[] args) {
		EssaiRoller er = new EssaiRoller(5);
		
		er.inscrire(new Inscrit(1,45,15,20));
		er.inscrire(new Inscrit(2,32,12,45));
		er.inscrire(new Inscrit(5,12,13,59));
		er.inscrire(new Inscrit(12,12,15,70));
		er.inscrire(new Inscrit(32,75,15,20));
		
		er.afficher();
	}
}
