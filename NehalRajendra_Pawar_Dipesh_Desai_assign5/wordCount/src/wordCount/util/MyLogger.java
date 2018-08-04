package wordCount.util;

/**
 * @author Dipesh Desai
 *
 */
public class MyLogger {
	public static enum DebugLevel {
		LOG, DEBUG, NONE , VERBOSE
	};

	private static DebugLevel debugLevel;

	public static void setDebugValue(int levelIn) {
		switch (levelIn) {
		case 3:
			debugLevel = DebugLevel.VERBOSE;
			break;
		case 2:
			debugLevel = DebugLevel.DEBUG;
			break;
		case 1:
			debugLevel = DebugLevel.LOG;
			break;
		default:
			debugLevel = DebugLevel.NONE;
			break;
		}
	}

	public static void setDebugValue(DebugLevel levelIn) {
		debugLevel = levelIn;
	}

	public static void writeMessage(DebugLevel levelIn,String message) {
		if (levelIn == debugLevel)
			System.out.println(message);
	}

	public String toString() {
		return "The debug level has been set to the following " + debugLevel;
	}
}
