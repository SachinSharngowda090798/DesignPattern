package com.cognizant.facadepattern;

import java.util.Scanner;

public class FacadePatternDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int choice;

		do {
			System.out.print("========= Shape Maker ============ \n");
			System.out.print("            1. Circle.              \n");
			System.out.print("            2. Rectangle.              \n");
			System.out.print("            3. Square.            \n");
			System.out.print("            4. Exit.                     \n");
			System.out.print("Enter your choice: ");

			ShapeMaker shapeMaker = new ShapeMaker();
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				shapeMaker.drawCircle();
				break;
			case 2:
				shapeMaker.drawRectangle();
				break;
			case 3:
				shapeMaker.drawSquare();
				break;
			default:
				System.out.println("Nothing You purchased");

			}

		} while (choice != 4);

		scanner.close();
	}
}
