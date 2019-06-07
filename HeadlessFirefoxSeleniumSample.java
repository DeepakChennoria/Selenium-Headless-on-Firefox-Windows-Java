package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class HeadlessFirefoxSeleniumSample {
  public static void main(String [] args) {
    FirefoxBinary firefoxBinary = new FirefoxBinary();
    firefoxBinary.addCommandLineOptions("--headless");
    FirefoxOptions firefoxOptions = new FirefoxOptions();
    firefoxOptions.setBinary(firefoxBinary);
    FirefoxDriver driver = new FirefoxDriver(firefoxOptions);
    driver.get("http://virtualbuffer.blogspot.com/");
    driver.findelement(By.linkText("Log4Net implementation in Visual Studio")).click();      
    driver.quit();
  }
}