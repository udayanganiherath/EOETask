package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    private By dashboardHeader = By.xpath("//span[contains(text(),'Dashboard')]");
    private By profileLink = By.xpath("//*[@id=\"sidebar-multi-level-sidebar\"]/div/ul/li[1]/a");
    private By notificationLink = By.xpath("//*[@id=\"sidebar-multi-level-sidebar\"]/div/ul/li[3]/a");
    private By timeTableLink = By.xpath("//*[@id=\"sidebar-multi-level-sidebar\"]/div/ul/li[4]/a");



    public DashboardPage(WebDriver driver){
        this.driver = driver;

    }
    public By getDashboardleHeaderLocator() {
        return dashboardHeader;
    }
    public ProfilePage goToProfile() {
        driver.findElement(profileLink).click();
        return new ProfilePage(driver);
    }

    public NotificationPage goToNotification() {
        driver.findElement(notificationLink).click();
        return new NotificationPage(driver);
    }

    public TimeTablePage goToTimeTable() {
        driver.findElement(timeTableLink).click();
        return new TimeTablePage(driver);
    }

}
