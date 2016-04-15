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

	public LoopExercise() {
		
	}
	/**
	* 
	* @param args
	*/
	public static void main(String[] args) {
		// 1 to ten counter
		oneToTenCounter();
		counter(1, 10, 1, true);

		// Ten to one counter
		tenToOneCounter();
		counter(10, 1, 1, false);
		
		// Event counter
		evenCounter();
		counter(0, 20, 2, true);
	}
	
	/**
	 * Counter in multiple directions and steps
	 * @param start Starting value for the counter
	 * @param end Ending value of the counter
	 * @param step Number of steps per iteration.
	 * @param forward Determines the counter direction.
	 */
	public static void counter(int start, int end, int step, boolean forward) {
		if (! forward) step = step * -1;
		
		for (int i = start; i < end; i += step) {
			System.out.println("Value: " + i);
		}
	}
	
	/**
	 * Creates a loop to display the integers 1-10, and then reversed 10-1
	 */
	public static void oneToTenCounter() {
		System.out.println("First we print positive integer values from 1-10\n");
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
		System.out.println("\nNext we print the same values in reverse order\n");
		
		for(int revCounter=10; revCounter>=1; revCounter--){
            System.out.println("Value: " + revCounter);	
		}
	}
	
	/**
	 * Creates a loop to display only the even integers between 1 and 20
	 */
	public static void evenCounter() {
		System.out.println("\nNext we print positive, even integers from 1-20\n");
		
		int evensCounter = 2;
		while (evensCounter <= 20) {
			System.out.println("Value: " + evensCounter);	
			evensCounter += 2;
		}
	}

}
