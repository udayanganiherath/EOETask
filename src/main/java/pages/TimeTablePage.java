package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimeTablePage {

        WebDriver driver;
        private By header = By.xpath("//*[contains(text(),'Time Table')]");

        public TimeTablePage(WebDriver driver) {
            this.driver = driver;
        }

        public boolean isDisplayed() {
            return driver.findElement(header).isDisplayed();
        }

    public By getTimeTableHeaderLocator() {
        return header;
    }
}
