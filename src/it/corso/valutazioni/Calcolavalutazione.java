package it.corso.valutazioni;

public class Calcolavalutazione {

	// attributi
	
	int idStudenti;
	int percentualeAssenze;
	double mediaVoti;
	
	//costruttori
	
	Calcolavalutazione (int idStudenti, int percentualeAssenze, double mediaVoti){
		this.idStudenti = idStudenti;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
		
	}
	
	
	//metodo
	
	String valutazioneStudenti() {
		String valutazioneStudenti = "";
		if(percentualeAssenze > 50) {
			valutazioneStudenti = "� bocciato";
		} else if(percentualeAssenze >= 25 && percentualeAssenze <= 50) {
			valutazioneStudenti = "� promosso";
		} else if(percentualeAssenze < 25 && mediaVoti >= 2) {
			valutazioneStudenti = "� promosso";
		} else {
			valutazioneStudenti = "� bocciato";
		}
		
		return valutazioneStudenti;
	}
	

		
	}
	

