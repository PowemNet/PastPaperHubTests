package page.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class LoginPage {

    public static final String URL = "http://localhost:5000/login";
    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTitle(){
        return  driver.findElement(By.id("PastPaperHub-title-login-page"));
    }

    public WebElement getDescription(){
        return  driver.findElement(By.id("description-login-page"));
    }

    public WebElement getFacebookButton(){
        return  driver.findElement(By.id("sign-in"));
    }
}
