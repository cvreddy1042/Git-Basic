package com.in28minutes;

import java.util.Arrays;

public class DaysofWeekRunner {

	public static void main(String[] args) {

		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String s = "";
		for (String day : daysOfWeek) {
			if (day.length() > s.length()) {
				s = day;
			}

		}
		System.out.println(Arrays.toString(daysOfWeek));

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}

	}
}