package TestClasses;

import Framework.TestBase;
import Tasks.HomeTasks;
import Tasks.LoginTasks;
import Tasks.ValidacaoSaldoTasks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.awt.*;
import java.io.File;

public class desafioBug extends TestBase {
    private WebDriver driver = getDriver();
    private ExtentReports extent;
    private ExtentTest test;

    HomeTasks homeTasks = new HomeTasks(driver);
    LoginTasks loginTasks = new LoginTasks(driver);
    ValidacaoSaldoTasks validacaoSaldoTasks = new ValidacaoSaldoTasks(driver);

    @BeforeEach
    public void setUp() {
        // Inicializa o ExtentReports e ExtentHtmlReporter
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        test = extent.createTest("Teste de Transferência", "Realiza transferência entre contas e valida saldo");
    }

    @Test
    public void Transferencia() throws InterruptedException {
        test.log(Status.INFO, "Iniciando o teste...");

        homeTasks.efetuarCadastro1();
        homeTasks.efetuarCadastro2();
        loginTasks.acessaConta2();
        homeTasks.transfereSaldo();
        homeTasks.validaTransferencia();
        loginTasks.acessaConta1();
        validacaoSaldoTasks.validaSaldo();

        test.log(Status.PASS, "Teste de transferência realizado com sucesso");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();

        extent.flush();
        try {
            File htmlFile = new File("extent-report.html");
            if (htmlFile.exists()) {
                Desktop.getDesktop().browse(htmlFile.toURI());
            } else {
                System.out.println("O arquivo de relatório não foi encontrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
