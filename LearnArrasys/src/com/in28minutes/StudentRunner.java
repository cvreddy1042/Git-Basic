package com.in28minutes;

public class StudentRunner {

	public static void main(String[] args) {
		
		int[] listOfMarks = {100,99,100,98,100,99};
		Student student = new Student("Venkat",listOfMarks );
		int number = student.getNumberOfMarks();
		System.out.println("Number of marks: "+ number);
	int sum = student.getTotalSumOfMarks();
	System.out.println("Total Sum of Marks: "+sum );
	int maximumMark = student.getMaximumMark();
	System.out.println("Maximum Mark of student = "+ maximumMark);
	int minimumMark = student.getMinimumMark();
	System.out.println("Minimum Mark of student = "+ minimumMark);
//		BigDecimal average  = student.getAverageMarks();

	}

}
