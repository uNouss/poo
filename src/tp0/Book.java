package tp0;

import util.Surprise;

class Book {
	// les attributs de la classe Book
	String author;
	String title;
	int publicationYear;
	String text;
	// le constructeur
	Book(String a, String t, int y, String contenu) {
		author = a;
		title = t;
		publicationYear = y;
		text = contenu;
	}
	// les méthodes de la classe Book
	void print() {
		System.out.println(text);
	}
	String getAuthor() {
		return author;
	}
	String getTitle() {
		return title;
	}
	
	public static void main(String[] args){
		Surprise masurprise = new Surprise();
		System.out.println(masurprise.getSurprise());
	}
}