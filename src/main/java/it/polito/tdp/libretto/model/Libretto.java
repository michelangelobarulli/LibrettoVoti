package it.polito.tdp.libretto.model;

import java.util.*;

/**
 * Memorizza e gestisce un insieme di voti superati
 * @author USER
 *
 */
public class Libretto {
	
	private List<Voto> voti = new ArrayList<>();
	
	public void add(Voto v) { //operazione di "delega"
		this.voti.add(v);
	}
	
	/**
	 * genera un nuovo libretto, a partire da quello esistente,
	 * che conterra esclusivamente i voti con votaz pari a quella specificata
	 * @param voto con votazione specificata
	 * @return nuovo Libretto "ridotto"
	 */
	public Libretto estraiVotiUguali(int voto) {
		Libretto nuovo = new Libretto();
		for(Voto v: this.voti) {
			if(v.getVoto()==voto)
				nuovo.add(v);
		}
		return nuovo;
	}
	public String toString() {
		String s ="";
		for(Voto v:this.voti) {
			s+= v.toString()+"\n";
		}
		return s;
	}
}
