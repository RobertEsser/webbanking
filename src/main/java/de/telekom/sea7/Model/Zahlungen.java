package de.telekom.sea7.Model;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Iterator;

/**
 * Beschreibung für die Erstellung einer Arraylist mit Objekten vom Typ Zahlung
 **/
@Component

/**
 * @Component (allgemeine Variante anstatt den Spezialisierungen @Controller,
 ** @Service und @Repository wird eingesetzt wenn ein Dienst zur Verfügung
 *          gestellt wird. Die Bean sollte eine interne Komponente sein, die nur
 *          im Java-Projekt selbst verwendet wird und nicht nach außen
 *          bereitgestellt werden soll.
 **/

public class Zahlungen implements Iterable<Zahlung> {
	private ArrayList<Zahlung> zahlungenArrayList;

	/** Konstruktor mit Anlage von Zahlungsdatensätzen (temporäre Lösung) **/

	public Zahlungen() {

		zahlungenArrayList = new ArrayList<>();
		LocalDateTime datum = LocalDateTime.now();
		Zahlung zahlung1 = new Zahlung(12.30f, "Hans Mustermann", "DE99443355", "BIC87648", "Verwendungszweck1", datum);
		Zahlung zahlung2 = new Zahlung(15.70f, "Franz Mustermann", "DE99443355", "BIC87648", "Verwendungszweck2",
				datum);
		Zahlung zahlung3 = new Zahlung(13.40f, "Hubertus Mustermann", "DE99443355", "BIC87648", "Verwendungszweck3",
				datum);
		zahlungenArrayList.add(zahlung1);
		zahlungenArrayList.add(zahlung2);
		zahlungenArrayList.add(zahlung3);

	}

//public void add(float betrag, String empfaenger, String iban, String bic, String verwendungszweck,
//LocalDateTime datum) {
//Zahlung zahlung = new Zahlung(betrag, empfaenger, iban, bic, verwendungszweck, datum);
//zahlungen.add(zahlung);
//}
// ****wozu ?

	public void add(Zahlung zahlung) {
		zahlungenArrayList.add(zahlung);
	}

	public Iterator<Zahlung> iterator() {
// TODO Auto-generated method stub
		return zahlungenArrayList.iterator();
	}

	public int getIndex(Zahlung horst) {
		return this.zahlungenArrayList.indexOf(horst);

	}

	public Zahlung getZahlung(int index) {
		return (Zahlung) zahlungenArrayList.get(index);
	}

	public void delete(int id) {
		zahlungenArrayList.remove(id);
		// TODO Auto-generated method stub

	}

}
