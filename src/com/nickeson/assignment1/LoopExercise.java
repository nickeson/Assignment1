package com.nickeson.assignment1;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: LoopExercise.java <p/>
 * <b>Project</b>: Assignment1 Part II <p/>
 * <b>Description: </b> Create class to display numbers 1-10 using while loop, 
 * then repeat the output in reverse order using for statement, 
 * then display only the even numbers 1-20 using a loop of some kind 
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 8, 2016<p/>
 * @updates:
 ****************************************************************************/

public class LoopExercise {

	/**
	 * default constructor
	 */
	public LoopExercise() {
		
	}
	
	/**
	* main method calls various counting methods for illustration purposes
	* @param args
	*/
	public static void main(String[] args) {
		// demos One to Ten counter
		System.out.println("First we print positive integer values from 1-10\n");
		oneToTenCounter();
		
		// demos Ten to One counter
		System.out.println("\nNext we print the same values in reverse order\n");
		tenToOneCounter();
		
		// demos even number counter
		System.out.println("\nNext we print positive, even integers from 1-20\n");
		evenCounter();
		
		// demos counter using non-default (passed) values
		System.out.println("\nNext we'll demonstrate counting by passing params\n");
		
		// backward
		counter(10, 1, 1, false);
		System.out.println("");
		
		// forward
		counter(0, 20, 2, true);
		System.out.println("");	
	}
	
	/**
	 * Generic Counter in multiple directions and steps
	 * @param start Starting value for the counter
	 * @param end Ending value of the counter
	 * @param step Number of steps per iteration.
	 * @param forward Determines the counter direction.
	 */
	public static void counter(int start, int end, int step, boolean forward) {
		if (! forward) {
			// printout range of values for backward loop
			for (int i = start; i >= end; i -= step) {
				System.out.println(start);
				System.out.println(end);
				System.out.println("Value: " + i);
			}
		}
		
		// printout range of values for forward loop
		for (int i = start; i <= end; i += step) {
			System.out.println(start);
			System.out.println(end);
			System.out.println("Value: " + i);
		}
	}
	
	/**
	 * Creates a loop to display the integers 1-10, and then reversed 10-1
	 */
	public static void oneToTenCounter() {
		int counter = 1;
		
		while (counter < 11) {
			System.out.println("Value: " + counter);
			counter++;
		}
	}
	
	/**
	 * Creates a loop to display the integers 1-10 in reverse order
	 */
	public static void tenToOneCounter() {
		for(int revCounter=10; revCounter>=1; revCounter--){
            System.out.println("Value: " + revCounter);	
		}
	}
	
	/**
	 * Creates a loop to display only the even integers between 1 and 20
	 */
	public static void evenCounter() {
		int evensCounter = 2;
		while (evensCounter <= 20) {
			System.out.println("Value: " + evensCounter);	
			evensCounter += 2;
		}
	}
}