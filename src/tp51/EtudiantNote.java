package tp51;

import java.time.LocalDate;
import java.util.Arrays;

public class EtudiantNote {
	private Etudiant etudiant;
	private int[] notes;
	
	public EtudiantNote(Etudiant etudiant, int[] notes) {
		this.etudiant = etudiant;
		this.notes = notes;
	}

	public boolean equals(Etudiant etu) {
		return etudiant.equals(etu);
	}

	public int getAge() {
		return etudiant.getAge();
	}

	public String getFormation() {
		return etudiant.getFormation();
	}

	public double getMoyenne() {
		return etudiant.getMoyenne();
	}

	public LocalDate getNaiss() {
		return etudiant.getNaiss();
	}

	public int getNip() {
		return etudiant.getNip();
	}

	public String getNom() {
		return etudiant.getNom();
	}

	public Personne getPers() {
		return etudiant.getPers();
	}

	public String getPrenom() {
		return etudiant.getPrenom();
	}

	public boolean plusVieux(Etudiant e) {
		return etudiant.plusVieux(e);
	}

	public void setFormation(String formation) {
		etudiant.setFormation(formation);
	}

	public void setMoyenne(double moyenne) {
		etudiant.setMoyenne(moyenne);
	}

	public void setNaiss(LocalDate naiss) {
		etudiant.setNaiss(naiss);
	}

	public void setNip(int nip) {
		etudiant.setNip(nip);
	}

	public void setNom(String nom) {
		etudiant.setNom(nom);
	}

	public void setPers(Personne pers) {
		etudiant.setPers(pers);
	}

	public void setPrenom(String prenom) {
		etudiant.setPrenom(prenom);
	}

	public String toString() {
		String res = etudiant.getNom().toUpperCase()
					+" "+etudiant.getPrenom()+" "
					+" "+etudiant.getNaiss()+" "
					+" "+etudiant.getFormation()
					+": "+ Arrays.toString(notes);
		
		return res;
	}

	public int[] getNotes() {
		return notes;
	}

	public void setNotes(int[] notes) {
		this.notes = notes;
	}
	
	public static void main(String[] args) {
		EtudiantNote etu = new EtudiantNote(new Etudiant("A", "B", LocalDate.now(), 123456, "Info", 12.5), new int[] {1, 2, 3, 4, 5});
		System.out.println(etu);
	}
	
}
