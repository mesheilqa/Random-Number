package question3;

//Java code for kth smallest element 
//in an array 
import java.util.Arrays; 
import java.util.Collections;
import java.util.Random; 

public class Randomnumber {

	  public static void main(String[] args) {
	        
		  // Initialization of Variables
		  	int[] randomNumbers = new int[500];
	        int minimumNumber = Integer.MAX_VALUE;
	        int loopcount = 0;
	       
	        // Setting Up An Upper Bond
	        int upperbond = 500;
	        
	        while(loopcount < randomNumbers.length-1) {

	            Random rand = new Random();

	            //Generate random number that is bound between 0 and 500.
	            randomNumbers[loopcount] = rand.nextInt(upperbond);
	            
	            // If number is not greater than minimum than set minimumNumber as new random generated number
	            if(randomNumbers[loopcount]< minimumNumber) {
	                minimumNumber = randomNumbers[loopcount];
	            }
	            
	            loopcount++;
	            	            
	        }
	        
	        
	        //Printing the Output Of Program
	        
	        System.out.println("Array generated randomly:");
	        System.out.println(Arrays.toString(randomNumbers));

	        System.out.println("The nth minimum number is "+ minimumNumber);
	    }
}