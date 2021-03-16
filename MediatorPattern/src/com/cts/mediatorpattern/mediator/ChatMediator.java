package com.cts.mediatorpattern.mediator;

import java.util.ArrayList;
import java.util.List;

import com.cts.mediatorpattern.objects.IUser;

public class ChatMediator implements IChatMediator {
	
	private List<IUser> users;

	@Override
	public void addUser(IUser user) {
		
		users.add(user);
		
	}

	public ChatMediator() {
		users = new ArrayList<>();
	}

	@Override
	public void sendMessage(IUser user, String message) {
		users.stream().filter(u -> u!=user).forEach(u -> u.receiveMessage(message));;		
	}
	
	
}
