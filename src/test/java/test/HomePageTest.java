package test;

import Util.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import page.NavigationHelper;
import page.home.HomePage;
import page.home.HomePageStrings;

@RunWith(BlockJUnit4ClassRunner.class)
public class HomePageTest extends BaseTest {

    HomePage page;
    HomePageStrings stringsConstants;

    @Before
    public void setUp() {
        NavigationHelper navigationHelper  = new NavigationHelper(driver);
        navigationHelper.navigateFromLoginPageToHomePage();
        driver.get(HomePage.URL);
        page = new HomePage(driver);
    }

    /**
     * Test #1
     * When the home page is shown, the logo should be shown
     */
    @Test
    public void testHomePage_logo() {
//        assertEquals(stringsConstants.LOGO, page.getLogo());
    }

}