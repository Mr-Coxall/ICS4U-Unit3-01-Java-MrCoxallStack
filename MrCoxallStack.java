/*
* The stack program uses OOP to create a stack
*
* @author  Mr Coxall
* @version 1.0
* @since   2020-01-01
* Class MrCoxallStack.
*/

import java.util.ArrayList; // import the ArrayList class

public class MrCoxallStack {
        
    // the MrCoxallStack class has
    private ArrayList<Integer> theStack = new ArrayList<Integer>();
    
    /**
    * The push() function.
    *
    * @param pushNumber The int to be added to the stack
    */
    public void push(final int pushNumber) {
        theStack.add(pushNumber);
    }

    /**
    * The showStack method.
    */
    public void showStack() {
        // print out the ShowStack
        System.out.println("The stack list.");
        for (Integer aSingleElement : theStack) {
	        System.out.println(aSingleElement);
	    }
        System.out.println("End of stack list.\n");
    }
}
