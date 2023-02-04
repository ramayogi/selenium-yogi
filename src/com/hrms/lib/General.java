package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Reporter;

import com.hrms.utility.Log;


public class General extends Global {
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Millennium\\Downloads\\chromedriver_win32 (15)\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened"); 
		Reporter.log("Application Opened"); 
		Log.info("Application Opened "); 
		}
		public void closeApplication() {
		    driver.close();
		    System.out.println("Application closed");
		    Log.info("Application closed ");
		}
		public void login() {
		    driver.findElement(By.name(txt_loginname)).sendKeys(un);
		    driver.findElement(By.name(txt_password)).sendKeys(pw);
		    driver.findElement(By.name(btn_login)).click();
		    System.out.println("Login completed");
		    Log.info("Login completed ");
		}
		public void logout() {
		    driver.findElement(By.linkText(link_logout)).click();
		    System.out.println("Logout completed");
		    Log.info("Logout completed ");
		}
		public void enterFrame() {
		    driver.switchTo().frame(frame_empinfo);
		    System.out.println("entered into frame");
		    Log.info(" entered into frame");
		}
		public void exitFrame() {
		    driver.switchTo().defaultContent();
		    System.out.println("exit from frame");
		    Log.info("exit from frame ");
		}
		public void addNewEmp() {
		    driver.findElement(By.xpath(btn_Add)).click();
		    driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
		    driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
		    driver.findElement(By.id(btn_save)).click();
		    System.out.println("NewEmpAdded");
		    Log.info("Add new emp ");
		}
		}


}
