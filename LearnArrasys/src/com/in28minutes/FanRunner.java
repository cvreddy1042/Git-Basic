package com.in28minutes;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fan fan = new Fan("Hisense", 2.2, "white");
		System.out.println(fan);
		fan.switchOn();
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);

	}

}
