package TestClasses;

import Framework.TestBase;
import Tasks.HomeTasks;
import Tasks.LoginTasks;
import Tasks.ValidacaoSaldoTasks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class desafioBug extends TestBase {
    private WebDriver driver = getDriver();

    HomeTasks homeTasks = new HomeTasks(driver);
    LoginTasks loginTasks = new LoginTasks(driver);
    ValidacaoSaldoTasks validacaoSaldoTasks = new ValidacaoSaldoTasks(driver);

    @Test
    public void Transferencia() throws InterruptedException {
        homeTasks.efetuarCadastro1();
        homeTasks.efetuarCadastro2();
        loginTasks.acessaConta2();
        homeTasks.transfereSaldo();
        homeTasks.validaTransferencia();
        loginTasks.acessaConta1();
        validacaoSaldoTasks.validaSaldo();
    }

}
