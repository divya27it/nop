package Resource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPOM {


    public void Login(WebDriver driver,String Email,String pwd){
        driver.findElement(By.id("Email")).sendKeys(Email);
        driver.findElement(By.id("Password")).sendKeys(pwd);
        driver.findElement(By.xpath("//*[text()='Log in']")).click();
    }
    public void verifydashboard(WebDriver driver){
       WebElement dashboard=driver.findElement(By.xpath("//*[text()=' Dashboard']"));
       dashboard.isDisplayed();
    }
}
