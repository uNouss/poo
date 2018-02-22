package tp32;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class EssaiDate {

	public static void main(String[] args) {
		LocalDate d1 = Saisie.date();
		LocalDate d2 = Saisie.date();
		
		JOptionPane.showMessageDialog(null, Period.between(d1, d2).toTotalMonths()+" mois");
	}

}
