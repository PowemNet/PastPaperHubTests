package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import page.NavigationHelper;
import page.dashboard.DashboardPage;

@RunWith(BlockJUnit4ClassRunner.class)
public class DashboardPageTest extends BaseTest {

    DashboardPage page;

    @Before
    public void setUp() {
        NavigationHelper navigationHelper  = new NavigationHelper(driver);
        navigationHelper.navigateFromLoginPageToDashboardPage();
        driver.get(DashboardPage.URL);
        page = new DashboardPage(driver);
    }

    @Test
    public void testLoginPage_submitButton() throws InterruptedException {
        Thread.sleep(5000);
    }
}