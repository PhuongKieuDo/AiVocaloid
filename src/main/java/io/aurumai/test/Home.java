package io.aurumai.test;

import io.aurumai.ari.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.aurumai.ari.Main.driver;

public class Home extends Main {
    @Test
    public static void case1 (){
        String email = "nakoreh603@devncie.com";
        String pass = "Abc12345@";
//        close popup
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("closebutton")))).click();
//        nav home to Sign in
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("signin")))).click();
        String expectedUrlSubstring = "/sign-in";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrlSubstring),
                "Navigation to Sign in detail page failed.");
        driver.findElement(By.id(locater.getProperty("idemail"))).sendKeys(email);
        driver.findElement(By.id(locater.getProperty("idpass"))).sendKeys(pass);
        driver.findElement(By.xpath(locater.getProperty("submitXP"))).click();

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("closebutton")))).click();
            WebElement accountMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("success"))));
            // Kiểm tra đăng nhập thành công
            Assert.assertTrue(accountMenu.isDisplayed(), "Login failed: Account menu not found.");

            System.out.println("Login successful.");

        } catch (Exception e) {
            System.out.println("Login failed.");
        }

//        nav home to create music lyric
        WebElement createmusic = driver.findElement(By.className(locater.getProperty("createmusichome")));
        createmusic.click();
//        String expectedcreatemuscic = "create-music";
//        Assert.assertTrue(driver.getCurrentUrl().contains(expectedcreatemuscic),"Navigation to product detail page failed.");
        try {
            String expectedcreatemuscic = "create-music";
            Assert.assertTrue(driver.getCurrentUrl().contains(expectedcreatemuscic),"Navigation to product detail page failed.");
            System.out.println("Nav create music successful.");
        }catch (Exception e){
            System.out.println("Nav create music Failed.");
        }
            }
    @Test
    public static void case2 (){
        String email = "nakoreh603@devncie.com";
        String pass = "Abc12345@";

//        close popup
        driver.findElement(By.className((locater.getProperty("closebutton")))).click();

//        nav home to Sign in
        driver.findElement(By.className(locater.getProperty("signin"))).click();
        String expectedUrlSubstring = "/sign-in";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrlSubstring),
                "Navigation to Sign in detail page failed.");
        driver.findElement(By.id(locater.getProperty("idemail"))).sendKeys(email);
        driver.findElement(By.id(locater.getProperty("idpass"))).sendKeys(pass);
        driver.findElement(By.xpath(locater.getProperty("submitXP"))).click();

        try {
            driver.findElement(By.className((locater.getProperty("closebutton")))).click();
            WebElement accountMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("success"))));
            // Kiểm tra đăng nhập thành công
            Assert.assertTrue(accountMenu.isDisplayed(), "Login failed: Account menu not found.");

            System.out.println("Login successful.");

        } catch (Exception e) {
            System.out.println("Login failed.");
        }

//        nav home to create  lyric
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement createlyric = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("Createsonglyrichome"))));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createlyric);

        createlyric.click();
        String expectedcreatelyric  = "/create-lyrics/";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedcreatelyric),"Navigation to product detail page failed.");


    }
//    @Test
//    public static void case3 (){
//
////        Vocal remove
//
//
//
//
//
//    }
//    @Test
//    public static void case4 (){
//
////        music splitter
//
//
//
//
//
//    }
//    @Test
//    public static void case5 (){
//
////        create MV script
//
//
//
//
//    }
}
