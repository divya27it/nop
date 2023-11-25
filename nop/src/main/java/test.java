package Testcase;

import Resource.LoginPOM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login  {
    WebDriver driver;
    LoginPOM obj=new LoginPOM();
    String URL="https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F";
    @BeforeTest
    public void setupchrome(){
        driver=WebDriverManager.chromedriver().create();
        driver.get(URL);
    }
    @Test
    public void validloin(){
        driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
        driver.findElement(By.id("Password")).sendKeys("admin");
        driver.findElement(By.xpath("//*[text()='Log in']")).click();

    }

    @AfterTest
    public void closedriver(){
    driver.close();
    }
}
