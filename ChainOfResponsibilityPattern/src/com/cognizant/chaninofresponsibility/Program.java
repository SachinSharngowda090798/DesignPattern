package com.cognizant.chaninofresponsibility;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the name of Employee: ");
		String employee = scanner.nextLine();
		System.out.print("Enter the number of days you want the leave ");
		int leaveDays = scanner.nextInt();
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployee(employee);
		leaveRequest.setLeaveDays(leaveDays);
		
		ILeaveRequestHandler supervisor = new Supervisor();
		ILeaveRequestHandler projectManager = new ProjectManager();
		ILeaveRequestHandler hr = new HR();
		supervisor.setNextHandler(projectManager);
		projectManager.setNextHandler(hr);
		
		supervisor.handleRequest(leaveRequest);
		
		scanner.close();
	}

}
