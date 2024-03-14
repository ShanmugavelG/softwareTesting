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
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    try {
        Thread.sleep(3000);
    } catch (Exception e) {
        driver.quit();
    }
    WebElement element=driver.findElement(By.className("gLFyf"));
    element.sendKeys("Placement.skcet.ac.in",Keys.ENTER);
    // WebElement signin=driver.findElement(By.className("gb_Kd"));
    // signin.click();
    // WebElement email=driver.findElement(By.id("identifierId"));
    // email.sendKeys("Shanmugavelg71@gamil.com");
    // WebElement next=driver.findElement(By.className("VfPpkd-vQzf8d"));
    // next.click();
    WebElement place=driver.findElement(By.className("byrV5b"));
    place.click();
    Thread.sleep(10000);
    WebElement email=driver.findElement(By.id("email"));
    email.sendKeys("727722eucs159@skcet.ac.in",Keys.ENTER);
    Thread.sleep(20000);
    WebElement pass=driver.findElement(By.id("password"));
    pass.sendKeys("03",Keys.ENTER);
   // Thread.sleep(10000);
    //driver.quit();
    System.out.println( "Hello World!" );
    }
}
