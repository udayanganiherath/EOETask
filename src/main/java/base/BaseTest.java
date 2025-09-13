package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
   protected WebDriver driver;

   @BeforeMethod
   public void setUp(){
       driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://eoe.lk/");
   }
    @AfterMethod
   public void teardown(){
       if(driver != null){
        driver.quit();
       }
   }

    public WebDriver getDriver() {
        return driver;
    }

}
