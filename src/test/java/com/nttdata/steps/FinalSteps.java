package com.nttdata.steps;

import com.nttdata.page.CarPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FinalSteps {

    private WebDriver driver;

    //constructor
    public FinalSteps(WebDriver driver){
        this.driver = driver;
    }

    public String FinalPrice(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement finalPrice = wait.until(
                ExpectedConditions.visibilityOfElementLocated(CarPage.totalAmount));
        return finalPrice.getText();
    }
}
