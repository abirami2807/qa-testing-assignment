package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class SauceDemoCheckoutTest {
    public static void main(String[] args) throws InterruptedException, AWTException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();

        // Wait for popup
        Thread.sleep(2000);

// Press ENTER to click OK button
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        // Add two products
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        // Open Cart
        driver.findElement(By.className("shopping_cart_link")).click();

        // Verify products in cart
        boolean product1 = driver.getPageSource().contains("Sauce Labs Backpack");
        boolean product2 = driver.getPageSource().contains("Sauce Labs Bike Light");

        if (product1 && product2) {
            System.out.println("Products verified in cart");
        }

        // Checkout
        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Abirami");
        driver.findElement(By.id("last-name")).sendKeys("D");
        driver.findElement(By.id("postal-code")).sendKeys("631502");
        Thread.sleep(2000);

        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();

        // Verify order success message
        String successMsg = driver.findElement(By.className("complete-header")).getText();

        if (successMsg.equals("Thank you for your order!")) {
            System.out.println("Order placed successfully");
        }

        driver.quit();
    }
}