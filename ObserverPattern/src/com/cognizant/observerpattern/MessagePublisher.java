package com.cognizant.observerpattern;

import java.util.ArrayList;

import java.util.List;

public class MessagePublisher extends Subject {

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void attach(Observer o) {

		observers.add(o);
		this.setState(o.getClass().getSimpleName() + " attached");

	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
		this.setState(o.getClass().getSimpleName() + " detached");
	}

	@Override
	public void notifyUpdate() {
		for (Observer o : observers) {
			o.update(new Message(getState()));
		}
	}
}