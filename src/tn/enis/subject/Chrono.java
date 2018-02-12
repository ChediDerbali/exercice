package tn.enis.subject;

import java.util.ArrayList;
import java.util.List;

import tn.enis.observer.DisplayObserver;
import tn.enis.observer.SonnerieObserver;

public class Chrono extends AbstractChrono {

	private List<SonnerieObserver> sonneries = new ArrayList<>();
	private List<DisplayObserver> displays = new ArrayList<>();

	public void tick(int i, int j, int k) {
		if (heures != k) {
			notifySonnerieObserver();
		}
		secondes = i;
		minutes = j;
		heures = k;
		notifyDisplayObserver();

	}

	@Override
	public void registerDisplayObserver(DisplayObserver observer) {
		displays.add(observer);

	}

	@Override
	public void removeDisplayObserver(DisplayObserver observer) {
		displays.remove(observer);

	}

	@Override
	public void notifyDisplayObserver() {
		for (DisplayObserver o : displays) {
			o.afficheTempsEcoule();
		}

	}

	@Override
	public void registerSonnerieObserver(SonnerieObserver observer) {
		sonneries.add(observer);

	}

	@Override
	public void removeSonnerieObserver(SonnerieObserver observer) {
		sonneries.remove(observer);

	}

	@Override
	public void notifySonnerieObserver() {
		for (SonnerieObserver o : sonneries) {
			o.ding();
		}

	}

}
