package com.java1.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values = new ArrayList<Integer>(Arrays.asList(0,1));
		
		incrementFibonacci(values, 34);
		
		values.forEach(System.out::println);
	}
	
	private static List<Integer> incrementFibonacci(List<Integer> values, int finalValue) {
		
	
		int soma = values.get(values.size()-1) + values.get(values.size()-2);
		
		values.add(soma);
		
		if(soma == finalValue) {
			return values;
		}
		
		return incrementFibonacci(values, finalValue);
	}

}
