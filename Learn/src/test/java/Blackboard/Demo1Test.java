package Blackboard;

import org.apache.logging.log4j.*;
import org.testng.annotations.Test;

public class Demo1Test {

	public static Logger Log = LogManager.getLogger(Demo1Test.class.getName());
	
	@Test
	public void BrowserAutomation()
	{
		//System.out.println("BrowserAutomation");
		Log.debug("BrowserAutomation Method debug");
	}
	@Test
	public void ElementUi()
	{
		//System.out.println("ElementUi");
		Log.info("BrowserAutomation Method");
	}
	@Test
	public void Log4j2()
	{
		System.out.println("Log4J2");
		Log.error("Error message for error tag");
	}
	
}
