package page.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

public class HomePage {

    public static final String URL = "http://localhost:5000/";
    public static WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageShown(){
        try {
            getLogo();
        } catch (NoSuchElementException e){
            return false;
        }
        return true;
    }


    public List<WebElement> getLogo(){
        return driver.findElements(By.id("logo-home-page"));
    }
}
