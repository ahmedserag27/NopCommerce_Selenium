package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private  By Loginlink = By.linkText("Log in");
    private  By registerlink = By.linkText("Register");
    private  By Logoutlink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
    private By myAccountlink =By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public  LoginPage clickOnLogin (){
        driver.findElement(Loginlink).click();
        return new LoginPage(driver);
    }
    public  RegisterPage clickOnRegister (){
        driver.findElement(registerlink).click();
        return new RegisterPage(driver);
    }
    public   void clickLogout (){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Adjust the timeout as needed
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Logoutlink));
        element.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(Logoutlink).click();

    }
    public  AccountPage clickOnAccount (){
        driver.findElement(myAccountlink).click();
        return new AccountPage(driver);
    }

}
