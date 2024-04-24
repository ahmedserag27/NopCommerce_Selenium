package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private WebDriver driver;
    Select select;

    private By malebutton = By.id("gender-male");

    private By firstname = By.id("FirstName");

    private By lastname = By.id("LastName");
    private By dayOfBirth = By.name("DateOfBirthDay");
    private By monthOfBirth = By.name("DateOfBirthMonth");
    private By yearOfBirth = By.name("DateOfBirthYear");

    private By emailTxt = By.xpath("//*[@id=\"Email\"]");

    private final By companyTxt = By.id("Company");
    private By passwordTxt = By.xpath("//*[@id=\"Password\"]");
    private By confirmPasswordTxt = By.xpath("//*[@id=\"ConfirmPassword\"]");
    private By registerButton = By.id("register-button");
    private  By registerAssertion = By.xpath("//div[@class='result']");
    private  By continueButton = By.xpath("//a[@class='button-1 register-continue-button']");



    //functions -------------------------------------------------------
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserData(String firstName, String lastName, String day, String month, String year){
        driver.findElement(malebutton).click();
        driver.findElement(firstname).sendKeys(firstName);
        driver.findElement(lastname).sendKeys(lastName);
        select = new Select(driver.findElement(dayOfBirth));
        select.selectByVisibleText(day);
        select = new Select(driver.findElement(monthOfBirth));
        select.selectByVisibleText(month);
        select = new Select(driver.findElement(yearOfBirth));
        select.selectByVisibleText(year);
    }
    public void completeUserData(String email, String company, String password){
        driver.findElement(emailTxt).sendKeys(email);
        driver.findElement(companyTxt).sendKeys(company);
        driver.findElement(passwordTxt).sendKeys(password);
        driver.findElement(confirmPasswordTxt).sendKeys(password);
        driver.findElement(registerButton).click();
    }
    public String registerAssertionMessage(){
        return driver.findElement(registerAssertion).getText();
    }

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }

}