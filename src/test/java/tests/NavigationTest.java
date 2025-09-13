package tests;

import base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class NavigationTest extends BaseTest {

    @Test
    public void test_navigation_sequence() {
        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterMobileNumber("0770378032");
        loginPage.enterPassword("Sathya@99");
        loginPage.clickLogin();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        // Wait until the Dashboard text/element is visible
        DashboardPage dashboardPage = new DashboardPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboardPage.getDashboardleHeaderLocator()));
        System.out.println("Logged in and landed on Dashboard.");


        // Step 2: Navigate to Profile
        ProfilePage profilePage = dashboardPage.goToProfile();
        wait.until(ExpectedConditions.visibilityOfElementLocated(profilePage.getProfileHeaderLocator()));
        Assert.assertTrue(profilePage.isDisplayed(), "Profile page not displayed");
        System.out.println("Navigated to Profile page.");

// Step 3: Navigate to Notifications
        NotificationPage notificationPage = dashboardPage.goToNotification();
        wait.until(ExpectedConditions.visibilityOfElementLocated(notificationPage.getNotificationHeaderLocator()));
        Assert.assertTrue(notificationPage.isDisplayed(), "Notification page not displayed");
        System.out.println("Navigated to Notifications page.");

// Step 4: Navigate to Time Table
        TimeTablePage timeTablePage = dashboardPage.goToTimeTable();
        wait.until(ExpectedConditions.visibilityOfElementLocated(timeTablePage.getTimeTableHeaderLocator()));
        Assert.assertTrue(timeTablePage.isDisplayed(), "Time Table page not displayed");
        System.out.println("Navigated to Time Table page.");

    }
}
