package com.nttdata.steps;

import com.nttdata.page.CarPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CarSteps {

    private static WebDriver driver;

    //constructor
    public CarSteps(WebDriver driver){
        this.driver = driver;
    }

    public static void addFirstProduct(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement obFirstProduct = wait.until(
                ExpectedConditions.elementToBeClickable(CarPage.firstProduct));
        obFirstProduct.click();
    }

    public static void addQuantity(int cant){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement obButtonQuantity = wait.until(
                ExpectedConditions.elementToBeClickable(CarPage.inputCant));
        obButtonQuantity.click();
        obButtonQuantity.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
        obButtonQuantity.sendKeys(String.valueOf(cant));
    }

    public static void addKart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement obButtonKart = wait.until(
                ExpectedConditions.elementToBeClickable(CarPage.buttonAddCart));
        obButtonKart.click();
    }

    public static void addingProducts(int cant) {
        addFirstProduct();
        addQuantity(cant);
        addKart();
    }
}
