package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class HoverMenuPage {
    private WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    private By computers = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");
    private By books =By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a");
    private By Deskktop =By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a");


    public HoverMenuPage(WebDriver driver){
        this.driver=driver;
    }
    public void HoverOverComputers(){
        actions = new Actions(driver);
        actions.moveToElement(driver.findElement(computers)).perform();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Deskktop)));
        actions.moveToElement(driver.findElement(Deskktop)).click().perform();
    }

}
