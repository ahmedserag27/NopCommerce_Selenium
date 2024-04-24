package Base;

import Pages.ProductPage;
import Pages.Search;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCartTest extends BaseTest{
    Search searchObject;
    ProductPage productObject ;
    @Test
    public void UserCanAddProductToCart()  {
        searchObject = new Search(driver);
        productObject = new ProductPage(driver);
        searchObject = new Search(driver);
        productObject = new ProductPage(driver);
        searchObject.insertItemName("mac");
        searchObject.clickSearchButton();
        Assert.assertTrue(searchObject.productLink().getText().toLowerCase().contains("mac"));
        searchObject.productLink().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Assert.assertTrue(productObject.clickOnAddToWL().isDisplayed());
        productObject.clickOnAddTC();
        productObject.ClickCartPageLink();
        Assert.assertTrue(driver.getCurrentUrl().contains("cart"));




    }

}
