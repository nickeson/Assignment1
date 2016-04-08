package com.nickeson.Assignment1;

//JDK 1.8.0

/****************************************************************************
 * <b>Title</b>: ValuesStorage.java <p/>
 * <b>Project</b>: WebCrescendo <p/>
 * <b>Description: </b> Put Something Here
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
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Output to console what this program is going to do
		System.out.println("This program will create, store, and display values"
		+ " for the following primitives: int, double, float, char, boolean\n");
	
		// String s="Hello";
		// s+= "World";
		
		// Declare and initialize primitive variable types and then display them 
		int scaleSteps = 12;
		System.out.println("Number of notes in the Western Diatonic Music "
		+ "Scale: " + scaleSteps + "\n");
		
		double goldenRatio = 1.61803398875d;
		System.out.println("Golden Ratio to 11 decimal places: " + goldenRatio + 
		"\n");

		float pi = 3.14159265359f;
		System.out.println("Pi: " + pi + "\n");
		
		char copyrightSymbol = '\u00A9';
		System.out.println("Copyright Symbol: " + copyrightSymbol + "\n");
		
		boolean lightIsOn = true;
		System.out.println("Is the light on?: " + lightIsOn + "\n");
		
		// Display a message indicating the program is done running
		System.out.println("That all, folks!");
		
	}

}
