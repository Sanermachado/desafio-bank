package PagesObjects;

import Framework.Brownser.Waits;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
private String conta1;
private  String digito1;
private String conta2;
private  String digito2;
private WebDriver driver;
private Waits waits;
    public HomePage (WebDriver driver){
    this.driver = driver;
    waits = new Waits(this.driver);
    }
    //CRIAÇÃO DAS CONTA 1
    public WebElement getClickRegister() {
    WebElement clickregistro = driver.findElement(By.cssSelector(".ihdmxA"));
    return clickregistro;
    }
    public WebElement getCriaEmail() {
        WebElement criaEmail = driver.findElement(By.cssSelector(".style__ContainerFieldInput-sc-s3e9ea-0:nth-child(2) > .input__default"));
        return criaEmail;
    }
    public WebElement getCriaNome() {
        WebElement criaPassword = driver.findElement(By.cssSelector(".login__password:nth-child(4) .input__default"));
        return criaPassword;
    }
    public WebElement getCriaPassword() {
        WebElement criaPassword = driver.findElement(By.cssSelector(".style__ContainerFieldInput-sc-s3e9ea-0:nth-child(3) > .input__default"));
        return criaPassword;
    }
    public WebElement getConfirmaPassword() {
        WebElement confirmarPassword = driver.findElement(By.cssSelector(".login__password:nth-child(5) .input__default"));
        return confirmarPassword;
    }
    public WebElement getCriaSaldo() {
        WebElement criaSaldo = driver.findElement(By.cssSelector(".kIwoPV"));
        return criaSaldo;
    }
    public WebElement getCadastra() {
        WebElement cadastraConta = driver.findElement(By.cssSelector(".CMabB"));
        return cadastraConta;
    }
    public WebElement getTrata() {
        WebElement elemento = driver.findElement(By.id("modalText"));
        String numeroConta = elemento.getText().replaceAll("\\D", "");
        String[] numerosConta = numeroConta.split("(?<=\\G.{3})");

        if (numerosConta.length == 2) {
            conta1 = numerosConta[0];
            digito1 = numerosConta[1];
            System.out.println(conta1);
            System.out.println(digito1);
        }
        return elemento;
    }
    public WebElement getTrata2() {
        WebElement elemento = driver.findElement(By.id("modalText"));
        String numeroConta = elemento.getText().replaceAll("\\D", "");
        String[] numerosConta = numeroConta.split("(?<=\\G.{3})");

        if (numerosConta.length == 2) {
            conta2 = numerosConta[0];
            digito2 = numerosConta[1];
            System.out.println(conta2);
            System.out.println(digito2);
        }
        return elemento;
    }
    public WebElement getFechaModal(){
        WebElement fechandoModal = driver.findElement(By.id("btnCloseModal"));
        return fechandoModal;}
    //LOGUIN E TRANSFERENCIA

    public WebElement getTransferencia(){
        WebElement transferencia = driver.findElement(By.id("btn-TRANSFERÊNCIA"));
        return transferencia;
    }
    public WebElement getPreencheConta(){
        WebElement preencherConta = driver.findElement(By.className("input__default"));
        return preencherConta;
    }
    public WebElement getPreencheDigit(){
        WebElement preencherdigito = driver.findElement(By.cssSelector(".account__data > .style__ContainerFieldInput-sc-s3e9ea-0:nth-child(2) > .input__default"));
        return preencherdigito;
    }
    public WebElement getValorTransferencia(){
        WebElement valorTransferencia = driver.findElement(By.cssSelector(".styles__ContainerFormTransfer-sc-1oow0wh-0 > .style__ContainerFieldInput-sc-s3e9ea-0:nth-child(2) > .input__default"));
        return valorTransferencia;}
    public WebElement getValorTransferido(){
        WebElement valorTransferencia = driver.findElement(By.cssSelector(".style__ContainerFieldInput-sc-s3e9ea-0:nth-child(3) > .input__default"));
        return valorTransferencia;}
    public WebElement getTransferirAgora(){
        WebElement tranferirAgora = driver.findElement(By.cssSelector(".style__ContainerButton-sc-1wsixal-0"));
        return tranferirAgora;}
    public WebElement getFechaModal2(){
        WebElement fechaModal2 = driver.findElement(By.cssSelector(".ffzYTz a"));
        return fechaModal2;}
    public WebElement getVoltaHome(){
        WebElement voltaHome = driver.findElement(By.id("btnBack"));
        return voltaHome;
    }
    public WebElement getSairConta(){
        WebElement fechaModal2 = driver.findElement(By.cssSelector(".cCGrzy"));
        return fechaModal2;
    }
    public String getDigito1() {
        return digito1;}
    public String getConta1() {
        return conta1;}

    public String getDigito2() {
        return digito2;}
    public String getConta2() {
        return conta2;}
}

