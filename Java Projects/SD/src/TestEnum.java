
public class TestEnum {

	
	public enum CommandWords
	{
	    // A value for each command word, plus one for unrecognized
	    // commands.
	    GO, QUIT, HELP, UNKNOWN;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEnum word = new TestEnum();
		Object S="GO";
		
		CommandWords command = null; 
		System.out.println(command.GO);
		
		 
		
	}

}
