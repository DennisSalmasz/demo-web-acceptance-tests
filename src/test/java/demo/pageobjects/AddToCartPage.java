package demo.pageobjects;

import org.openqa.selenium.By;

public class AddToCartPage {

    public static final By ADD_TO_CART_BUTTON =
            By.xpath("//*[@id=\"main\"]/section/div/section/div/div/div[4]/div[2]/div[2]/a");
    public static final By PRODUCT_ON_CART =
            By.cssSelector(".drawer-items__item-name");
}
