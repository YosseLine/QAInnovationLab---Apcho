package com.nttdata.stepsdefinitions;

import com.nttdata.core.DriverManager;
import com.nttdata.steps.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.*;

public class StoreStepsDef {

    private WebDriver driver;
    
    
    @Dado("estoy en la página de la tienda")
    public void estoyEnLaPaginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store");
        screenShot();
        DriverManager.screenShot();
    }

    @Y("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String user, String password) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.ingresoUsuarioYClave(user,password);
        DriverManager.screenShot();
    }

    @Cuando("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String category, String subCategory) {
        CategorySteps CategorySteps = new CategorySteps(driver);
        CategorySteps.categoryTypes(category,subCategory);
        screenShot();
    }

    @Y("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(int cant) {
        CarSteps CartSteps = new CarSteps(driver);
        CarSteps.addingProducts(cant);
        DriverManager.screenShot();
    }

    @Entonces("valido en el popup la confirmación del producto agregado")
    public void validoEnElPopupLaConfirmacionDelProductoAgregado() {
        ProductSteps ProductSteps = new ProductSteps(driver);
        String productName = ProductSteps.nameProduct();
        String expected = "Hummingbird printed t-shirt";
        if (productName.equals(expected)) {
            System.out.println("Correcto. Texto extraído: " + productName);
        } else {
            System.out.println("Incorrecto. Texto extraído: " + productName);
        }

        Assertions.assertEquals(expected, productName);
        DriverManager.screenShot();
    }

    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        AmountSteps AmountSteps = new AmountSteps(driver);
        String productAmount = AmountSteps.checkAmount();
        String expected = "S/ 38.24";
        if (productAmount.equals(expected)) {
            System.out.println("Correcto. Texto extraído: " + productAmount);
        } else {
            System.out.println("Incorrecto. Texto extraído: " + productAmount);
        }

        Assertions.assertEquals(expected, productAmount);
        DriverManager.screenShot();
    }

    @Cuando("finalizo la compra")
    public void finalizoLaCompra() {
        PurchaseSteps PurchaseSteps = new PurchaseSteps(driver);
        PurchaseSteps.buttonPurchase();
        DriverManager.screenShot();
    }

    @Entonces("valido el titulo de la pagina del carrito")
    public void validoElTituloDeLaPaginaDelCarrito() {
        TitleSteps TitleSteps = new TitleSteps(driver);
        String titleName = TitleSteps.checkName();
        String expected = "CARRITO";
        if (titleName.equals(expected)) {
            System.out.println("Correcto. Texto extraído: " + titleName);
        } else {
            System.out.println("Incorrecto. Texto extraído: " + titleName);
        }

        Assertions.assertEquals(expected, titleName);
        DriverManager.screenShot();
    }

    @Y("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {

        FinalSteps FinalPrice = new FinalSteps(driver);
        String finalPrice = FinalPrice.FinalPrice();
        String expected = "S/ 38.24";
        if (finalPrice.equals(expected)) {
            System.out.println("Correcto. Texto extraído: " + FinalPrice);
        } else {
            System.out.println("Incorrecto. Texto extraído: " + FinalPrice);
        }

        Assertions.assertEquals(expected, finalPrice);
        DriverManager.screenShot();
    }
}
