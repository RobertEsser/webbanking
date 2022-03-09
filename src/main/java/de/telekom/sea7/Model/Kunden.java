package de.telekom.sea7.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Kunden {
	/** Beschreibung für die Erstellung einer Arraylist mit Objekten vom Typ Kunde  **/
	
	private ArrayList<Kunde> kunden;
	
	/** Konstruktor mit Anlage von Kundendatensätzen (temporäre Lösung) **/

	public Kunden() {

		kunden = new ArrayList<>();
		Kunde kunde1 = new Kunde("Hans", "Musterfrau", "Strasse", "1", "44444", "Ort1", "DE777333222999");
		Kunde kunde2 = new Kunde("Franz", "Musterfrau", "Strasse", "2", "44445", "Ort2", "DE777333777999");
		Kunde kunde3 = new Kunde("Hans", "Wurst", "Strasse", "3", "44447", "Ort3", "DE777333222888");
		kunden.add(kunde1);
		kunden.add(kunde2);
		kunden.add(kunde3);

	}

	public ArrayList<Kunde> getKunden() {
		return kunden;
	}

	public void setKunden(ArrayList<Kunde> kunden) {
		this.kunden = kunden;
	}

//	public int getIndex(Kunde kunden) {
//		return this.kunden.indexOf(kunden);
	public Kunde getKunde(int index) {
		return (Kunde) kunden.get(index);

	}

}
