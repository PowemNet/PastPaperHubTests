package page.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public static final String URL = "https://qaepower.instafin.info/user/login";
    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsername(){
        return  driver.findElement(By.id("us1"));
    }

    public WebElement getPassword(){
        return  driver.findElement(By.id("pw1"));
    }


    public WebElement getSubmitButton(){
        return  driver.findElement(By.className("btn"));
    }
}
