package com.nickeson.assignment1;

/****************************************************************************
 * <b>Title</b>: ValuesStorage.java <p/>
 * <b>Project</b>: Assignment, Part I <p/>
 * <b>Description: </b> Create, assign and print values for various primitives 
 * <p/>
 * <b>Copyright:</b> Copyright (c) 2016<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author nickeson
 * @version 1.0
 * @since Apr 7, 2016<p/>
 * @updates:
 ****************************************************************************/

public class ValuesStorageDisplay {
	
	public ValuesStorageDisplay() {

	}
	
	/**
	 * Entry method.  Displaying variables
	 * @param args Command line arguments.  Not used in this context
	 */
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(64);
		sb.append("This program will create, store, and display values ");
		sb.append("for the following primitives: int, double, float, char, boolean\n");
		
		// Output to console what this program is going to do
		System.out.println(sb);

		// Declare and initialize primitive variable types and then display them 
		int scaleSteps = 12;
		sb = new StringBuilder(32);
		sb.append("Number of notes in the Western Diatonic Music ");
		sb.append("Scale: ").append(scaleSteps).append("\n");
		System.out.println(sb);
		
		double goldenRatio = 1.61803398875d;
		System.out.println("Golden Ratio to 11 decimal places: " + goldenRatio + "\n");

		float pi = 3.14159265359f;
		System.out.println("Pi: " + pi + "\n");
		
		char copyrightSymbol = '\u00A9';
		System.out.println("Copyright Symbol: " + copyrightSymbol + "\n");
		
		boolean lightIsOn = true;
		System.out.println("Is the light on?: " + lightIsOn + "\n");
		
		// Display a message indicating the program is done running
		System.out.println("That all, folks!");
		
		LoopExercise.oneToTenCounter();
		
	}

}
