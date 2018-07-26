import jdk.nashorn.internal.parser.JSONParser;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@RunWith(BlockJUnit4ClassRunner.class)
public class InfoPageTest extends TestCase {

    private static ChromeDriverService service;
    private WebDriver driver;
    ClassLoader classLoader = getClass().getClassLoader();

    @BeforeClass
    public static void createAndStartService() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("/Users/power/powem/code/InstafinTests/src/test/resources/chromedriver"))  //todo make this dynamic
                .usingAnyFreePort()
                .build();
        service.start();
    }

    @AfterClass
    public static void createAndStopService() {
        service.stop();
    }

    @Before
    public void createDriver() {
        driver = new RemoteWebDriver(service.getUrl(),
                DesiredCapabilities.chrome());
    }

    @After
    public void quitDriver() {
        driver.quit();
    }

    @Test
    public void testInfoPage() throws InterruptedException {
        driver.get("https://qaepower.instafin.info/");
        Thread.sleep(5000);
    }
}