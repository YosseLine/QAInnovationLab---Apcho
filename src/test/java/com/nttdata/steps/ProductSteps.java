package com.nttdata.steps;

import com.nttdata.page.CarPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductSteps {
    private WebDriver driver;

    //constructor
    public ProductSteps(WebDriver driver){
        this.driver = driver;
    }

    public String nameProduct(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement obNameProduct = wait.until(
                ExpectedConditions.visibilityOfElementLocated(CarPage.checkoutName));
        return obNameProduct.getText();
    }
}
