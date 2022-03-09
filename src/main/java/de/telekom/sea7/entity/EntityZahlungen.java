package de.telekom.sea7.entity;
/** Diese Klasse dient als Beschreibung für Zahlungen und 
 * beinhaltet die Entität der DB-Tabelle mit Namen Zahlungen.
 * 
 */

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "zahlungen")

public class EntityZahlungen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private float betrag;
	private String empfaenger;
	private String verwendungszweck;
	private LocalDateTime datum;
	
	/**
	 * Durch die Annotation @JoinColumn wir die Spalte "iban_id" als die Spalte
	 * festgelegt welche zur EntityIban die Verindung (Join) herstellt.@ManyToOne
	 * (Mapping) besagt das es mehrere Zahlungen zu einer IBAN geben könnte
	 */
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="iban_id" )
	private EntityIBAN entityiban;
	

	public EntityZahlungen() {

	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public float getBetrag() {
		return betrag;
	}


	public void setBetrag(float betrag) {
		this.betrag = betrag;
	}


	public String getEmpfaenger() {
		return empfaenger;
	}


	public void setEmpfaenger(String empfaenger) {
		this.empfaenger = empfaenger;
	}


	public String getVerwendungszweck() {
		return verwendungszweck;
	}


	public void setVerwendungszweck(String verwendungszweck) {
		this.verwendungszweck = verwendungszweck;
	}


	public LocalDateTime getDatum() {
		return datum;
	}


	public void setDatum(LocalDateTime datum) {
		this.datum = datum;
	}


	public EntityIBAN getEntityiban() {
		return entityiban;
	}


	public void setEntityiban(EntityIBAN entityiban) {
		this.entityiban = entityiban;
	}
}

	