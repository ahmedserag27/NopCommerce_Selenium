package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    private WebDriver driver;
    private By Quantity =By.id("product_enteredQuantity_4");
    private By AddToWishList = By.id("add-to-wishlist-button-4");
    private By AddToCart = By.id("add-to-cart-button-4");
    private  By CartPageLink = By.xpath("//*[@id=\"bar-notification\"]/div/p/a");

    public ProductPage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement setQuantity() {
       return driver.findElement(Quantity);

    }
    public WebElement clickOnAddToWL(){
     return  driver.findElement(AddToWishList);

    }
    public void clickOnAddTC (){
        driver.findElement(AddToCart).click();
    }

    public AddToCartPage ClickCartPageLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       WebElement element= wait.until(ExpectedConditions.elementToBeClickable(CartPageLink));
        element.click();
    return new AddToCartPage(driver);
    }
}
