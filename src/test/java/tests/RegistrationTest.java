package tests;
import base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OTPVerificationPage;
import pages.RegistrationPage;
import java.time.Duration;


public class RegistrationTest extends BaseTest {
    @Test
    public void test_registration() throws InterruptedException{
        RegistrationPage registrationPage =  new RegistrationPage(driver);
        registrationPage.clickCreateButton();
        registrationPage.enterFirstName("Amasha");
        registrationPage.enterLastName("Perera");
        registrationPage.enterMobileNumber("0771437502");
        registrationPage.enterWhatsappNumber("0771437502");
        registrationPage.enterNIC("200056925606");
        registrationPage.enterAddress("Kadawatha,Moratuwa");
        registrationPage.selectDistrict("Colombo");
        registrationPage.selectStream("Arts");
        registrationPage.enterSchool("Mahamaya collage");
        registrationPage.selectExamYear("Advanced Level 2025");
        registrationPage.selectGender("Female");
        registrationPage.enterPassword("Amasha@20");
        registrationPage.enterConfirmPassword("Amasha@20");
        registrationPage.clickCheckbox();

        Assert.assertTrue(registrationPage.areAllFieldsFilled(), "Some required fields are empty");
       Assert.assertTrue(registrationPage.isMobileValid(), "Mobile number must be 10 digits");
        Assert.assertTrue(registrationPage.isNICValid(), "NIC must be 12 digits");
        Assert.assertTrue(registrationPage.isPasswordMatching(), "Password and Confirm Password do not match");

        OTPVerificationPage otpPage = registrationPage.clickSignUpButton();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.urlContains("/signin-verification"));
        Assert.assertTrue(driver.getCurrentUrl().contains("/signin-verification"), "Login failed: Did not redirect to dashboard");

        System.out.println("Successfully redirect to the verification page");



    }




}
