package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestLibretto {
	
	Libretto lib;
	private void run() { //uso questo perché non è static! non si lavora dentro il main, si crea un altro metodo richiamato dal main
		this.lib = new Libretto(); //crea libretto vuoto
		Voto v1 = new Voto("Tecniche di programmazione", 30, LocalDate.of(2020, 06, 15));
		Voto v2 = new Voto("Analisi 2", 28, LocalDate.of(2020, 06, 28));
		
		lib.add(v1);
		lib.add(v2);
		lib.add(new Voto("Economia", 24, LocalDate.of(2020, 02, 14)));
		
		System.out.println(this.lib);
		System.out.println(this.lib.estraiVotiUguali(28).toString());
	}
	public static void main(String[] args) {
		TestLibretto test = new TestLibretto();
		test.run();
	}

}
