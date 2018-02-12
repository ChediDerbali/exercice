package tn.enis.observer;
a
import tn.enis.subject.Chrono;

public class Sonnerie1 implements SonnerieObserver {
	private Chrono chrono;

	public Sonnerie1(Chrono chrono) {
		this.chrono = chrono;
		chrono.registerSonnerieObserver(this);
	}

	@Override
	public void ding() {
		System.out.println("Sonnerie1:");
		System.out.println("dingdingdingding!!!");
	}

}
