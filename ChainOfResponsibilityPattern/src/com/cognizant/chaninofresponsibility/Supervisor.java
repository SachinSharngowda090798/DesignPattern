package com.cognizant.chaninofresponsibility;

public class Supervisor extends ILeaveRequestHandler {

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()>=1 && request.getLeaveDays()<=3) {
			System.out.println(request.getEmployee() + "'s " + request.getLeaveDays() + " days leave approved by Supervisor");
		}else {
			this.getNextHandler().handleRequest(request);
		}
		
	}

}