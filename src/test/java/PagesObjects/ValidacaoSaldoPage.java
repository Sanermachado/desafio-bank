package PagesObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Framework.Brownser.DriverManager.driver;
public class ValidacaoSaldoPage {
    public ValidacaoSaldoPage(WebDriver driver) {
    }
        public void getValidaSaldo() {
        {
            WebElement elemento1 = driver.findElement(By.id("textBalance"));
            String resultadoEsperado = "Saldo em conta R$ 900,00";
            String resultadoObtido = elemento1.getText();
            Assert.assertEquals("O saldo exibido não é o esperado.", resultadoEsperado, resultadoObtido);
        }
    }
    public void getValidaSaldo2() {
        {
            WebElement elemento = driver.findElement(By.id("textBalance"));
            String resultadoEsperado = "Saldo em conta R$ 1.100,00";
            String resultadoObtido = elemento.getText();
            Assert.assertEquals("O saldo exibido não é o esperado.", resultadoEsperado, resultadoObtido);
        }

    }
}
