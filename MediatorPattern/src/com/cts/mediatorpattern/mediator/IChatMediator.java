package com.cts.mediatorpattern.mediator;

import com.cts.mediatorpattern.objects.IUser;

public interface IChatMediator {
	
	void addUser(IUser user);
	void sendMessage(IUser user, String message);
	
}
