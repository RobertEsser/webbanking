package de.telekom.sea7.view;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.IBAN;
import de.telekom.sea7.IBANs;
import de.telekom.sea7.Model.Zahlung;
import de.telekom.sea7.Model.Zahlungen;
import de.telekom.sea7.services.*;

/**Einsatz Rest-Controller übernimmt die Bereitstellung erforderlicher 
* Daten im JSON-Format.
**/

@RestController
public class ControllerIBANs {
	@Autowired
	private IBANsService ibansService;

	@GetMapping("/ibans/")
	public IBANs getIbans() {
		return ibansService.getIbans();
	}

	@GetMapping("/ibans/{ibanid}")
	public IBAN getIban(@PathVariable("ibanid") int ibanid) throws SQLException {
		return ibansService.getIbans().get(ibanid);
	}

	@PostMapping("/ibans/")
	public String addIBANs(@RequestBody IBAN iban) throws SQLException {
		IBANs ibans;
		ibans = ibansService.getIbans();
		ibans.add(iban);
		return "IBAN raus";
	}

	@PutMapping("/ibans/{ibanid}")
	public IBAN updateIBAN(@RequestBody IBAN iban,
			@PathVariable(name = "ibanid") int ibanid) {
		IBANs ibans;
		ibans = ibansService.getIbans();
//		ibans.delete(ibanid);
//		ibans.add(ibanid);  ***müssen noch beschrieben werden
		return null;
	}

	@DeleteMapping("/ibans/{ibanid}")
	public IBAN deleteIBAN(@PathVariable("ibanid") int id) {
		IBANs ibans;
		ibans = ibansService.getIbans();
//		ibans.delete(id);  ***muss noch beschrieben werden
		return null;
	}

}

