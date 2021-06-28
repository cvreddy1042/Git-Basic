package com.in28minutes;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public int areaOfRectangle() {
		return length * width;

	}

	public int perimeterOfRectangle() {
		return 2 * (length + width);

	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public String toString() {
		return String.format("Length - %d, Width - %d, Area - %d,Perimeter - %d", length, width, areaOfRectangle(),
				perimeterOfRectangle());
	}

}
