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
    obj.Login(driver,"admin@yourstore.com","admin");
    obj.verifydashboard(driver);
    }

    @AfterTest
    public void closedriver(){
    driver.close();
    }
}
