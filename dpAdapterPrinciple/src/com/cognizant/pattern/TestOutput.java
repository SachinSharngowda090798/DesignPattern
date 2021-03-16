package com.cognizant.pattern;

public class TestOutput {

	public static void main(String[] args)
	{
		Movable bugattiVeryron=new BugattiVeryron();
		MovableAdapter bugattiVeryronAdapter =new MovableAdapterImpl(bugattiVeryron);
		System.out.println("Speed in KMPH :"+bugattiVeryronAdapter.getSpeed());
		System.out.println("Price in EURO :"+bugattiVeryronAdapter.getPrice());
		
	}
	
	
}
