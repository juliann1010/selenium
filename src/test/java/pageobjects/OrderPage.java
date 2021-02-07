package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

    @FindBy(xpath = "//p//a//span[contains(text(), 'Proceed')]")
    private WebElement btnProceedCheckout;

    @FindBy(xpath = "//button//span[contains(text(), 'Proceed')]")
    private WebElement btnContinue;

    @FindBy(css = "#cgv")
    private WebElement checkAccept;

    @FindBy(xpath = "//a[@title='Pay by check.']")
    private WebElement btnPayByCheck;

    @FindBy(xpath = "//button//span[contains(text(), 'I confirm my order')]")
    private WebElement btnConfirm;

    public void proceedShopping(){
        btnProceedCheckout.click();
        btnContinue.click();
        checkAccept.click();
        btnContinue.click();
        btnPayByCheck.click();
        btnConfirm.click();
    }

    public OrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
