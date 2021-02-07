package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(className = "login")
    private WebElement btnSignIn;

    public void goToSignInPage(){
        btnSignIn.click();
    }

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
