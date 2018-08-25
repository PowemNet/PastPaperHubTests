package page;

import org.openqa.selenium.WebDriver;
import page.home.HomePage;
import page.login.LoginPage;
import page.login.LoginPageStrings;

public class NavigationHelper {

    public static final String URL = "http://localhost:5000/";
    public static WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage navigateFromLoginPageToHomePage(){
        driver.get(LoginPage.URL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getFacebookButton().click();
        return new HomePage(driver);
    }

}

