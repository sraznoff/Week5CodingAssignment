package Wk5CodingAssignment;

public class App {

	public static void main(String[] args) {
		Logger starLog = new AsteriskLogger();
		Logger spaceLog = new SpacedLogger();
	
		starLog.log("Captain's Log");
		System.out.println();
		starLog.error("Stardate 1328.8.");
		System.out.println();
		spaceLog.log("The USS Enterprise");
		System.out.println();
		spaceLog.error(" in pursuit of an unidentified vessel.");
	}

}
