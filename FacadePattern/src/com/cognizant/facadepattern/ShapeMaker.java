package com.cognizant.facadepattern;

public class ShapeMaker {

	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	void drawCircle() {
		circle.draw();
	}

	void drawRectangle() {
		rectangle.draw();
	}

	void drawSquare() {
		square.draw();
	}
}
