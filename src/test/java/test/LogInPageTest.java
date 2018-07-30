package test;

import org.junit.Before;
import org.junit.Test;
import page.dashboard.DashboardPage;
import page.login.LoginPage;
import page.login.LoginStrings;


public class LogInPageTest extends BaseTest {

    private LoginPage page;

    @Before
    public void setUp() {
        driver.get(LoginPage.URL); //todo add assertAtPage method
        page = new LoginPage(driver);
    }

    @Test
    public void testLoginPage_submitButton() {
        page.getUsername().sendKeys(LoginStrings.USERNAME);
        page.getPassword().sendKeys(LoginStrings.PASSWORD);
        page.getSubmitButton().click();

        assertTrue(new DashboardPage(driver).getDashboardTitle().isDisplayed());
    }
}