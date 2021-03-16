package com.cognizant.chaninofresponsibility;

public abstract class ILeaveRequestHandler {
	private ILeaveRequestHandler nextHandler;

	public ILeaveRequestHandler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public abstract void handleRequest(LeaveRequest request);

}