package de.telekom.sea7.view;
/*
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import de.telekom.sea7.services.ZahlungenService;
import de.telekom.sea7.Model.Zahlung;

@Controller

public class ViewImpl {

	@Autowired
	de.telekom.sea7.services.ZahlungenService zahlungenService;

	@GetMapping("json/zahlung.json")
	@ResponseBody

	public String getJson(@RequestParam("zahlungnummer") int zahlungsnummer) {
		float betrag = zahlungenService.getZahlungen().getZahlung(zahlungsnummer).getBetrag();
		String empfaenger = zahlungenService.getZahlungen().getZahlung(zahlungsnummer).getEmpfaenger();
		String iban = zahlungenService.getZahlungen().getZahlung(zahlungsnummer).getIban();
		String bic = zahlungenService.getZahlungen().getZahlung(zahlungsnummer).getBic();
		String verwendungszweck = zahlungenService.getZahlungen().getZahlung(zahlungsnummer).getVerwendungszweck();
		LocalDateTime datum = zahlungenService.getZahlungen().getZahlung(zahlungsnummer).getDatum();

		String json = "{" + "\"Betrag\"" + ":" + "\"" + betrag + "\"" + "," + "\"Empfaenger\"" + ":" + "\"" + empfaenger
				+ "\"" + "," + "\"IBAN\"" + ":" + "\"" + iban + "\"" + "," + "\"BIC\"" + ":" + "\"" + bic + "\"" + ","
				+ "\"Verwendungszweck\"" + ":" + "\"" + verwendungszweck + "\"" + "," + "\"Datum\"" + ":" + "\"" + datum
				+ "\"" + "}";
		return json;
	}

	@GetMapping("json/zahlungen.json")
	@ResponseBody
	public String getJsonZahlungen() {

		String json = "";
		boolean withkomma = false;

		for (Zahlung z : zahlungenService.getZahlungen()) {
			float betrag = z.getBetrag();
			String empfaenger = z.getEmpfaenger();
			String iban = z.getIban();
			String bic = z.getBic();
			String verwendungszweck = z.getVerwendungszweck();
			LocalDateTime datum = z.getDatum();
			if (withkomma) {
				json = json + ",";
			} else {
				withkomma = true;
			}
			json = json + "{" + "\"Betrag\"" + ":" + "\"" + betrag + "\"" + "," + "\"Empfaenger\"" + ":" + "\""
					+ empfaenger + "\"" + "," + "\"Iban\"" + ":" + "\"" + iban + "\"" + "," + "\"BIC\"" + ":" + "\""
					+ bic + "\"" + "," + "\"Verwendungszweck\"" + ":" + "\"" + verwendungszweck + "\"" + ","
					+ "\"Datum\"" + ":" + "\"" + datum + "\"" + "}";

		}
		return "[" + json + "]";
	}

}
*/
