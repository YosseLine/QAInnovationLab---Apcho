package com.nttdata.page;

import org.openqa.selenium.By;

public class CarPage {
    //Localizadores de elementos
    public static By firstProduct = By.xpath("(//div[@class='products row']/div)[1]");
    public static By inputCant = By.xpath("//input[@id='quantity_wanted']");
    public static By buttonAddCart = By.xpath("//button[@data-button-action='add-to-cart']");
    public static By checkoutName = By.xpath("//h6[@class='h6 product-name']");
    public static By checkoutSubtotal = By.xpath("//span[@class='subtotal value']");
    public static By buttonFinishPurchase = By.xpath("//div[@class='cart-content-btn']/a[@href='//qalab.bensg.com/store/pe/carrito?action=show']");
    public static By titleCartPage = By.xpath("//h1[@class='h1']");
    public static By totalAmount = By.xpath("//div[@class='cart-summary-line cart-total']/span[@class='value']");

}
