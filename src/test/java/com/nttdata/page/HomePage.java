package com.nttdata.page;

import org.openqa.selenium.By;

import static java.lang.String.format;

public class HomePage {

    public static By categoria(String strCategory){
        return By.xpath(format("//a[@href='https://qalab.bensg.com/store/pe/3-clothes']", strCategory));
    }
    public static By subCategoria(String strSubCategory){
        return By.xpath(format("//ul[@class='category-sub-menu']//a[@href='https://qalab.bensg.com/store/pe/4-men']", strSubCategory));
    }
    public static By checkLogging = By.xpath("//a[@class='logout hidden-sm-down']");
}
