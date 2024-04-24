package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage {
    private WebDriver driver;

    private By changePasswoedLink =By.xpath("/html/body/div[6]/div[3]/div/div[1]/div/div[2]/ul/li[7]/a");
    private By oldpassword =By.id("OldPassword");
    private By newpassword =By.id("NewPassword");
    private By confirmnewpassoword = By.id("ConfirmNewPassword");
    private By changebutton = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button");

    public AccountPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void clickChangePassword (){
        driver.findElement(changePasswoedLink).click();
    }

    public void setOldpassword(String oldpass) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for a maximum of 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(oldpassword)); // Wait until the element is visible
        driver.findElement(oldpassword).sendKeys(oldpass);
    }
    public void setNewpassword(String newpass) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for a maximum of 10 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(newpassword)); // Wait until the element is visible
        driver.findElement(oldpassword).sendKeys(newpass);
    }
        public void setConfirmnewpassoword(String confpass) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for a maximum of 10 seconds
            wait.until(ExpectedConditions.visibilityOfElementLocated(confirmnewpassoword)); // Wait until the element is visible
            driver.findElement(oldpassword).sendKeys(confpass);
        }
    public void setChangebutton(){
        driver.findElement(changebutton).click();
    }

}
