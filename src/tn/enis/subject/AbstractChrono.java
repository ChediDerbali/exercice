package tn.enis.subject;


import tn.enis.observer.DisplayObserver;
import tn.enis.observer.SonnerieObserver;

public abstract class AbstractChrono {
	protected int secondes;
	protected int minutes;
	protected int heures;
	
	
	public int getSecondes() {
		return secondes;
	}
	public int getMinutes() {
		return minutes;
	}
	public int getHeures() {
		return heures;
	}
	
	public abstract void tick(int i, int j, int k) ;

	public abstract void registerDisplayObserver(DisplayObserver observer);
	public abstract void removeDisplayObserver(DisplayObserver observer);
	public abstract void notifyDisplayObserver();
	
	public abstract void registerSonnerieObserver(SonnerieObserver observer);
	public abstract void removeSonnerieObserver(SonnerieObserver observer);
	public abstract void notifySonnerieObserver();
}
