package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class OrderPage {
    WebDriver driver;

    private By tableOrder = By.xpath("//*[@id=\"checkout_one\"]/div/div/div[2]/div[1]/div[1]/h3");
    private By btnPlaceOrder = By.id("css");
    private By modalh2 = By.tagName("h2");
    private By modalh3 = By.tagName("h3");
    private By modalimg = By.className("offer_modal_img");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setScreenCheckout() {
        assertEquals("http://automationpratice.com.br/checkout-one",driver.getCurrentUrl());
    }

    public void setTableOrder() {
        assertEquals(driver.findElement(tableOrder).getText(),"Your Orders");

    }

    public void setBtnPlaceOrder() {
        driver.findElement(btnPlaceOrder).sendKeys(Keys.TAB,Keys.ENTER);
    }
    public void modal(){
        driver.findElement(modalh2).isDisplayed();
        driver.findElement(modalh3).isDisplayed();
        driver.findElement(modalimg).isDisplayed();

    }
}
