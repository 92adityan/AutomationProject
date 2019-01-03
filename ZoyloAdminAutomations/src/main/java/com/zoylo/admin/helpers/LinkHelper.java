package com.zoylo.admin.helpers;

import org.openqa.selenium.WebDriver;

public class LinkHelper {

    public void GetGangaRecipientLoginLink(WebDriver driver){
        driver.get("https://ganga.zoylo.com/login");
    }

    public void GetGangaRecipientHomepageLink(WebDriver driver){
        driver.get("https://ganga.zoylo.com/");
    }

    public void getGangaAdminLoginLink(WebDriver driver){
        driver.get("https://storm-devdb.zoylo.com:9093/");
    }

    public void GetUatRecipientLoginLink(WebDriver driver){
        driver.get("https://uat.zoylo.com/login");
    }

    public void GetUatRecipientHomepageLink(WebDriver driver){
        driver.get("https://uat.zoylo.com/");
    }

    public void getUatAdminLoginLink(WebDriver driver){
        driver.get("https://uatadmin.zoylo.com/");
    }


}
