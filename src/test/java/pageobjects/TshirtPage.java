package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtPage {

    private WebDriver driver;

    @FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
    private WebElement imageTshirt;

    @FindBy(xpath = "//span[contains(text(), 'Add to cart')]")
    private WebElement btnAddToCart;

    @FindBy(xpath = "//span[contains(text(), 'Proceed')]")
    private WebElement btnProceed;

    public void addToCart(){
        Actions action = new Actions(driver);
        action.moveToElement(imageTshirt).moveToElement(btnAddToCart).click().build().perform();
    }

    public void proceedCheckout(){
        btnProceed.click();
    }


    public TshirtPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
