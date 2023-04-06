package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginPage extends Utils {

    WebDriver driver;
    private By linkLogin = By.className("fa-user");
    private By inputLogin = By.id("user");
    private By inputPassword = By.id("password");
    private By btnLogin = By.id("btnLogin");
    public By loginSuccessbtn = By.xpath("/html/body/div[3]/div/div[6]/button[1]");
    private By loginSuccess = By.id("swal2-title");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void accessApplication() {
        driver.get("http://automationpratice.com.br/");
        maximize();

    }

    public void linkLogin() {

        driver.findElement(linkLogin).click();
    }

    public void inputLogin() {
        waitElement(By.id("user"), 5);
        driver.findElement(inputLogin).sendKeys("viscondesa@gmail.com");
    }

    public void inputPassword() {
        driver.findElement(inputPassword).sendKeys("teste123");
    }

    public void btnLogin() {
        waitElement(By.id("btnLogin"), 5);
        driver.findElement(btnLogin).click();
    }

    public void loginSuccess() {
        assertEquals(driver.findElement(loginSuccess).getText(),"Login realizado");
    }

    public void loginSuccessbtn() {
        driver.findElement(loginSuccessbtn).click();
    }
}
