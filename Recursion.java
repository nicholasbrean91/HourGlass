//Created On: Dec 2018
//Created By: Nicholas Brean
//This program is a simple example of recursion using an hour glass formation.

import java.util.Scanner;

public class Recursion {

	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		int hourglassInput;
		System.out.print("Please enter a value higher than 0: ");
		System.out.println("");
		
		hourglassInput = userInput.nextInt();
		
		if (hourglassInput < 1){
			System.out.print("Please enter in a value which is greater than 0");
			System.exit(0);
		}
		
		Calculations obj = new Calculations();
		obj.Downhourglass(hourglassInput, 0);
		obj.uphourglass(hourglassInput, 0);
		
	}
}
