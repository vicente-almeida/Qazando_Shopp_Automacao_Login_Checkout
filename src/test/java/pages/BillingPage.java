package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import support.Utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BillingPage extends Utils {
    WebDriver driver;
    Faker faker  = new Faker();

    private By screenCheckout = By.xpath("/html/body/div[1]/header/div/div/div/div/div/div[2]/nav/ul/li[2]/a");
    private By checkoutViewOne = By.linkText("Checkout View One");
    private By firstName = By.id("fname");
    private By lastName = By.id("lname");
    private By companyName = By.id("cname");
    private By email = By.id("email");
    private By country = By.id("country");
    private By city = By.id("city");
    private By zip = By.id("zip");
    private By fadress = By.id("faddress");
    private By messages = By.id("messages");
    private By messageSuccess = By.xpath("/html/body/div[1]/section[2]/div/div/div[1]/div/div[2]/h3");

    public BillingPage(WebDriver driver) {this.driver = driver;}

    public void screenCheckout(){
        assertEquals("http://automationpratice.com.br/my-account",driver.getCurrentUrl());
        assertTrue(driver.getTitle().contains("QAZANDO Shop E-Commerce"),"A frase do título da página está errada");
        waitElement(screenCheckout,5);
        driver.findElement(screenCheckout).click();


    }
    public void checkoutViewOne(){
        waitElement(checkoutViewOne,5);
        driver.findElement(checkoutViewOne).click();
    }
    public void inputs(){
        waitElement(firstName,5);
        driver.findElement(firstName).sendKeys(faker.name().firstName());
        driver.findElement(lastName).sendKeys(faker.name().lastName());
        driver.findElement(companyName).sendKeys(faker.name().name());
        driver.findElement(email).sendKeys(faker.internet().emailAddress());
        driver.findElement(country).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        driver.findElement(city).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        driver.findElement(zip).sendKeys(faker.address().zipCode());
        driver.findElement(fadress).sendKeys(faker.address().fullAddress());
        driver.findElement(messages).sendKeys(faker.internet().toString());
    }
    public void btnSave(){

        driver.findElement(messages).sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
    }
    public void messageSuccess(){
        assertEquals(driver.findElement(messageSuccess).getText(),"Billings Information registred with success!");

    }
}
