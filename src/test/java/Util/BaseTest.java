package Util;

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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

@RunWith(BlockJUnit4ClassRunner.class)
public class BaseTest extends TestCase {

    private static ChromeDriverService service;
    public static WebDriver driver;
    static String resourceUrl = BaseTest.class.getClassLoader().getResource("chromedriver").getFile();

    @BeforeClass
    public static void setUpTests() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(resourceUrl))
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
//        driver = new RemoteWebDriver(service.getUrl(),
//                DesiredCapabilities.chrome());
        driver = new RemoteWebDriver(service.getUrl(),
                new ChromeOptions());
        //todo : log user out before any test starts
    }

    @After
    public void quitDriver() {
        driver.quit();
    }
}