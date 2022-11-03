package loggerImplementations;
import loggerProcessor.LoggerProcessor;

public class DebugLogger extends LoggerProcessor {
	public DebugLogger(LoggerProcessor nextLogger)
	{
		super(nextLogger);
	}
	
	public void log(int type,String m)
	{
//		System.out.println("Hey from DebugLogger");
		if(type == DEBUG)
		{
			System.out.println(m);
		}
		else
		{
			super.log(type, m);
		}
	}
}
