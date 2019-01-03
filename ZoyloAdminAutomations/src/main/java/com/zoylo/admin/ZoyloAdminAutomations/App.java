package com.zoylo.admin.ZoyloAdminAutomations;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

import com.zoylo.admin.drivermanager.*;
import com.zoylo.admin.helpers.*;

public class App 
{
	static DriverManager dManager;
	static LinkHelper liHelper;
	static LoginHelper loHelper;

	public static void main( String[] args ) throws InterruptedException
    {
		WebDriver driver;
		WebElement element;
		Faker faker = new Faker();
		dManager = new DriverManager();
		liHelper = new LinkHelper();
		loHelper = new LoginHelper();
		List<WebElement> wList = new ArrayList<WebElement>();
		
		
		driver = dManager.createIncognitoChromeDriver();
		liHelper.getUatAdminLoginLink(driver);
		loHelper.LoginUatAdmin(driver);
		
		Thread.sleep(5000);
		
		driver.get("https://storm-devdb.zoylo.com:9093/admin/doctorRegistration");
		
		//wList = driver.findElements(By.xpath("//div[@class = 'layout']"));
		//element = wList.get(2);
	
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
		driver.switchTo().activeElement().sendKeys("Adityan");
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("ravichandran");	// middle name
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("RRR");   // last name			
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("92adityan@gmail.com");	// email
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("11111111110"); 		// mobile
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
		// date of birth
		driver.findElement(By.xpath("//div[@class = 'picker--date__title-year']")).click();;
		driver.findElement(By.xpath("//ul[@class = 'picker--date__years']//li[130]")).click();
		driver.switchTo().activeElement().click();
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		
		
    }
}
