package com.in28minutes;

import java.math.BigDecimal;

public class Student {
	
	private String name;
	private int [] listOfMarks;
	
	Student(String name, int[] listOfMarks){
		this.name = name;
		this.listOfMarks =  listOfMarks;
		
	}
	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		return listOfMarks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark:listOfMarks) {
			sum = sum+mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		int maximum = 0;
		for(int mark:listOfMarks) {
			if(mark>maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}

	public int getMinimumMark() {
		int minimum = 100;
		for(int mark:listOfMarks) {
			if(mark<minimum) {
				minimum=mark;
			}
		}
		return minimum;
	}

	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		return null;
	}

}
