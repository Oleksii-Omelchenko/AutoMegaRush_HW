package com.hw1.webdriver;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by Admin on 15.09.2015.
 */
public class LoginTest {
    @Test
    public void StartWebDriver()
    {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://193.138.245.222:81/auth/login");
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
        driver.findElement(By.id("username").sendKeys("admin");
        //driver.close();

    }
}
