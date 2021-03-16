package com.cts.mediatorpattern;

import java.util.Scanner;

import com.cts.mediatorpattern.mediator.ChatMediator;
import com.cts.mediatorpattern.objects.BasicUser;
import com.cts.mediatorpattern.objects.IUser;
import com.cts.mediatorpattern.objects.PremiumUser;

public class Driver {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ChatMediator chatMediator = new ChatMediator();
		
		int choice;
		
		do {
		System.out.print("Enter type of User: ");
		String type = scanner.next();
		
		System.out.print("Enter user name: ");
		String name = scanner.next();
		if(type.equalsIgnoreCase("basic")) {
			IUser basic = new BasicUser(chatMediator, name);
			chatMediator.addUser(basic);
			System.out.println("Do you want to send message? Yes/No - ");
			if(scanner.next().equalsIgnoreCase("yes")) {
				System.out.print("Enter message: ");
				scanner.nextLine();
				String message = scanner.nextLine();
				basic.sendMessage(message);
			}
				
		} 
		else if(type.equalsIgnoreCase("premium")) {
			IUser premium = new PremiumUser(chatMediator, name);
			chatMediator.addUser(premium);
			System.out.println("Do you want to send message? Yes/No - ");
			if(scanner.next().equalsIgnoreCase("yes")) {
				System.out.print("Enter message: ");
				scanner.nextLine();
				String message = scanner.nextLine();
				premium.sendMessage(message);
			}
				
		}
		
		System.out.println("Enter 1 to continue or any other to exit");
		choice = scanner.nextInt();
		}while(choice==1);

		scanner.close();
	}

}
