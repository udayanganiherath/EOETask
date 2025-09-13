package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

@Test
public class DashboardTest extends BaseTest {
    public void test_dashboard() {
        LoginPage loginpage = new LoginPage(driver);
 DashboardPage dashboardpage = new DashboardPage(driver);

    }

    }

