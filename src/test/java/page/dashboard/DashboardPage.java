package page.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

    public static final String URL = "https://qaepower.instafin.info/dashboard";
    public static WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDashboardTitle(){
        return  driver.findElement(By.xpath("//h1[(@text='Dashboard')]"));
    }
}
