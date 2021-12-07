class Main {
  public static void main(String[] args) {
    	// use MrCoxallStack class
		MrCoxallStack aStack = new MrCoxallStack();
		
		System.out.println("The initial stack is empty.\n");
        aStack.showStack();

		System.out.println("Adding 42.");
        aStack.push(42);
        aStack.showStack();
    	
		System.out.println("Adding 27.");
        aStack.push(27);
        aStack.showStack();

        System.out.println("\nDone.");        
  }
}