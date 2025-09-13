package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    private static WebDriver driver;

    private By mobileNumberTextBox = By.id("mobile_contact_number");
     private By passwordTextBox = By.id("password");
     private By signInButton = By.xpath("//*[@id=\"root\"]/div/form/div/div[4]/button");


     public LoginPage(WebDriver driver){
         this.driver = driver;

     }

     public void enterMobileNumber(String mobileNumber){
        driver.findElement(mobileNumberTextBox).sendKeys(mobileNumber);
     }
     public void enterPassword(String password){
         driver.findElement(passwordTextBox).sendKeys(password);

     }
     public void clickLogin(){
        driver.findElement(signInButton).click();
     }


}
