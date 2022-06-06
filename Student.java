package com.masai.arrays;

import java.math.BigDecimal;

public class Student {

	private String name;
	private int[] marks;
	
	public Student(String string, int[] marks2) {
		// TODO Auto-generated constructor stub
		this.name = string;
		System.out.println(name);
		
		this.marks = marks2;
		for(int i=0; i<marks.length; i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		return  marks.length*100;
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int mark:marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumMarks() {
		// TODO Auto-generated method stub
		int max = marks[0];
		for(int j : marks) {
			if(max < j) {
				max = j;
			}
		}
		return max;
	}

	public int getMinimumMarks() {
		// TODO Auto-generated method stub
		int min = marks[0];
		for(int j : marks) {
			if(min > j) {
				min = j;
			}
		}
		return min;
	}

	public BigDecimal getAverageMarks(int max, int min) {
		// TODO Auto-generated method stub
		BigDecimal val1 = new BigDecimal(max);
		BigDecimal val2 = new BigDecimal(min);
		BigDecimal val3 = new BigDecimal("2");
		
		BigDecimal ans = val1.add(val2);
		
		BigDecimal avg =ans.divide(val3);
		
		return avg;
	
		
	}}
