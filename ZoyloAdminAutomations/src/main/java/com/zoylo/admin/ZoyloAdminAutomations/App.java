package com.zoylo.admin.ZoyloAdminAutomations;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
import com.zoylo.admin.doctorcreation.*;

import com.zoylo.admin.drivermanager.*;
import com.zoylo.admin.helpers.*;

public class App 
{
	static DriverManager dManager;
	static LinkHelper liHelper;
	static LoginHelper loHelper;
	static DoctorCreateUtils docutil;
	
	public static void main( String[] args ) throws InterruptedException
    {
		
		WebDriver driver;
		WebElement element;
		
		dManager = new DriverManager();
		liHelper = new LinkHelper();
		loHelper = new LoginHelper();
		docutil = new DoctorCreateUtils();
		
		driver = dManager.createIncognitoChromeDriver();
		liHelper.getGangaAdminLoginLink(driver);
		loHelper.LoginGangaAdmin(driver);
		
		Thread.sleep(5000);
		
		driver.get("https://storm-devdb.zoylo.com:9093/admin/doctorRegistration");
	
		driver.findElement(By.xpath("//div[@class = 'flex xs3']/div[@tabindex = '0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class = 'flex xs3']/div[@tabindex = '0']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[@class = 'flex xs3']/div[@tabindex = '0']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class = 'flex xs3']/div[@tabindex = '0']")).sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class = 'layout'][2]/div[@class = 'flex xs4'][1]//*[@tabindex = '0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class = 'layout'][2]/div[@class = 'flex xs4'][1]//*[@tabindex = '0']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[@class = 'layout'][2]/div[@class = 'flex xs4'][1]//*[@tabindex = '0']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class = 'layout'][2]/div[@class = 'flex xs4'][1]//*[@tabindex = '0']")).sendKeys(Keys.TAB);
		
		// first name
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys(docutil.getRandomString(7));
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(docutil.getRandomString(5));	// middle name
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(docutil.getRandomString(5));   // last name			
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(docutil.getRandomMail());	// email
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(docutil.getRandomMobileNumber()); 		// mobile
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		// date selection
		for(int i=0; i < 5; i++){
			driver.findElement(By.xpath("//div[@class = 'picker--date__header-selector']/button")).click();
			Thread.sleep(500);
		}
		driver.findElement(By.xpath("//div[@class = 'picker--date__table']//button")).click();
		driver.findElement(By.xpath("//input[@data-vv-name = 'year of start of practice']")).click();
		driver.findElement(By.xpath("//input[@data-vv-name = 'year of start of practice']")).sendKeys(Keys.TAB);

		// gender	
		Thread.sleep(500);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(500);
	
		// dob
		driver.findElement(By.xpath("//div[@class = 'picker--date__title-year']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//ul[@class = 'picker--date__years']/li[contains(.,'"+docutil.randomNumber(1975, 1995)+"')]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class = 'picker--date__table']//button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@aria-label = 'Date of Birth']")).click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		
		//profession
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		for(int i=0; i < docutil.randomNumber(2, 10); i++) {
			driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
		Thread.sleep(500);
		
		// area of specialization
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		for(int i=0; i < docutil.randomNumber(2, 10); i++) {
			driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(200);
		driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
		Thread.sleep(500);
		
		// line of practice
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(500);
		for(int i=0; i < docutil.randomNumber(2, 10); i++) {
			driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		Thread.sleep(200);
		driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
		
		// button
		driver.findElement(By.xpath("//div[@class = 'btn__content' and contains (.,'Save')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//b[contains(.,'Registration Verification')]")).click();
		
    }
}
