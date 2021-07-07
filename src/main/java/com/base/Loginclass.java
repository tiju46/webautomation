package com.base;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Loginclass extends Baseclass{
	 
	 
	 By username = By.id("txtUsername");
	 By password = By.id("txtPassword");
	 By loginbutton = By.id("btnLogin");
	 By empname = By.xpath("//input[@id='assignleave_txtEmployee_empName']");
	 By dropdown = By.id("assignleave_txtLeaveType");
	 By fromDate = By.id("assignleave_txtFromDate");
	 By toDate = By.id("assignleave_txtToDate");
	 By assignbtn = By.xpath("//input[@id='assignBtn']");
	 By assignleav = By.xpath("//span[contains(text(),'Assign Leave')]");
	 	
	 
	 public Loginclass(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 public void loginvalues() throws InterruptedException {
		 driver.findElement(username).sendKeys("admin");
		 driver.findElement(password).sendKeys("admin123");
		 driver.findElement(loginbutton).click();
		 
	 }
	 public void assignval() throws InterruptedException {

		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 driver.findElement(assignleav).click();
		 driver.findElement(empname).sendKeys("Prajakta Dhumal");
		 Select sel = new Select(driver.findElement(dropdown));
		 sel.selectByValue("1");
		 driver.findElement(fromDate).clear();
		 driver.findElement(fromDate).sendKeys("2021-07-08");
		 driver.findElement(toDate).clear();
		 driver.findElement(toDate).sendKeys("2021-07-08");
		 WebElement element = driver.findElement(assignbtn);
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", element);
		 //driver.findElement(assignbtn).click();
	 }
	 
	 

}
