package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Search {
    private WebDriver driver;

    private By searchField = By.id("small-searchterms");
    private By searchButton = By.xpath("//*[@id=\"small-search-box-form\"]/button");
    public By macBookLink = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a");
    public Search(WebDriver driver){
        this.driver=driver;
    }

    public void insertItemName (String item){
        driver.findElement(searchField).sendKeys(item);


    }
    public void clickSearchButton(){
        driver.findElement(searchButton).click();



    }
    public WebElement productLink(){

        return driver.findElement(macBookLink );
    }

}
