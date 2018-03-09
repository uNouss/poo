package tp42;

public class Contact {
	private String nom;
	private String email;
	
	public Contact(String nom, String email) {
		this.nom = nom;
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public String getEmail() {
		return email;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return nom + ": " + email;
	}
	
	
}
