package test;

import Util.BaseTest;
import Util.DateUtil;
import Util.User;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import page.dashboard.DashboardPage;
import page.login.LoginPage;
import page.login.LoginStrings;

import java.util.Calendar;

public class LogInPageTest extends BaseTest {

    private LoginPage page;

    @Before
    public void setUp() {
        driver.get(LoginPage.URL); //todo add assertAtPage method
        page = new LoginPage(driver);
    }

    /**
     * Test #1.3.3
     * When a user clicks the sign in button with all fields filled in with valid data,
     * the dashboard page should be shown, and the event logged in the activity stream
     */
    @Test
    public void testLoginPage_submitButton() {
        page.getUsername().sendKeys(LoginStrings.USERNAME);
        page.getPassword().sendKeys(LoginStrings.PASSWORD);
        page.getSubmitButton().click();
        Calendar cal = Calendar.getInstance();
        String dateNow = DateUtil.getDashboardActibityStreamDateString(cal.getTime());

        DashboardPage dashboardPage = new DashboardPage(driver);
        assertTrue(dashboardPage.getDashboardTitle().isDisplayed());

        WebElement activityItemOne = dashboardPage.getActivityStream().get(0);
        assertEquals(User.NAME, dashboardPage.getActivityItemUser(activityItemOne).getText());
        //todo: assert that "logged in" text is shown
        assertEquals(dateNow, dashboardPage.getActivityItemInfo(activityItemOne).getText());  //BUG. this test fails because the time is not formatted to
        //Nairobi local time! The shown on the page is 2 hours behind
    }
}