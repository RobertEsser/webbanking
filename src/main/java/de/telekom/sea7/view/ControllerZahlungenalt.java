package de.telekom.sea7.view;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.Model.Zahlung;
import de.telekom.sea7.Model.Zahlungen;
import de.telekom.sea7.services.*;

/**
 * Einsatz Rest-Controller übernimmt die Bereitstellung erforderlicher Daten im
 * JSON-Format.
 **/
/*
@RestController
public class ControllerZahlungenalt {
	/**
	 * @AutoWired teilt Spring mit, wo es mittels Injection Objekte in andere
	 *            Klassen einfügen soll.
	 **/
/*	@Autowired
	private ZahlungenService zahlungenService;

	/**Die @Autowired Annotation zeigt Spring an, dass die @Service Bean
	 * ControllerZahlungen die Injektion der Bean ZahlungenService benötigt. 
	 * Wenn Sping im IoC Container nun eine Bean vom Typ ZahlungenService findet,
	 * so setzt Spring automatisch im Attribut zahlungenService eine Referenz auf
	 * diese Bean. Spring macht das mit Reflection, daher wird auch keine Setter-Methode
	 * für zahlungenservice benötigt.
	 * 
	 * Für die folgenden Codezeilen ist es ausreichend die Zahlungen zu holen
	 * (get).Der return erfolgt automatisch im JSON-Format
	 * @GetMapping: Tag der die Verknüpfung zur Url definiert. Muss in den @Controller.**/

/*	@GetMapping("/zahlungen/")
	public Zahlungen getZahlungen() {
		return zahlungenService.getZahlungen();
	}

	@GetMapping("/zahlung/{zahlungnummer}")
	public Zahlung getZahlung(@PathVariable("zahlungnummer") int zahlungnummer) {
		return zahlungenService.getZahlungen().getZahlung(zahlungnummer);
	}

	@PostMapping("/zahlung/")
	public String addZahlungen(@RequestBody Zahlung zahlung) {
		Zahlungen zahlungen;
		zahlungen = zahlungenService.getZahlungen();
		zahlungen.add(zahlung);
		return "Zahlung raus";
	}

	@PutMapping("/zahlung/{zahlungnummer}")
	public Zahlung updateZahlung(@RequestBody Zahlung zahlung,
			@PathVariable(name = "zahlungnummer") int zahlungnummer) {
		Zahlungen zahlungen;
		zahlungen = zahlungenService.getZahlungen();
		zahlungen.delete(zahlungnummer);
		zahlungen.add(zahlung);
		return null;
	}

	@DeleteMapping("/zahlung/{zahlungnummer}")
	public Zahlung deleteZahlung(@PathVariable("zahlungnummer") int id) {
		Zahlungen zahlungen;
		zahlungen = zahlungenService.getZahlungen();
		zahlungen.delete(id);
		return null;
	}
}
*/