package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

public class Utils extends RunCucumberTest {

    public void waitElement(By element, Integer tempo){
        WebDriverWait wait  = new WebDriverWait(driver,tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void maximize(){
        driver.manage().window().maximize();
    }

}
