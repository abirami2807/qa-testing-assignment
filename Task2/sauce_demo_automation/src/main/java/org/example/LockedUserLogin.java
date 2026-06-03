package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LockedUserLogin {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        // Login with locked user
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();

        // Verify error message
        String actualMessage = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();

        String expectedMessage =
                "Epic sad face: Sorry, this user has been locked out.";
        Thread.sleep(2000);

        if (actualMessage.equals(expectedMessage)) {
            System.out.println("Locked user error message verified successfully");
        } else {
            System.out.println("Verification failed");
        }

        driver.quit();
    }
}

