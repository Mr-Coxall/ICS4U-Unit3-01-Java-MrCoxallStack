/*
* The stack program uses OOP to reate a stack
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
    public static void main(String[] args) {
        // use MrCoxallStack class
        MrCoxallStack aStack = new MrCoxallStack();

        System.out.println("The initial stack is empty.\n");
        aStack.showStack();

        System.out.println("Adding 42.");
        aStack.push(FORTY_TWO);
        aStack.showStack();

        System.out.println("Adding 27.");
        aStack.push(TWENTY_FOUR);
        aStack.showStack();

        System.out.println("\nDone.");
    }
}