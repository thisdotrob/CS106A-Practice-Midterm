import acm.program.ConsoleProgram;


public class SecondLargest extends ConsoleProgram {
	
	private static final int SENTINEL = 0;
	
	public void run() {
		
		int largest = 0;
		int secondLargest = 0;
		
		println("This proram finds the two largest integers in a");
		println("list. Enter values, one per line, using a " + SENTINEL + " to");
		println("signal the end of the list");
		
		while(true) {
			int read = readInt("?");
			if (read == SENTINEL) 
				break;			
			if (read > largest) {
				secondLargest = largest;
				largest = read;
			} 
			else if (read > secondLargest)
				secondLargest = read;							
		}
		
		println("The largest value is " + largest);
		println("The second largest value is " + secondLargest);
		
		
	}

}
