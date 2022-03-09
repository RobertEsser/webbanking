package de.telekom.sea7.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.telekom.sea7.Model.Zahlung;
import de.telekom.sea7.Model.Zahlungen;
import de.telekom.sea7.entity.EntityZahlungen;
import de.telekom.sea7.repository.ZahlungenRepository;

@Service
/** Service - sollte immer ein Interface haben **/
public class ZahlungenService {

	/**
	 * Hier wird eine neue Objektinstanz erstellt welche in der Klasse ZahlungenRepository
	 * beschrieben ist
	 */
	@Autowired
	private ZahlungenRepository repository;

	public Iterable<EntityZahlungen> getZahlungen() {
		Iterable<EntityZahlungen> zahlungen = repository.findAll();
		return zahlungen;

	}

	public Optional<EntityZahlungen> getZahlung(long id) {
		Optional<EntityZahlungen> zahlung = repository.findById(id);
//		if(zahlung.isPresent()){
		return zahlung;
//		else {
//		return repository.findById((long) 0);

	}

	public String deleteZahlung(long id) {
		repository.deleteById(id);
		return "Datensatz geloescht";

	}

	public EntityZahlungen addZahlung(EntityZahlungen zahlung) {
		EntityZahlungen zahlung2 = repository.save(zahlung);
		return zahlung2;

	}

	public EntityZahlungen updateZahlung(EntityZahlungen zahlung, long id) {
		repository.save(zahlung);
		return zahlung;
	}
}

/*
 * public Zahlungen getZahlungen() { return zahlungen; }
 * 
 * public void setZahlungen(Zahlungen zahlungen) { this.zahlungen = zahlungen; }
 * 
 * public Zahlung getZahlung(int zahlungnummer) { return
 * getZahlungen().getZahlung(zahlungnummer);
 * 
 * }
 * 
 * }
 */