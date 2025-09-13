package tests;

import base.BaseTest;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void test_invalidLogin() throws InterruptedException {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.enterMobileNumber("0770378031");
        Thread.sleep(2000);
        loginpage.enterPassword("Sathya@90");
        Thread.sleep(2000);
        loginpage.clickLogin();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement toastMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(text(),'Invalid Credentials')]")
        ));

        // Validate toast text
        Assert.assertEquals(toastMessage.getText(), "Invalid Credentials", "Toast message mismatch!");
        System.out.println("Toast message displayed: " + toastMessage.getText());
    }
    @Test
    public void test_validLogin() throws InterruptedException {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.enterMobileNumber("0770378032");
        Thread.sleep(2000);
        loginpage.enterPassword("Sathya@99");
        Thread.sleep(2000);
        loginpage.clickLogin();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement toastMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(text(),'Successfully Logged in')]")
        ));

        // Validate toast text
        Assert.assertEquals(toastMessage.getText(), "Successfully Logged in", "Successfully Logged in");
        System.out.println("Toast message displayed: " + toastMessage.getText());

        DashboardPage dashboardPage = new DashboardPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboardPage.getDashboardleHeaderLocator()));
        System.out.println("Logged in Successfully.");

    }



}
