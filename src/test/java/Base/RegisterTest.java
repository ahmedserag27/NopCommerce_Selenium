package Base;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegisterTest extends BaseTest {

HomePage homeObject;
RegisterPage registerObject;
LoginPage loginObject;
    @Test(priority = 1)
    public void RegisterSuccess(){
    homeObject = new HomePage(driver);
    registerObject=new RegisterPage(driver);
    homeObject.clickOnRegister();
    registerObject = new RegisterPage(driver);
    registerObject.enterUserData("ِahmed","serag","1","April","2000");
    registerObject.completeUserData("ana3@gmail.com","iti","123456");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    Assert.assertTrue(registerObject.registerAssertionMessage().contains("our registration completed"));

}
@Test(dependsOnMethods = {"RegisterSuccess"})

public void RegisteredUserCanLogin(){

homeObject=new HomePage(driver);
loginObject=new LoginPage(driver);

    homeObject.clickOnLogin();
    loginObject.setEmailField("ana3@gmail.com");
    loginObject.setPasswordField("123456");
    loginObject.clickLogin();
    Assert.assertTrue(driver.findElement(By.className("ico-account")).isDisplayed());
}
@Test(dependsOnMethods = {"RegisteredUserCanLogin"})

 public void RegisteredUserLogOut(){
        homeObject=new HomePage(driver);
    homeObject.clickLogout();
}

}
