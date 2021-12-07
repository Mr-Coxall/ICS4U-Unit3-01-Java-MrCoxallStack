import java.util.ArrayList; // import the ArrayList class

public class MrCoxallStack {
        
    // the MrCoxallStack class has
    ArrayList<Integer> theStack = new ArrayList<Integer>();
    
    // push method
    public void Push(int pushNumber) {
        theStack.add(pushNumber);
    }

    // push method
    public void ShowStack() {
        // print out the ShowStack
        System.out.println("The stack list.");
        for (Integer aSingleElement : theStack) { 		      
	        System.out.println(aSingleElement); 		
	    }
        System.out.println("End of stack list.\n");
    }
}