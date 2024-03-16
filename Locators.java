package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class Locators
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        //Locators
        // driver.findElement(By.linkText("Gmail")).click();
        // Thread.sleep(1000);
        // driver.findElement(By.linkText("Sign in")).click();
        // Thread.sleep(1000);
        // driver.findElement(By.partialLinkText("Dismiss")).click();
        //driver.findElement(By.xpath("//a[text()='Sign in']")).click();
       // driver.findElement(By.xpath("//a[starts-with(@class, \"gb_\")]")).click();
        driver.findElement(By.cssSelector("input.RNmpXc[name=btnI]")).click();
    System.out.println( "Hello World!" );
    }

    @Override
    public String toString() {
        return "Locators []";
    }
}
