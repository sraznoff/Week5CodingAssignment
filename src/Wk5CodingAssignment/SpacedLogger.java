package Wk5CodingAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println(spacer(message));
	}

	@Override
	public void error(String message) {
		System.out.println("ERROR: "+message);
		
	}
	private String spacer(String message) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			result.append(message.charAt(i));
			result.append(" ");
		}
		result.deleteCharAt(result.length()-1);
		return result.toString();
	}

}
