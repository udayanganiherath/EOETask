package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OTPVerificationPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private final By[] otpInputs = {
            By.id("code-1"),
            By.id("code-2"),
            By.id("code-3"),
            By.id("code-4"),
            By.id("code-5"),
            By.id("code-6")
    };

    private By verifyButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/button");
    private By resendButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[1]/button");

    public OTPVerificationPage(WebDriver driver) {
        this.driver = driver;
    }


public void enterOTP(String otp) {

    if (otp == null || !otp.matches("\\d{6}")) {
        throw new IllegalArgumentException("OTP must be a 6-digit numeric value");
    }
    System.out.println("Autofilling OTP: " + otp);


    for (int i = 0; i < otpInputs.length; i++) {
        wait.until(ExpectedConditions.elementToBeClickable(otpInputs[i]));
        driver.findElement(otpInputs[i]).clear();
        driver.findElement(otpInputs[i]).sendKeys(String.valueOf(otp.charAt(i)));
    }
}


    public void clickVerify() {
        driver.findElement(verifyButton).click();
    }

    public void clickResend() {
        driver.findElement(resendButton).click();
    }
    public By getFirstOTPInput() {
        return otpInputs[0];
    }
}

