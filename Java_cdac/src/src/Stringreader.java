/*Write a Java program to get the character 
at the given index within the String.*/

package src;

public class Stringreader {

	public static void main(String[] args) {
		 String str = "Hello Lokesh!";
	        System.out.println("Original String = " + str);
	        // Get the character at positions 0 and 10.
	        int index1 = str.charAt(0);
	        int index2 = str.charAt(10);

	        // Print out the results.
	        System.out.println("The character at position 0 is " +
	            (char)index1);
	        System.out.println("The character at position 10 is " +
	            (char)index2);
	}

}
/*Original String = Hello Lokesh!
The character at position 0 is H
The character at position 10 is s*/