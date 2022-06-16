package com.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class company {

    @Test
    public void Test1() {
    //public static void main(String[] args) {
        System.out.println("xa");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\comp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //System.out.println("Test Gitt");
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        WebElement inpUserName = driver.findElement(By.id("user-name"));
        inpUserName.click();
        inpUserName.sendKeys("standard_user");

        WebElement inpPassword = driver.findElement(By.id("password"));
        inpPassword.click();
        inpPassword.sendKeys("secret_sauce");

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click();


        Assert.assertEquals(true, driver.findElement(By.xpath("//*[@id='inventory_container']")).isDisplayed());

        driver.quit();

    }

}
