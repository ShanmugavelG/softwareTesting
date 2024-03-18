package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://apple.com/in/iphone/?afid=p238%7CsnTdg5ZpO-dc_mtid_209254ho67063_pcrid_674713258257_pgrid_135363319397_pexid__&cid=wwa-in-kwgo-iphone-slid----Avail-");
        driver.manage().window().maximize();
        // JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("window.scrollBy(0, 3000)");
        Thread.sleep(1000);
        driver.switchTo().frame(1);
    }
}