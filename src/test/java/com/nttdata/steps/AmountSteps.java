package com.nttdata.steps;

import com.nttdata.page.CarPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmountSteps {
    private WebDriver driver;

    //constructor
    public AmountSteps(WebDriver driver){
        this.driver = driver;
    }

    public String checkAmount(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement obAmountProduct = wait.until(
                ExpectedConditions.visibilityOfElementLocated(CarPage.checkoutSubtotal));
        return obAmountProduct.getText();
    }
}
