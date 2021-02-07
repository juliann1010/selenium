package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    @FindBy(xpath = "//li[3]//a[@title='T-shirts']")
    private WebElement btnTshirt;

    public void goToTshirtPage(){
        btnTshirt.click();
    }


    public ProfilePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
