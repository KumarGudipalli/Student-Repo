package com.masai.arrays;
 import java.math.BigDecimal;
public class StudentRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] marks = {97, 99, 100};
		
		Student student = new Student("Mohan", marks);
 
		// length of marks array
		int number = student.getNumberOfMarks();
		System.out.println("Number Of Marks "+number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of Marks "+sum);
//		
		int maxMark = student.getMaximumMarks();
		System.out.println("Max Mark "+maxMark);
		
		int minMark = student.getMinimumMarks();
		System.out.println("Minimum Mark "+minMark);
		
//		
         BigDecimal average = student.getAverageMarks(maxMark,minMark);
		System.out.println("average Mark "+ average);
	}
}
