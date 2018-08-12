package test;

import Util.BaseTest;
import org.junit.Before;
import org.junit.Test;
import page.home.HomePage;
import page.login.LoginPage;
import page.login.LoginPageStrings;

public class LogInPageTest extends BaseTest {

    private LoginPage page;

    @Before
    public void setUp() {
        driver.get(LoginPage.URL); //todo add assertAtPage method
        page = new LoginPage(driver);
    }

    /**
     * Test #1
     * when this screen is launched, the correct Title should be shown
     */
    @Test
    public void testLoginPage_title() {
        assertEquals(LoginPageStrings.TITLE, page.getTitle().getText());
    }

    /**
     * Test #3
     * when this screen is launched, the correct description should be shown
     */
    @Test
    public void testLoginPage_description() {
        assertEquals(LoginPageStrings.DESCRIPTION, page.getDescription().getText());
    }

    /**
     * Test #3
     * when this screen is launched, the get started with facebook button should be shown
     */
    @Test
    public void testLoginPage_facebookButton() {
        assertEquals(LoginPageStrings.FACEBOOK_BUTTON_TEXT, page.getFacebookButton().getText());
    }

    /**
     * Test #4
     * when the facebook button is shown, and it's clicked, the home screen should be shown
     */
    @Test
    public void testLoginPage_whenFacebookButtonClicked_homePageShouldBeShown() {
        page.getFacebookButton().click();
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isPageShown());
    }
}