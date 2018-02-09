package tp21;

public class Inscrit {
	public String dossard;
	public int score;
	public int temps;
	public Inscrit(int dossard, int score, int min, int sec) {
		this.dossard = "No"+dossard;
		this.score = score;
		this.temps = min*60+sec;
		
		if(dossard < 1 || dossard > 100) this.dossard = null;
		else if(score < 0 || score > 50) {
			this.score = 0;
			this.dossard = null;
		}
		else if(min < 0 || min > 60  ||  sec < 0 ||  sec > 60) {
			this.temps = 0;
			this.dossard = null;
		}
	}

	public String toString() {
		return "[" + this.dossard + ", " + this.score + " points, " + this.temps + "s]";
	}
}
