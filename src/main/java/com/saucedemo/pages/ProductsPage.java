package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{
    private By productsPageHeader = By.xpath("//span[text() = \"Products\"]");

    public boolean isProductsPageHeaderDisplayed(){
        return findElement(this.productsPageHeader).isDisplayed();
    }
}
