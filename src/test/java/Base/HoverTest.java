package Base;

import Pages.HoverMenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends BaseTest{
    HoverMenuPage hoverObject;
    @Test
    public void UserCanChoseSubMinu(){
        hoverObject=new HoverMenuPage(driver);
        hoverObject.HoverOverComputers();
        Assert.assertTrue(driver.getCurrentUrl().contains("desktop"));
    }
}
