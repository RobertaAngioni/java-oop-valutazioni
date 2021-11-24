package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Calcolavalutazione[] array = new Calcolavalutazione[20];
		
		Random randomGen = new Random();
		
		int idStudenti = 0;
		int percentualeAssenze = 0;
		double mediaVoti = 0.0;
		
		for(int i = 0; i < array.length; i++) {
			idStudenti++;
			percentualeAssenze = randomGen.nextInt(101);
			mediaVoti = randomGen.nextInt(6);
			
			array[i] = new Calcolavalutazione(idStudenti, percentualeAssenze, mediaVoti); 
			
			System.out.println("Lo studente numero " + idStudenti + " " + array[i].valutazioneStudenti());
			
			
		}
		
		
		

	}

}
