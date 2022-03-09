package de.telekom.sea7.view;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import de.telekom.sea7.Model.Zahlung;
import de.telekom.sea7.Model.Zahlungen;
import de.telekom.sea7.entity.EntityZahlungen;
import de.telekom.sea7.services.*;

/**
 * Einsatz Rest-Controller übernimmt die Bereitstellung erforderlicher Daten im
 * JSON-Format.
 **/

@RestController
public class ControllerZahlungen {
	/**
	 * @AutoWired teilt Spring mit, wo es mittels Injection Objekte in andere
	 *            Klassen einfügen soll.
	 **/
	@Autowired
	private ZahlungenService zahlungenService;

	/**
	 * Die @Autowired Annotation zeigt Spring an, dass die @Service Bean
	 * ControllerZahlungen die Injektion der Bean ZahlungenService benötigt. Wenn
	 * Sping im IoC Container nun eine Bean vom Typ ZahlungenService findet, so
	 * setzt Spring automatisch im Attribut zahlungenService eine Referenz auf diese
	 * Bean. Spring macht das mit Reflection, daher wird auch keine Setter-Methode
	 * für zahlungenservice benötigt.
	 * 
	 * Für die folgenden Codezeilen ist es ausreichend die Zahlungen zu holen
	 * (get).Der return erfolgt automatisch im JSON-Format
	 * 
	 * @GetMapping: Tag der die Verknüpfung zur Url definiert. Muss in
	 *              den @Controller.
	 **/

	@GetMapping("/zahlungen/")
	public Iterable<EntityZahlungen> getZahlungen() {
		System.out.println(zahlungenService.getZahlungen());
		return zahlungenService.getZahlungen();
	}

	@GetMapping("/zahlung/{id}")
	public Optional<EntityZahlungen> getZahlung(@PathVariable("id") long id) {
		return zahlungenService.getZahlung(id);

	}

	@PostMapping("/zahlung/")
	public String addZahlungen(@RequestBody EntityZahlungen zahlung) {
		zahlungenService.addZahlung(zahlung);

		return "Zahlung raus";
	}

	@PutMapping("/zahlung/{id}")
	public EntityZahlungen updateZahlung(@RequestBody EntityZahlungen zahlung, @PathVariable(name = "id") long id) {

//		Iterable<EntityZahlungen> zahlungen = zahlungenService.getZahlungen();
//		zahlungenService.deleteZahlung(zahlungnummer);
		zahlungenService.updateZahlung(zahlung, id);
		return null;
	}

	@DeleteMapping("/zahlung/{id}")
	public String deleteZahlung(@PathVariable("id") long id) {
		zahlungenService.deleteZahlung(id);
		return "Weg isser";
	}
}
