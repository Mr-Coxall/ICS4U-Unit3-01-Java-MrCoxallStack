/*
* The stack program uses OOP to create a stack
*
* @author  Mr Coxall
* @version 1.0
* @since   2020-01-01
* Class Main.
*/

final class Main {

    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * One value to enter into stack.
    */
    public static final int FORTY_TWO = 42;

    /**
    * Another value to enter into stack.
    */
    public static final int TWENTY_FOUR = 24;

    /**
    * The stack program.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // use MrCoxallStack class
        MrCoxallStack aStack = new MrCoxallStack();
        int tempElement;

        System.out.println("The initial stack is empty.\n");
        aStack.showStack();

        System.out.println("Adding 42.");
        aStack.push(FORTY_TWO);
        aStack.showStack();

        System.out.println("Adding 24.");
        aStack.push(TWENTY_FOUR);
        aStack.showStack();

        System.out.println("Adding 42.");
        aStack.push(FORTY_TWO);
        aStack.showStack();

        System.out.println("Pop top element.");
        tempElement = aStack.pop();
        aStack.showStack();

        System.out.println("\nDone.");
    }
}
