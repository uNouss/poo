package tp32;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Saisie {
	private static final String DATE_SEP = "/"; 
	public static int nbSaisieDate = 1;
	
	public static int controle(int min, int max) {
		String input;
		do {
			input = JOptionPane.showInputDialog("saisir valeur entre "+min+" et "+max);
		}while(!Saisie.isValid(input, min, max));
		return Integer.parseInt(input);
	}
	
	public static boolean isInteger(String input) {
		return input.matches("[0-9][0-9]*");
	}
	
	public static boolean isValid(String input, int min, int max) {
		return Saisie.isInteger(input) &&  ( Integer.parseInt(input) >= min && Integer.parseInt(input) <= max);
	}
	
	
	public static LocalDate date() {
		String input;
		do {
			input = JOptionPane.showInputDialog(Saisie.nbSaisieDate+":saisir une date au format DAY"+DATE_SEP+"MONTH"+DATE_SEP+"YEAR");
		}while(!isValidDate(input));
		Saisie.nbSaisieDate++;
		String[] date = input.split(DATE_SEP);
		//return LocalDate.parse(input);
		return LocalDate.of(Integer.parseInt(date[2]),
							Integer.parseInt(date[1]),
							Integer.parseInt(date[0])); // tester avec of
	}
	
	public static boolean isValidDate(String input) {
		String[] date = input.split(DATE_SEP);
		return date.length == 3
				&& Saisie.isInteger(date[0]) //&& date[0].length() == 4
				&& Saisie.isInteger(date[1]) //&& date[1].length() == 2
				&& Saisie.isInteger(date[2]) //&& date[1].length() == 2
				&& isValid(date[0], 1, LocalDate.of(
					Integer.parseInt(date[2]),
					Integer.parseInt(date[1]),
					1).lengthOfMonth())
				&& isValid(date[1], 1, 12)
				&& isValid(date[2], 0, Short.MAX_VALUE);
	}
}
