package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
        WebDriver driver;
        private By header = By.xpath("//*[contains(text(),'My Profile')]");

        public ProfilePage(WebDriver driver) {
            this.driver = driver;
        }

        public boolean isDisplayed() {
            return driver.findElement(header).isDisplayed();
        }

    public By getProfileHeaderLocator() {
        return header;
    }
}
