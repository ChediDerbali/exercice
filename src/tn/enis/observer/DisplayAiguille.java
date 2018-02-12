package tn.enis.observer;

import tn.enis.subject.Chrono;

public class DisplayAiguille implements DisplayObserver {
	private Chrono chrono;

	public DisplayAiguille(Chrono chrono) {
		this.chrono = chrono;
		chrono.registerDisplayObserver(this);
	}

	@Override
	public void afficheTempsEcoule() {
		System.out.println("DisplayAiguille");
		System.out.println(chrono.getHeures() + ":" + chrono.getMinutes() + ":" + chrono.getSecondes());

	}

}
