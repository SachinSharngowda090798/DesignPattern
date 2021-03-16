package com.cognizant.pattern;

public class MovableAdapterImpl implements MovableAdapter {
	
	private Movable luxuryCars;
	
	public MovableAdapterImpl(Movable cars) {
		this.luxuryCars = cars;
	}

	@Override
	public double getSpeed() {
		 return convertMPHtoKMPH(luxuryCars.getSpeed());
	}
	
	private double convertMPHtoKMPH(double mph)
	{
		return mph * 1.60934; 
	}
	
	
	@Override
	public double getPrice() {
		 return convertUSDtoEURO(luxuryCars.getPrice());
	}
	
	private double convertUSDtoEURO(double euro)
	{
		return euro*0.83801; 
	}
	
}
