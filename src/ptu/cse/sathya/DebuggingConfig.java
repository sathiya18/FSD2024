package ptu.cse.sathya;



	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Paths;
	import java.nio.file.StandardOpenOption;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;

	public class DebuggingConfig {
	    //private static String logLevel = "INFO"; // Default log level
	    private static String logLevel = "DEBUG";
	    private static String logFilePath = "activity.log"; // Default log file path

	    public static void main(String[] args) {
	        if (args.length > 0) {
	            logLevel = args[0];
	        }
	        if (args.length > 1) {
	            logFilePath = args[1];
	        }
	        
	        logActivity("User logged in");
	    }

	    private static void logActivity(String message) {
	        String formattedMessage = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME) + " [" + logLevel + "] " + message;
	        try {
	            Files.write(Paths.get(logFilePath), (formattedMessage + System.lineSeparator()).getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
	            System.out.println("Activity logged: " + message);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

