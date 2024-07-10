package io.aurumai.test;

import io.aurumai.ari.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Main {
    @Test
    public static void case1 () {
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
            WebDriverWait wait = new WebDriverWait(driver, 3);
            WebElement accountMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("success"))));
            // Kiểm tra đăng nhập thành công
            Assert.assertTrue(accountMenu.isDisplayed(), "Login failed: Account menu not found.");

            System.out.println("Login successful.");
        } catch (Exception e) {
            System.out.println("Login failed.");
        }
    }
    @Test
    public static void case2(){
        String email = "nakoreh603@devncie.com";
        String pass = "Abc12345";
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
            WebDriverWait wait = new WebDriverWait(driver, 3);
            WebElement accountMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("success"))));
            // Kiểm tra đăng nhập thành công
            Assert.assertTrue(accountMenu.isDisplayed(), "Login failed: Account menu not found.");

            System.out.println("Login successful.");
        } catch (Exception e) {
            System.out.println("Login failed.");
        }
    }
}
