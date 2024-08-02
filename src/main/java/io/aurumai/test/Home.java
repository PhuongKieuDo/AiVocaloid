package io.aurumai.test;

import io.aurumai.ari.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.aurumai.ari.Main.driver;

public class Home extends Main {
    @Test
    public static void case1  (){
        List<WebElement> acti  = driver.findElements(By.className(locater.getProperty("acti")));
        Assert.assertEquals(acti.size(), 40, "Home page does not contain exactly 40 acti  .");

    }
    @Test
    public static void case2 (){
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
            System.out.println("Login failed."+ e.getMessage());
        }

//        nav home to create music lyric
        WebElement createmusic = driver.findElement(By.className(locater.getProperty("createmusichome")));
        createmusic.click();

            String expectedcreatemuscic = "create-music";
            Assert.assertTrue(driver.getCurrentUrl().contains(expectedcreatemuscic),"Navigation to product detail page failed.");
            }
    @Test
    public static void case3 (){
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
            driver.findElement(By.className((locater.getProperty("closebutton")))).click();
            WebElement accountMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("success"))));
            // Kiểm tra đăng nhập thành công
            Assert.assertTrue(accountMenu.isDisplayed(), "Login failed: Account menu not found.");

            System.out.println("Login successful.");



//        nav home to create  lyric
        WebElement make_mv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("make_mv"))));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", make_mv);

        driver.findElement(By.xpath(locater.getProperty("make_mv1"))).click();

        // Kiểm tra URL hiện tại
        String expected = "/avatar-mv-v2";
        Assert.assertTrue(driver.getCurrentUrl().contains(expected),"Navigation to product detail page failed.");


    }
    @Test
    public static void case4 (){
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
        driver.findElement(By.className((locater.getProperty("closebutton")))).click();
        WebElement accountMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("success"))));
        // Kiểm tra đăng nhập thành công
        Assert.assertTrue(accountMenu.isDisplayed(), "Login failed: Account menu not found.");

        System.out.println("Login successful.");



//        nav home to create  lyric
        WebElement moreai = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("moreai"))));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moreai);

        driver.findElement(By.xpath(locater.getProperty("Createsonglyrichome"))).click();

        // Kiểm tra URL hiện tại
        String expected = "/create-lyrics";
        Assert.assertTrue(driver.getCurrentUrl().contains(expected),"Navigation to product detail page failed.");


    }
    @Test
    public static void case5 (){
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
        driver.findElement(By.className((locater.getProperty("closebutton")))).click();
        WebElement accountMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("success"))));
        // Kiểm tra đăng nhập thành công
        Assert.assertTrue(accountMenu.isDisplayed(), "Login failed: Account menu not found.");

        System.out.println("Login successful.");



//        nav home to create  lyric
        WebElement moreai = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("moreai"))));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moreai);

        driver.findElement(By.xpath(locater.getProperty("texttomelodyhome"))).click();

        // Kiểm tra URL hiện tại
        String expected = "/create-melody";
        Assert.assertTrue(driver.getCurrentUrl().contains(expected),"Navigation to product detail page failed.");


    }
    @Test
    public static void case6(){
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
        driver.findElement(By.className((locater.getProperty("closebutton")))).click();
        WebElement accountMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("success"))));
        // Kiểm tra đăng nhập thành công
        Assert.assertTrue(accountMenu.isDisplayed(), "Login failed: Account menu not found.");

        System.out.println("Login successful.");



//        nav home to create  lyric
        WebElement moreai = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("moreai"))));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moreai);

        driver.findElement(By.xpath(locater.getProperty("vocalremovehome"))).click();

        // Kiểm tra URL hiện tại
        String expected = "/remove-vocal";
        Assert.assertTrue(driver.getCurrentUrl().contains(expected),"Navigation to product detail page failed.");


    }
    @Test
    public static void case7(){
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
        driver.findElement(By.className((locater.getProperty("closebutton")))).click();
        WebElement accountMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("success"))));
        // Kiểm tra đăng nhập thành công
        Assert.assertTrue(accountMenu.isDisplayed(), "Login failed: Account menu not found.");

        System.out.println("Login successful.");



//        nav home to create  lyric
        WebElement moreai = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("moreai"))));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moreai);

        driver.findElement(By.xpath(locater.getProperty("musicsplitterhome"))).click();

        // Kiểm tra URL hiện tại
        String expected = "/music-splitter";
        Assert.assertTrue(driver.getCurrentUrl().contains(expected),"Navigation to product detail page failed.");


    }
    @Test
    public static void case8(){
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
        driver.findElement(By.className((locater.getProperty("closebutton")))).click();
        WebElement accountMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("success"))));
        // Kiểm tra đăng nhập thành công
        Assert.assertTrue(accountMenu.isDisplayed(), "Login failed: Account menu not found.");

        System.out.println("Login successful.");



//        nav home to create  lyric
        WebElement moreai = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("moreai"))));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moreai);

        driver.findElement(By.xpath(locater.getProperty("createmvscripthome"))).click();

        // Kiểm tra URL hiện tại
        String expected = "/create-script";
        Assert.assertTrue(driver.getCurrentUrl().contains(expected),"Navigation to product detail page failed.");


    }}




