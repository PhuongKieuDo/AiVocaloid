package io.aurumai.Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.util.Properties;

public class ClassMain {
    public static WebDriver driver;
    public static ChromeDriver chromeDriver;
    public static WebDriverWait wait;
    public static Properties properties = new Properties();
    public static FileReader fileReader ;
    public static Properties locater = new Properties();
    public static FileReader fileReader2 ;
    @FindBy(className = "")
    public static WebElement actiField;
    @FindBy(className = "")
    public static WebElement closebuttonField;
    @FindBy(className = "")
    public static WebElement createmusicField;
    @FindBy(id = "")
    public static WebElement idemailField;
    @FindBy(id = "")
    public static WebElement idpassField;
    @FindBy(xpath = "")
    public static WebElement submitXPField;






    public ClassMain(){
        actiField = driver.findElement((By.className(locater.getProperty("acti"))));
        closebuttonField = driver.findElement((By.className(locater.getProperty("closebutton"))));
        createmusicField = driver.findElement(By.className(locater.getProperty("createmusichome")));
        idemailField = driver.findElement(By.id(locater.getProperty("idemail")));
        idpassField= driver.findElement(By.id(locater.getProperty("idpass")));
        submitXPField= driver.findElement(By.xpath(locater.getProperty("submitXP")));
    }
}
