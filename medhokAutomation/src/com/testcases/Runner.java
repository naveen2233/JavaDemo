package com.testcases;


/**
 * Main executable class to run the test cases
 *
 */
public class Runner {
	
	public static void main(String[] args) {
		Testcase1 tc1= new Testcase1(); 
		
		System.out.println("Execution Started");
		
		tc1.validations();
		
		
		System.out.println("Execution completed");
		
	}
}
