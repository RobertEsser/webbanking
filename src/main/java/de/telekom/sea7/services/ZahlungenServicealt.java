package de.telekom.sea7.services;

import org.springframework.stereotype.Service;

import de.telekom.sea7.Model.Zahlungen;

@Service
/** Service - sollte immer ein Interface haben **/
public class ZahlungenServicealt {

	/** Hier wird eine neue Objektinstanz erstellt welche
	 *  in der Klasse Zahlungen beschrieben ist
	 */
	private Zahlungen zahlungen = new Zahlungen();

	public Zahlungen getZahlungen() {
		return zahlungen;
	}

	public void setZahlungen(Zahlungen zahlungen) {
		this.zahlungen = zahlungen;
	}

}
