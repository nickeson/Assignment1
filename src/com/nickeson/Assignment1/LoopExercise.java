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

		// Creates a loop to display the numbers 1-10, and then reversed 10-1
		int counter = 1;
		while (counter < 11) {
			System.out.println("Value: " + counter);
			counter++;
			
		}
		
		System.out.println("\nNext we will print the values in reverse order\n");
		
		for(int revCounter=10; revCounter>=1; revCounter--){
            System.out.println("Value: " + revCounter);	
		}

		System.out.println("\nNext we will print only the even values from 1-20\n");
		
		int evensCounter = 2;
		while (evensCounter <= 20) {
		System.out.println("Value: " + evensCounter);	
		evensCounter += 2;

		}
	}

}
