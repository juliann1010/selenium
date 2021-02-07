import hooks.Hooks;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class PruebaTest extends Hooks {

    @Test
    public void hacerUnaBusqueda(){

        //Abre esta URL por defecto
        firefoxDriver.get("https://www.google.com/");

        //Encontrar e interactuar con elementos
        firefoxDriver.findElement(By.xpath("//input[@title='Buscar']")).sendKeys("Cantidad de paises en america");
        firefoxDriver.findElement(By.xpath("//input[@title='Buscar']")).sendKeys(Keys.ENTER);

        firefoxDriver.findElement(By.xpath("//span[contains(text(), 'Saber es')]")).click();

        WebElement parrafo = firefoxDriver.findElement(By.xpath("(//P)[2]"));

        Assert.assertTrue(parrafo.getText().contains("35"));

    }


}
