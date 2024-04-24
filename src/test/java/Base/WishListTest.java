package Base;

import Pages.ProductPage;
import Pages.Search;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WishListTest extends BaseTest {
    ProductPage productObject;
    Search searchObject;

    @Test
    public  void userCanSearchProductAddToWishList ()  {

        searchObject = new Search(driver);
        productObject = new ProductPage(driver);
        searchObject.insertItemName("mac");
        searchObject.clickSearchButton();
        Assert.assertTrue(searchObject.productLink().getText().toLowerCase().contains("mac"));
        searchObject.productLink().click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Assert.assertTrue(productObject.clickOnAddToWL().isDisplayed());




    }
}
