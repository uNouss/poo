package tp41;

import java.time.LocalDate;
import java.util.ArrayList;

import tp42.Contact;

public class Agenda {
	private ArrayList<Evenement> events;
	
	public Agenda() {
		events = new ArrayList<>();
	}
	
	public String toString() {
		String listeEvent = "Liste des evenements:\n";
		for(Evenement event: events) {
			listeEvent += "\t - "+event+"\n";
		}
		return listeEvent;
	}
	
	public boolean entrable(Evenement event) {
		for(Evenement evt: events) {
			if(evt.chevauche(event)) return false;
		}
		return true;
	}
	
	public void ajoutEvt(Evenement event) {
		int idx = 0;
		for(Evenement evt: events) {
			if( evt.getDeb().isBefore(event.getDeb())) {
				break;
			}
			idx++;
		}
		this.ajoutEvt(event, idx);
	}
	
	private void ajoutEvt(Evenement event, int idx) {
		if(isValidIndex(idx)) {
			events.add(idx, event);
		}
	}
	
	public void supprEvt(Evenement event) {
		events.remove(event);
	}
	
	public void supprEvt(int idx) {
		if(isValidIndex(idx)) {
			events.remove(idx);
		}
	}
	
	public void supprEvt(String intitule) {
		for(Evenement event: events) {
			if(event.getIntitule().equals(intitule))
				this.supprEvt(event);
		}
	}
	
	public void supprChevauchants(Evenement evt) {
		for(int idx = 0; idx < events.size(); idx++) {
			if( events.get(idx).chevauche(evt)) {
				this.supprEvt(events.get(idx));
			}
		}
	}
	
	private boolean isValidIndex(int idx) {
		return idx >= 0 && idx <= events.size();
	}
	
	public void supprEntre(Evenement evt1, Evenement evt2) {
		Evenement tmp = new Evenement("", "", evt1.getDeb(), evt1.getFin());
		this.supprChevauchants(tmp);
	}
	
	public ArrayList<Contact> getAllContact(Evenement evt) {
		return evt.getContacts();
	}
	
	public ArrayList<Contact> getContactForPeriod(LocalDate begin, LocalDate end){
		if(begin.isAfter(end)) {
			LocalDate tmp = begin;
			begin = end;
			end = begin;
		}
		ArrayList<Contact> res = new ArrayList<>();
		for(Evenement event: events) {
		}
		
		
		return res;
	}
	
	public ArrayList<Evenement> getEventFor(Contact c){
		return new ArrayList<Evenement>();
	}
}
