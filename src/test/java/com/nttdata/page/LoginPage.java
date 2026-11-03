package com.nttdata.page;

import com.nttdata.core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    //Localizadores de elementos
    public static By userInput = By.xpath("//input[@id='field-email']");
    public static By passInput = By.xpath("//input[@id='field-password']");
    public static By loginButton = By.xpath("//span[contains(text(), 'Iniciar sesión')]");
    public static By logButton = By.xpath("//button[@id='submit-login']");
}
