package com.zoylo.admin.drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

public class DriverManager {

    public WebDriver driver;

    public WebDriver createChromeDriver(){
        ChromeDriverManager.getInstance(CHROME).setup();
        driver = new ChromeDriver();
        return driver;
    }

    public WebDriver createIncognitoChromeDriver(){
        ChromeDriverManager.getInstance(CHROME).setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
        return driver;
    }

    public void closeDriver(WebDriver driver){
            driver.close();
    }
}
