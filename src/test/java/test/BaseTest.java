package test;

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

import java.io.File;
import java.io.IOException;

@RunWith(BlockJUnit4ClassRunner.class)
public class BaseTest extends TestCase {

    private static ChromeDriverService service;
    public static WebDriver driver;
    ClassLoader classLoader = getClass().getClassLoader();

    @BeforeClass
    public static void setUpTests() throws IOException {
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
}