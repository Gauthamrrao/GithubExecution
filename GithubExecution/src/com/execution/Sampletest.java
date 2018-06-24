package com.execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sampletest 
{
	@Test
	public void executionApp()
	{
		Reporter.log("The script should be successful", true);
	}

}
