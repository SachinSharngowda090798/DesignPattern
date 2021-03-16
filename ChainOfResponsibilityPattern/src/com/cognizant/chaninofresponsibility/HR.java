package com.cognizant.chaninofresponsibility;

public class HR extends ILeaveRequestHandler{

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()>=5) {
			System.out.println(request.getEmployee() + "'s " + request.getLeaveDays() + " days leave approved by HR");
		}
	}
}