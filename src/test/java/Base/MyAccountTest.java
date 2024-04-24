package Base;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest{

    HomePage homeObject;
    LoginPage loginObject;
    AccountPage accountObject;

    @Test(priority = 1)
    public void RegisteredUserCanLogin(){

        homeObject=new HomePage(driver);
        loginObject=new LoginPage(driver);

        homeObject.clickOnLogin();
        loginObject.setEmailField("ana12@gmail.com");
        loginObject.setPasswordField("789456");
        loginObject.clickLogin();
        Assert.assertTrue(driver.findElement(By.className("ico-account")).isDisplayed());
    }
    @Test(priority = 2)
    public void RegisteredUserCanChangePassword(){
        homeObject=new HomePage(driver);
        accountObject=new AccountPage(driver);
        homeObject.clickOnAccount();
        accountObject.clickChangePassword();
        accountObject.setOldpassword("789456");
        accountObject.setNewpassword("232323");
        accountObject.setConfirmnewpassoword("232323");
        accountObject.clickChangePassword();
    }

}
