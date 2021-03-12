package com.cognizant.factorypattern;

import com.cognizant.factorypattern1.Android;
import com.cognizant.factorypattern1.OS;
import com.cognizant.factorypattern1.OperatingSystemFactory;
import com.cognizant.factorypattern1.Windows;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OS obj=new Android();
		//obj.spec();
       
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS obj=osf.getInstance("Open");
		obj.spec();
	}

}
