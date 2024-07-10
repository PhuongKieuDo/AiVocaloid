package io.aurumai.test;

import io.aurumai.ari.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateMusic extends Main {
//    @Test
//    public void case1 () {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("closebutton")))).click();
//        WebElement createmusic = driver.findElement(By.className(locater.getProperty("createmusichome")));
//        createmusic.click();
//
//        try {
//            String expectedsignin  = "sign-in";
//            Assert.assertTrue(driver.getCurrentUrl().contains(expectedsignin),"Navigation to Signin detail page failed.");
//            System.out.println("Nav Signin successful.");
//        }catch (Exception e){
//            System.out.println("Nav Signin Failed.");
//        }
//    }
    @Test
    public void case2 () {
        String email = "nakoreh603@devncie.com";
        String pass = "Abc12345@";
        String name = " your love";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("closebutton")))).click();
        WebElement createmusic = driver.findElement(By.className(locater.getProperty("createmusichome")));
        createmusic.click();

        try {
            String expectedsignin  = "sign-in";
            Assert.assertTrue(driver.getCurrentUrl().contains(expectedsignin),"Navigation to Signin detail page failed.");
            System.out.println("Nav Signin successful.");
        }catch (Exception e){
            System.out.println("Nav Signin Failed.");
        }
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
        WebElement createmusic2  = driver.findElement(By.className(locater.getProperty("createmusichome")));
        createmusic2.click();
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
    public static void case3 (){
//        nav home to create music
        String email = "nakoreh603@devncie.com";
        String pass = "Abc12345@";
        String name = " your love";
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
//            Assert.assertTrue(accountMenu.isDisplayed(), "Login failed: Account menu not found.");

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
        driver.findElement(By.xpath("//button[contains(text(), 'Get Random Prompt')]")).click();
        driver.findElement(By.xpath("//input[@name='voice_name' and @placeholder='Naming your masterpiece...']")).sendKeys(name);
        driver.findElement(By.className(locater.getProperty("gen"))).click();


        try {
            WebElement toastElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locater.getProperty("createSuccesses"))));
            String toastText = toastElement.getText();
            System.out.println("Toast text is: " + toastText);
            WebElement status = driver.findElement(By.className(locater.getProperty("status")));
            wait.until(ExpectedConditions.textToBePresentInElement(status, "submitted"));
            System.out.println("Status has changed to 'complete'.");

        }catch (Exception e){
            System.out.println("Fail");
        }










    }
}


