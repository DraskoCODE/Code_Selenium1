package com.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class company {

    public static void main(String[] args) {
        System.out.println("xa");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\comp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //System.out.println("Test Gitt");
        driver.get("https://code.edu.rs/");

        driver.manage().window().maximize();

        WebElement lnkObuke = driver.findElement(By.xpath(".//a[@href='/obuke/']"));
        lnkObuke.click();

        WebElement lnkJavaDevelopment = driver.findElement(By.xpath(".//a[@href='/obuke/java-development/']"));
        lnkJavaDevelopment.click();

        driver.close();

    }

}
