package Base;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    public static WebDriver driver;
    protected HomePage homepage;
    @BeforeSuite
    public void setUp (){
       // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homepage = new HomePage(driver);
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();


    }

   @AfterSuite
    public void close() {
       driver.quit();
   }
}
