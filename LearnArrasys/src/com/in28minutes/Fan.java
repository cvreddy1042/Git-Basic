package com.in28minutes;

public class Fan {
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public byte getSpeed() {
		return speed;
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 1);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);

	}

	public void changeSpeed(int speed) {
		System.out.println(" Fan is set to " + speed);

	}

	public String toString() {
		return String.format("Make - %s , Color - %s, Radius - %f, isOn - %b, Speed - %d", make, color, radius, isOn,
				speed);
	}

}
