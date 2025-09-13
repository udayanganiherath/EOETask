package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test()
public class RegistrationPage {
    private WebDriver driver;

    private By createButton = By.xpath(" //*[@id=\"root\"]/div/form/div/div[6]/h3/a");
    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By mobileNumber = By.id("mobile_contact_number");
    private By whatsappNumber = By.id("contact_number");
    private By nic = By.id("nic");
    private By address = By.id("address");
    private By district = By.xpath("//*[@id=\"district\"]");
    private By stream = By.id("stream");
    private By school = By.id("school_name");
    private By examYear = By.id("exam_year");
    private By gender = By.id("gender");
    private By password = By.id("password");
    private By confirmPassword = By.id("password_confirmation");
    private By signUpButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[10]/button");

    private By agreeButton = By.id("agree");

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickCreateButton(){
        driver.findElement(createButton).click();

    }

    public void enterFirstName(String FirstName){
        driver.findElement(firstName).sendKeys(FirstName);

    }
    public void enterLastName(String LastName){
        driver.findElement(lastName).sendKeys(LastName);

    }
    public void enterMobileNumber(String MobileNumber){
        driver.findElement(mobileNumber).sendKeys(MobileNumber);

    }
    public void enterWhatsappNumber(String WhatsappNumber){
        driver.findElement(whatsappNumber).sendKeys(WhatsappNumber);

    }
    public void enterAddress(String Address){
        driver.findElement(address).sendKeys(Address);

    }
    public void enterNIC(String NIC){
        driver.findElement(nic).sendKeys(NIC);

    }
    public void selectDistrict(String DistrictValue){
        WebElement districtDropdown = driver.findElement(district);
        Select select =new Select(districtDropdown);
        districtDropdown.click();
        select.selectByVisibleText(DistrictValue);

    }
    public void selectStream(String StreamValue){
        WebElement streamDropdown = driver.findElement(stream);
        Select select =new Select(streamDropdown);
        streamDropdown.click();
        select.selectByVisibleText(StreamValue);

    }
    public void enterSchool(String School){
        driver.findElement(school).sendKeys(School);

    }
    public void selectExamYear(String ExamYearValue){
        WebElement examYearDropdown = driver.findElement(examYear);
        Select select =new Select(examYearDropdown);
        examYearDropdown.click();
        select.selectByVisibleText(ExamYearValue);

    }
    public void selectGender(String GenderValue){
        WebElement genderDropdown = driver.findElement(gender);
        Select select =new Select(genderDropdown);
        genderDropdown.click();
        select.selectByVisibleText(GenderValue);

    }
    public void enterPassword(String Password){
        driver.findElement(password).sendKeys(Password);

    }
    public void enterConfirmPassword(String ConfirmPassword){
        driver.findElement(confirmPassword).sendKeys(ConfirmPassword);

    }
    public void clickCheckbox(){
        driver.findElement(agreeButton).click();
    }
    public OTPVerificationPage clickSignUpButton(){
        driver.findElement(signUpButton).click();
        return new OTPVerificationPage(driver);
    }

    public boolean isMobileValid() {
        String mobile = driver.findElement(mobileNumber).getAttribute("value");
        return mobile != null && mobile.matches("\\d{10}");}
    public boolean isNICValid() {
        String nicValue = driver.findElement(nic).getAttribute("value");
        return nicValue != null && nicValue.matches("\\d{12}");
    }

    public boolean isPasswordMatching() {
        String pass = driver.findElement(password).getAttribute("value");
        String confirmPass = driver.findElement(confirmPassword).getAttribute("value");
        return pass != null && pass.equals(confirmPass);
    }
    public boolean areAllFieldsFilled() {
        return !driver.findElement(firstName).getAttribute("value").isEmpty()
                && !driver.findElement(lastName).getAttribute("value").isEmpty()
                && !driver.findElement(mobileNumber).getAttribute("value").isEmpty()
                && !driver.findElement(whatsappNumber).getAttribute("value").isEmpty()
                && !driver.findElement(nic).getAttribute("value").isEmpty()
                && !driver.findElement(address).getAttribute("value").isEmpty()
                && !driver.findElement(password).getAttribute("value").isEmpty()
                && !driver.findElement(confirmPassword).getAttribute("value").isEmpty();
    }

}
