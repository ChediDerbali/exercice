package tn.enis.observer;

import tn.enis.subject.Chrono;

public class Sonnerie2 implements SonnerieObserver {
	private Chrono chrono;

	public Sonnerie2(Chrono chrono) {
		this.chrono = chrono;
		chrono.registerSonnerieObserver(this);
	}

	@Override
	public void ding() {
		System.out.println("Sonnerie2:");
		System.out.println("dongdongdongdong!!!");
	}

}
