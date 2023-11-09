package Tasks;

import Framework.Brownser.Waits;
import PagesObjects.HomePage;
import PagesObjects.LoginPage;
import PagesObjects.ValidacaoSaldoPage;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;

public class HomeTasks {
    private Waits waits;
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    ValidacaoSaldoPage validacaoSaldoPage = new ValidacaoSaldoPage(this.driver);
    private String email1 = "teste1@gmail.com";
    private String email2 = "teste2@gmail.com";

    public HomeTasks(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(this.driver);
        LoginPage loginPage = new LoginPage(this.driver);
    }
    public void efetuarCadastro1() throws InterruptedException {
        homePage.getClickRegister().click();
        homePage.getCriaEmail().sendKeys(email1);
        homePage.getCriaNome().sendKeys("teste1");
        homePage.getCriaPassword().sendKeys("teste1");
        homePage.getConfirmaPassword().sendKeys("teste1");
        Thread.sleep(400);
        homePage.getCriaSaldo().click();
        homePage.getCadastra().click();
        Thread.sleep(500);
        homePage.getTrata();
        homePage.getFechaModal().click();
        driver.navigate().refresh();
    }
    public void efetuarCadastro2() throws InterruptedException {

        homePage.getClickRegister().click();
        homePage.getCriaEmail().sendKeys("teste2@gmail.com");
        homePage.getCriaNome().sendKeys("teste2");
        homePage.getCriaPassword().sendKeys("teste2");
        homePage.getConfirmaPassword().sendKeys("teste2");
        Thread.sleep(400);
        homePage.getCriaSaldo().click();
        homePage.getCadastra().click();
        Thread.sleep(500);
        homePage.getTrata2();
        homePage.getFechaModal().click();
        driver.navigate().refresh();
    }
    public void transfereSaldo() throws InterruptedException {
        Thread.sleep(500);
        homePage.getTransferencia().click();
        Thread.sleep(500);
        homePage.getPreencheConta().sendKeys(homePage.getConta1());
        homePage.getPreencheDigit().sendKeys(homePage.getDigito1());
        homePage.getValorTransferencia().sendKeys("100");
        homePage.getValorTransferido().sendKeys("100");
        homePage.getTransferirAgora().click();
    }
    public void validaTransferencia() throws InterruptedException {
        Thread.sleep(500);
        homePage.getFechaModal2().click();
        homePage.getVoltaHome().click();
        validacaoSaldoPage.getValidaSaldo();
        homePage.getSairConta().click();
    }
}

