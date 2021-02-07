import hooks.Hooks;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CompraTest extends Hooks {


    @Test
    public void hacerUnaCompra() {
        //Abre esta URL por defecto
        firefoxDriver.get("http://www.automationpractice.com/index.php");

        //Go to the Sign in Page
        homePage.goToSignInPage();

        //Credentials - Go to the profile page
        signInPage.authenticate("juliann1010@gmail.com", "Guardiano42$%$");


        //Go to the T-shirts page
        profilePage.goToTshirtPage();


        //Mover mouse de una imagen a un boton
        tshirtPage.addToCart();

        //Cierre de compra
        tshirtPage.proceedCheckout();
        orderPage.proceedShopping();

        //asercion
        WebElement banner = firefoxDriver.findElement(By.className("alert-success"));
        Assert.assertTrue(banner.isDisplayed());

    }


}
