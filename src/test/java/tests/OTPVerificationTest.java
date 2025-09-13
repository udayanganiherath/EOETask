//package tests;
//
//import base.BaseTest;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.OTPVerificationPage;
//
//public class OTPVerificationTest extends RegistrationTest{ // Extend BaseTest to get driver
//
//    @Test
//    public void navigateToVerificationPage() {
//        String expected = "https://eoe.lk/signin-verification";
//        String actual = driver.getCurrentUrl();
//        Assert.assertEquals(actual, expected);
//        System.out.println("Navigated to Verification Page: " + actual);
//    }
//    @Test
//    public void test_verification() throws InterruptedException {
////     WebDriver driver = getDriver(); // Get initialized driver from BaseTest
//        OTPVerificationPage otpPage = new OTPVerificationPage(driver);
//
//        // Show browser prompt to enter OTP
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        String otp = (String) js.executeScript("return prompt('Enter 6-digit OTP:');");
//
//        // Validate OTP
//        if (otp == null || otp.length() != 6) {
//            System.out.println("Invalid OTP entered.");
//            return;
//        }
//
//        // Enter OTP in input fields
//        otpPage.enterOTP(otp);
//
//        // Click verify
//        otpPage.clickVerify();
//
//        // Optional: Assert success
//        // Assert.assertTrue(otpPage.isSuccessMessageDisplayed(), "OTP verification failed");
//    }
//}
