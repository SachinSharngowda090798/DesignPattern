package com.cognizant.pattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpeeCheck {

	@Test
	public void  whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeryron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}
	
	@Test
	public void  whenConvertingUSDToEURO_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeryron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		assertEquals(bugattiVeyronAdapter.getPrice(),224.58668, 0.00001);
	}

}
