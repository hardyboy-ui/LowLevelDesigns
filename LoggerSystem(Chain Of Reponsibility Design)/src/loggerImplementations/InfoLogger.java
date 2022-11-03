package loggerImplementations;

import loggerProcessor.LoggerProcessor;

public class InfoLogger extends LoggerProcessor {
	public InfoLogger(LoggerProcessor nextLogger)
	{
		super(nextLogger);
	}
	
	public void log(int type,String m)
	{
		if(type == INFO)
		{
			System.out.println(m);
		}
		else
		{
			super.log(type, m);
		}
	}
}
