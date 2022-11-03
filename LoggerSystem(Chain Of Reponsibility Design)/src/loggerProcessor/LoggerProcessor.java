package loggerProcessor;

public abstract class LoggerProcessor {
	public static int INFO=1;
	public static int DEBUG=2;
	public static int ERROR=3;
	
	private LoggerProcessor nextLogger;
	public LoggerProcessor(LoggerProcessor nextLogger)
	{
		this.nextLogger=nextLogger;
	}
	
	public void log(int type,String m)
	{
		if(nextLogger!=null)
		{
			nextLogger.log(type,m);
		}
	}
}
