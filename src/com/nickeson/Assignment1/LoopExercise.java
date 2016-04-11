package com.nickeson.Assignment1;

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
		
		System.out.println("First we print positive integer values from 1-10\n");
		
		/**
		 * Creates a loop to display the integers 1-10, and then reversed 10-1
		 */
		int counter = 1;
		while (counter < 11) {
			System.out.println("Value: " + counter);
			counter++;
			
		}
		
		System.out.println("\nNext we print the same values in reverse order\n");
		
		/**
		 * Creates a loop to display the integers 1-10 in reverse order
		 */
		for(int revCounter=10; revCounter>=1; revCounter--){
            System.out.println("Value: " + revCounter);	
		}

		System.out.println("\nNext we print positive, even integers from 1-20\n");
		
		/**
		 * Creates a loop to display only the even integers between 1 and 20
		 */
		int evensCounter = 2;
		while (evensCounter <= 20) {
		System.out.println("Value: " + evensCounter);	
		evensCounter += 2;

		}
	}

}
