class Main {
  public static void main(String[] args) {
    	// use MrCoxallStack class
		MrCoxallStack aStack = new MrCoxallStack();
		
		System.out.println("The initial stack is empty.\n");
        aStack.ShowStack();

		System.out.println("Adding 42.");
        aStack.Push(42);
        aStack.ShowStack();
    	
		System.out.println("Adding 27.");
        aStack.Push(27);
        aStack.ShowStack();

        System.out.println("\nDone.");        
  }
}