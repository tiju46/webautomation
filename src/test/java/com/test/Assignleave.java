package com.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Baseclass;
import com.base.Loginclass;

public class Assignleave extends Baseclass  {
	
	
	@Test
	public void Assignpage() throws InterruptedException {
		Loginclass login = new Loginclass(driver);
		Thread.sleep(2000);
		login.loginvalues();
		Thread.sleep(3000);
		login.assignval();
		
	}

}
