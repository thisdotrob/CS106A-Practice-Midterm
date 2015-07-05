import acm.program.ConsoleProgram;

public class RemoveDoubledLetters extends ConsoleProgram {
	
	public void run() {
		String testString = "tthhiissssttrriinngghhaassddoouubblleelleetteerrss";
		println("" + removeDoubledLetters(testString));
		
	}

	private String removeDoubledLetters(String string) {
		String result = "";
		for (int i = 0; i < string.length() - 1; i++) {
			if (  string.charAt(i)   !=   string.charAt(i + 1)  ) {
				result += Character.toString( string.charAt(i) );
			}	
		}
		result += Character.toString(  string.charAt( string.length() - 1 )  );
		return result;
	}
}
