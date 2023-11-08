package Tasks;

import Framework.Brownser.Waits;
import PagesObjects.HomePage;
import PagesObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoginTasks {
    private final Map<String, String> envVariables;
    private Waits waits;
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    public LoginTasks(WebDriver driver) {
        this.driver = driver;
        homePage = new HomePage(this.driver);
        loginPage = new LoginPage(this.driver);
        this.envVariables = loadEnvVariables();
    }
    public void acessaConta2() {
        loginPage.getPreenhceEmail().sendKeys(envVariables.get("USERNAME"));
        loginPage.getrPreenhceSenha().sendKeys(envVariables.get("PASSWORD"));
        loginPage.getClicaAcessar().click();
    }
    public void acessaConta1() {
        loginPage.getPreenhceEmail().sendKeys(envVariables.get("USERNAME1"));
        loginPage.getrPreenhceSenha().sendKeys(envVariables.get("PASSWORD1"));
        loginPage.getClicaAcessar().click();
    }
    private Map<String, String> loadEnvVariables() {
        Map<String, String> envVars = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(".env"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    envVars.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return envVars;
    }
}