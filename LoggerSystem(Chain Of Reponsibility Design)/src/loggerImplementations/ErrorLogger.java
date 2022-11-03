package loggerImplementations;
import loggerProcessor.LoggerProcessor;

public class ErrorLogger extends LoggerProcessor {

	public ErrorLogger(LoggerProcessor nextLogger)
	{
		super(nextLogger);
	}
	public void log(int type,String m)
	{
		if(type == ERROR)
		{
			System.out.println(m);
		}
		else
		{
			super.log(type, m);
		}
	}
}
