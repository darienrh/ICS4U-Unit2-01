/*
* The "Template" program is a template
*
* @author  Darien R-H
* @version 1.0
* @since   2021-12-18
*/

import java.util.Scanner;

/**
* This is a program reverses a string
*/
final class Main {

    /**
    * Constant.
    */
    public static final double CONSTANT = 1;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
       String originalString;
        String reversedString;
        Scanner myInput=new Scanner(System.in);  //Instantiate Scanner for input
        System.out.print("Enter a String :  ");
        originalString = myInput.nextLine();  //get string
        reversedString= reverse(originalString);
        System.out.println("The original string is " + originalString);
        System.out.println("The reversed string (using recursion) is: " + reversedString);
        System.out.println("Done");
    }

    public static String reverse(String workString)
    {
        if (workString.isEmpty()) //Nothing left to reverse end the recursion
                return workString;
        return reverse(workString.substring(1)) + workString.charAt(0); //Add first character to the end and call the function again to continue
    }
}
