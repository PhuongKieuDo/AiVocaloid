package io.aurumai.ari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Main {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Properties properties = new Properties();
    public static FileReader fileReader ;
    public static Properties locater = new Properties();
    public static FileReader FileReader2 ;
    String email = "nakoreh603@devncie.com";
    String pass = "Abc12345@";
    String name = " your love";



    @BeforeTest
    public void setup() throws IOException {
        if (driver==null) {
            FileReader fileReader = new FileReader("/home/thanhhuypg/IdeaProjects/Ari_vocaloid/src/main/java/io/properties/Browser.properties");
            properties.load(fileReader);
            FileReader fileReader2  = new FileReader("/home/thanhhuypg/IdeaProjects/Ari_vocaloid/src/main/java/io/properties/Locator.properties");
            locater.load(fileReader2);
        }
        if (properties.getProperty("browser").equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","/home/thanhhuypg/Downloads/chromedriver_linux64 (1)/chromedriver");

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get(properties.getProperty("testurl"));
            wait = new WebDriverWait(driver, 30);
            driver.manage().window().maximize();

        }

    }

    @AfterTest
    public void tearDown() {
        driver.close();
        System.out.println("teardown success!");

    }
}