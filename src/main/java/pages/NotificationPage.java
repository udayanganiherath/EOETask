package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class NotificationPage {

        WebDriver driver;
        private By header = By.xpath("//*[contains(text(),'Notifications')]");

        public NotificationPage(WebDriver driver) {
            this.driver = driver;
        }

        public boolean isDisplayed() {
            return driver.findElement(header).isDisplayed();
        }

    public By getNotificationHeaderLocator() {
        return header;
    }
}
