package com.zoylo.admin.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class LoginHelper {

    public WebDriver driver;

    public void LoginGangaRecipient (WebDriver driver){
        driver.findElement(By.id("phoneLbl")).sendKeys("9940927888");
        driver.findElement(By.id("passLbl")).sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
    }

    public void LoginGangaAdmin (WebDriver driver){
        driver.findElement(By.name("mobile")).sendKeys("8888899999");
        driver.findElement(By.name("password")).sendKeys("Zoylo@123");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
    }

    public void LoginUatAdmin (WebDriver driver){
        driver.findElement(By.name("mobile")).sendKeys("8888899999");
        driver.findElement(By.name("password")).sendKeys("Zoylo@123");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
    }

    public void LoginUatRecipient (WebDriver driver){
        driver.findElement(By.id("phoneLbl")).sendKeys("9940927888");
        driver.findElement(By.id("passLbl")).sendKeys("password");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
    }

}
