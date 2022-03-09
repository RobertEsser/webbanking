package de.telekom.sea7.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.Model.Kunde;
import de.telekom.sea7.Model.Kunden;
import de.telekom.sea7.services.KundenService;
/**
 * Einsatz Rest-Controller übernimmt die Bereitstellung erforderlicher 
 * Daten im JSON-Format.
 *
 */

@RestController
public class ControllerKunden {
	@Autowired
	private KundenService kundenService;

	@GetMapping("/kunden/")
	public Kunden getKunden() {
		return kundenService.getKunden();
	}

	@GetMapping("/kunde/{kundennummer}")
	public Kunde getKunde(@PathVariable("kundennummer") int kundennummer) {
		return kundenService.getKunden().getKunde(kundennummer);

	}

}
