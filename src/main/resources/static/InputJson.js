

function empfaenger1(antwort) {
	console.log("Die Daten wurden empfangen");
	console.log(antwort);

	var json = antwort.json();
	return json;   //Übergabe in die fetch-funktion
}

function empfaenger2(zahlung) {  //return von empfänger1 wird an empfänger 2 übergeben.
	//    console.log(zahlung);
	if (zahlung == null) {
		alert("Falsche ID !")
	}
	else {
		console.log(zahlung.betrag);
		console.log(zahlung.empfaenger);
		console.log(zahlung.entityiban.iban);
		console.log(zahlung.entityiban.entityBIC.bic);
		console.log(zahlung.verwendungszweck);
		console.log(zahlung	/**
	 * Durch die Annotation @JoinColumn wir die Spalte "iban_id" als die Spalte
	 * festgelegt welche zur EntityIban die Verindung (Join) herstellt.@ManyToOne
	 * (Mapping) besagt das es mehrere Zahlungen zu einer IBAN geben könnte
	 */.datum);

		document.getElementById("betrag").value = zahlung.betrag;
		document.getElementById("empfaenger").value = zahlung.empfaenger;
		document.getElementById("iban").value = zahlung.entityiban.iban;
		document.getElementById("bic").value = zahlung.entityiban.entityBIC.bic;
		document.getElementById("verwendungszweck").value = zahlung.verwendungszweck;
		document.getElementById("datum").value = zahlung.datum;

	}
}



function mit_suche_daten_abrufen() {
	//Eingabe
	var key = document.getElementById("eingabe").value;

	//Verarbeitung
	//	fetch("/zahlung/" + key)
	fetch("/zahlung/" + key) //Url:was wird geholt
		.then(empfaenger1)             // was macht man damit: auspacken
		.then(empfaenger2);            // was macht man damit: ausgeben 
}
function verschicken() {
	var url = "/zahlung/";

	var empfaenger = document.getElementById("empfaenger").value; // statt "Paul" ... ?
	var betrag = document.getElementById("betrag").value;
	var entityBIC = { bic: document.getElementById("bic").value };
	var entityIBAN = { iban: document.getElementById("iban").value, entityBIC: entityBIC };
	var verwendungszweck = document.getElementById("verwendungszweck").value;
	var datum = document.getElementById("datum").value;

	console.log(empfaenger);
	console.log(betrag);
	console.log(iban);
	console.log(bic);
	console.log(verwendungszweck);
	console.log(datum);

	var data = {
		empfaenger: empfaenger,
		betrag: betrag,
		entityiban: entityIBAN,
		verwendungszweck: verwendungszweck,
		datum: datum,
	};



	console.log(data);

	var datajson = JSON.stringify(data); // JSON-Object to String in var datajson ablegen

	console.log(datajson);

	// Verschicken der Daten
	fetch(url,
		{
			headers: { "Content-Type": "application/json" },
			method: "POST", // "GET"
			body: datajson // Der body muss ein string sein,deshalb die Umwandlung
		}
	).then(alert("Datensatz wurde angelegt"));

}
function update() {
	var key = document.getElementById("eingabe").value;
	var url = "/zahlung/" + key;
	var id = key
	var empfaenger = document.getElementById("empfaenger").value; // statt "Paul" ... ?
	var betrag = document.getElementById("betrag").value;
	var entityBIC = { bic: document.getElementById("bic").value };
	var entityIBAN = { iban: document.getElementById("iban").value, entityBIC: entityBIC };
	var verwendungszweck = document.getElementById("verwendungszweck").value;
	var datum = document.getElementById("datum").value;

	console.log(empfaenger);
	console.log(betrag);
	console.log(iban);
	console.log(bic);
	console.log(verwendungszweck);
	console.log(datum);

	var data = {
		id: key,
		empfaenger: empfaenger,
		betrag: betrag,
		entityiban: entityIBAN,
		verwendungszweck: verwendungszweck,
		datum: datum,
	};



	console.log(data);

	var datajson = JSON.stringify(data); // JSON-Object to String in var datajson ablegen

	console.log(datajson);

	// Verschicken der Daten
	fetch(url,
		{
			headers: { "Content-Type": "application/json" },
			method: "PUT", // "GET"
			body: datajson // Der body muss ein string sein,deshalb die Umwandlung
		}
	).then(alert("Datensatz wurde geaendert"));

}


function loeschen() {
	var key = document.getElementById("eingabe").value;

	fetch("/zahlung/" + key,

		{
			headers: { "Content-Type": "application/json" },
			method: "DELETE", // "GET"
			body: key // Der body muss ein string sein,deshalb die Umwandlung
		}).then(alert("Datensatz wurde geloescht"));

}

//Listenerconsole.log(Empfaenger);
document.getElementById("absenden").addEventListener("click", verschicken);
document.getElementById("suchestarten").addEventListener("click", mit_suche_daten_abrufen);
document.getElementById("loeschen").addEventListener("click", loeschen);
document.getElementById("update").addEventListener("click", update);