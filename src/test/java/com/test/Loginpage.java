package com.test;

import static org.testng.Assert.assertEqualsDeep;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Baseclass;

public class Loginpage extends Baseclass {
	@Test(dataProvider = "Credentials")
	public void login(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		//String loginsucess = "OrangeHRM";
		//String title = driver.getTitle();
		//Assert.assertEquals(loginsucess, title);
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(actualURL, expectedURL);
		
	}

}
