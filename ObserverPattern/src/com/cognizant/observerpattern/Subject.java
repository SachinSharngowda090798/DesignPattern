package com.cognizant.observerpattern;

public abstract class Subject

{
	private String state;

	public abstract void attach(Observer o);

	public abstract void detach(Observer o);

	public abstract void notifyUpdate();

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		this.notifyUpdate();
	}

}