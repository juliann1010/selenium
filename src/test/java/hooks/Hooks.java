package hooks;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.*;

import java.util.concurrent.TimeUnit;

public class Hooks {

    protected WebDriver firefoxDriver;

    protected HomePage homePage;
    protected SignInPage signInPage;
    protected ProfilePage profilePage;
    protected TshirtPage tshirtPage;
    protected OrderPage orderPage;

    public void initializePageObjects(WebDriver driver){
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        profilePage = new ProfilePage(driver);
        tshirtPage = new TshirtPage(driver);
        orderPage = new OrderPage(driver);
    }

    @Before
    public void abrirNavegador(){
        //Encontrar driver de gecko
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");

        //Inactivar la propiedad marionette de firefox
        System.setProperty("webdriver.firefox.marionette", "false");

        //Crear instancia del navegador de firefox
        firefoxDriver = new FirefoxDriver();

        //configuracion del timeout para el navegador
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        initializePageObjects(firefoxDriver);
    }

    @After
    public void cerrarNavegador(){
        firefoxDriver.quit();
    }
}
