package tn.enis.observer;

import tn.enis.subject.Chrono;

public class DisplayNumerique implements DisplayObserver {
	private Chrono chrono;

	public DisplayNumerique(Chrono chrono) {
		this.chrono = chrono;
		chrono.registerDisplayObserver(this);
	}

	@Override
	public void afficheTempsEcoule() {
		System.out.println("DisplayNumerique");
		System.out.println(chrono.getHeures() + ":" + chrono.getMinutes() + ":" + chrono.getSecondes());
	}

}
