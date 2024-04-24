package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By emailField = By.className("email");
    private By passowrdField = By.className("password");
    private By loginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    private By forgetPassword = By.xpath("//a[text()='Forgot password?']");
    private By recover = By.xpath("//button[@name='send-email']");
    private By forgetEmail = By.xpath("//*[@id='Email']");
    private By message = By.xpath("//p[@class='content']");
    private By close = By.xpath("//span[@class='close']");

    public void setEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPasswordField(String password) {
        driver.findElement(passowrdField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();


    }
    public void clickForgetPasswordButton_LoginPage(){
        driver.findElement(forgetPassword).click();
    }
    public String CheckMessage(){
        return driver.findElement(message).getText();
    }
    public void setForgetPassword(String eMail) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for a maximum of 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(forgetEmail)); // Wait until the element is visible
        driver.findElement(forgetEmail).sendKeys(eMail);
    }
    public void RecoverEmailButton_LoginPage(){
        driver.findElement(recover).click();
    }
    public void CloseButton_LoginPage(){
        driver.findElement(close).click();
    }
}

