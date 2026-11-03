package com.nttdata.steps;

import com.nttdata.page.CarPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TitleSteps {

    private WebDriver driver;

    //constructor
    public TitleSteps(WebDriver driver){
        this.driver = driver;
    }

    public String checkName(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement titlePage = wait.until(
                ExpectedConditions.visibilityOfElementLocated(CarPage.titleCartPage));
        return titlePage.getText();
    }
}
