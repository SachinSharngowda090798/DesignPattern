package com.cognizant.chaninofresponsibility;

public class ProjectManager extends ILeaveRequestHandler {

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()>3 && request.getLeaveDays()<=5) {
			System.out.println(request.getEmployee() + "'s " + request.getLeaveDays() + " days leave approved by Project Manager");
		}else {
			this.getNextHandler().handleRequest(request);
		}
		
	}
	
}