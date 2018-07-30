package page.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DashboardPage {

    public static final String URL = "https://qaepower.instafin.info/dashboard";
    public static WebDriver driver;
    private List<WebElement> activityStreamList;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDashboardTitle(){
        return  driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]"));
    }

    public List<WebElement> getActivityStream(){
        return driver.findElements(By.id("activity-stream"));
    }

    public WebElement getActivityItemUser (WebElement activityItem){
        return  activityItem.findElement(By.className("activity-item-user"));
    }

    public WebElement getActivityItemInfo (WebElement activityItem){
        return  activityItem.findElement(By.className("activity-item-info"));
    }

}
