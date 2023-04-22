package com.java1.demo;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isArmstrongNumber(153));
	}
	
	public static String isArmstrongNumber(Integer number) {
		
		char[] digits = String.valueOf(number).toCharArray();
		
		int sum = 0;
		
		for(char digit: digits) {
			
			sum+= (int)Math.pow(Character.getNumericValue(digit), 3);
		}
		
		if(sum == number) {
			return number.toString()+" is an Armstrong number.";
		}
		return number.toString()+" is not an Armstrong number.";
	}

}
