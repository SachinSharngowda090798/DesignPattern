package com.cts.mediatorpattern.objects;

import com.cts.mediatorpattern.mediator.IChatMediator;

public class PremiumUser implements IUser {
	
	private IChatMediator chatMediator;
	private String name;
	
	@Override
	public void receiveMessage(String message) {
		
		System.out.println("User: " + name + " -- Message: " + message);
		
	}

	@Override
	public void sendMessage(String message) {

		chatMediator.sendMessage(this,message);
		
	}

	public PremiumUser(IChatMediator chatMediator, String name) {
		this.chatMediator = chatMediator;
		this.name = name;
	}

}
