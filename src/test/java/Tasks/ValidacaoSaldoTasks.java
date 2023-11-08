package Tasks;

import Framework.Brownser.Waits;
import PagesObjects.HomePage;
import PagesObjects.LoginPage;
import PagesObjects.ValidacaoSaldoPage;
import org.openqa.selenium.WebDriver;

public class ValidacaoSaldoTasks {
    private Waits waits;
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private final ValidacaoSaldoPage ValidacaoSaldoPage;
    public ValidacaoSaldoTasks(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(this.driver);
        loginPage = new LoginPage(this.driver);
        ValidacaoSaldoPage = new ValidacaoSaldoPage(this.driver);
    }
    public void validaSaldo() throws InterruptedException {
        Thread.sleep(500);
        ValidacaoSaldoPage.getValidaSaldo2();

    }

}

