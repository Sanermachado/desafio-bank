package PagesObjects;

import Framework.Brownser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Framework.Brownser.DriverManager.driver;

public class LoginPage {
    private final WebDriver driver;
    public LoginPage (WebDriver driver){
        this.driver = driver;
        Waits waits = new Waits(this.driver);
    }
    public WebElement getPreenhceEmail() {
        WebElement prenehceEmail = driver.findElement(By.name("email"));
        return prenehceEmail;
    }
    public WebElement getrPreenhceSenha() {
        WebElement prenehceEmail = driver.findElement(By.name("password"));
        return prenehceEmail;
    }
    public WebElement getClicaAcessar(){
        WebElement clicaAcessar = driver.findElement(By.cssSelector(".otUnI"));
        return clicaAcessar;
    }

}
