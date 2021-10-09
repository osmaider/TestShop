package com.testing.validationPage;

import com.testing.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ShoppingCartSummary extends BasePage {

    @FindBy(xpath = "//td[@class='cart_description']//p[@class='product-name']//a")
    private WebElement productInShoppingCart;

    public ShoppingCartSummary(WebDriver driver) {
        super(driver);
    }

    public String validateShoppingCart() {
        return exists(productInShoppingCart);
    }

}