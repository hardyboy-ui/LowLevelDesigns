package loggerLauncher;
import loggerProcessor.LoggerProcessor;
import loggerImplementations.*;
public class Launch {

	public static void main(String[] args) {
		
		LoggerProcessor logger=new InfoLogger(new DebugLogger(new ErrorLogger(null)));
		logger.log(LoggerProcessor.INFO, "Program is running fine");
		logger.log(LoggerProcessor.DEBUG, "Debugging line no. x and values are this this and this");
		logger.log(LoggerProcessor.ERROR, "Program is having errors at this this and this lines");
	}
}
