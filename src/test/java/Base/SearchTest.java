package Base;

import Pages.Search;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchTest extends BaseTest {
    Search searchObject;

    @Test
    public void userCanSearchProduct()  {
        searchObject = new Search(driver);
        searchObject.insertItemName("mac");
        searchObject.clickSearchButton();
       Assert.assertTrue(searchObject.productLink().getText().toLowerCase().contains("mac"));

    }
}
