package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.dashboard.DashboardPage;
import page.login.LoginPage;
import page.login.LoginStrings;

public class NavigationHelper {

    public static final String URL = "https://qaepower.instafin.info/dashboard";
    public static WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public DashboardPage navigateFromLoginPageToDashboardPage(){
        driver.get(LoginPage.URL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUsername().sendKeys(LoginStrings.USERNAME);
        loginPage.getPassword().sendKeys(LoginStrings.PASSWORD);
        loginPage.getSubmitButton().click();
        return new DashboardPage(driver);
    }
}
