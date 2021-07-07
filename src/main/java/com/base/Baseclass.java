package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.utility.NewExcelLibrary;

public class Baseclass {
	public WebDriver driver;
	NewExcelLibrary obj = new NewExcelLibrary();
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir")+"/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	//@AfterMethod
	public void driverclose() {
		driver.close();
	}
	@DataProvider(name = "Credentials")
	public Object[][] getexceldata() {
		int row = obj.getRowCount("login");
		int col = obj.getColumnCount("login");
		Object[][] data = new Object[row][col];
		for (int i = 0; i < row; i++) {
			for(int j = 0;j < col; j++) {
				data[i][j] = obj.getCellData("login", j, i+1);
				
			}
		}
		return data;
	}
	
}
