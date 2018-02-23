package tp32;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class EssaiDate {

	public static void main(String[] args) {
		LocalDate d1 = Saisie.date();
		LocalDate d2 = Saisie.date();
		
		int nbDay   = Period.between(d1, d2).getDays();
		int nbMonth = Period.between(d1, d2).getMonths();
		int nbYear  = Period.between(d1, d2).getYears();
		JOptionPane.showMessageDialog(null,"il s'est passé entre "+d1+" et "+d2+":"+nbDay+" jours\n"
											+"il s'est passé entre "+d1+" et "+d2+":"+nbMonth+" mois\n"
											+"il s'est passé entre "+d1+" et "+d2+":"+nbYear+" années\n");
	}

}
