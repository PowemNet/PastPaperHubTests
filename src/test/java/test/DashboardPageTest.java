package test;

import Util.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import page.NavigationHelper;
import page.dashboard.DashboardPage;
import page.dashboard.DashboardStrings;

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

    /**
     * Test #2
     * When the dashboard page is shown, the activity stream should be shown with the most recent 10 records
     */
    @Test
    public void testDashboardPage_activityStream() {
        assertEquals(DashboardStrings.NUMBER_OF_ACTVITY_ITEMS_IN_ACTIVITY_STREAM, page.getActivityStream().size());
    }
}