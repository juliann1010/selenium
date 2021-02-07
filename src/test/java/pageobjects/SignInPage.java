package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    @FindBy(id = "email")
    private WebElement inputEmail;

    @FindBy(id = "passwd")
    private WebElement inputPass;

    public void typeEmail(String email){
        inputEmail.sendKeys(email);
    }

    public void typePass(String pass){
        inputPass.sendKeys(pass);
    }

    public void goToProfilePage(){
        inputPass.sendKeys(Keys.ENTER);
    }

    public void authenticate(String email, String pass){
        typeEmail(email);
        typePass(pass);
        goToProfilePage();
    }

    public SignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
