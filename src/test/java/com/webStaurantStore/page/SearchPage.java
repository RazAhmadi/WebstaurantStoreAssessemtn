package com.webStaurantStore.page;

import com.webStaurantStore.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {
    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="searchval")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@data-testid='itemDescription']")
    public List<WebElement> searchResult;

    @FindBy(xpath = "(//*[@class='add-to-cart'])[last()]")
    public WebElement addToCardButtonForLastItem;

    @FindBy (xpath = "//*[@aria-label='pagination']/ul/li")
    public List<WebElement> pages;

    @FindBy (xpath = "//button[@class='emptyCartButton btn btn-mini btn-ui pull-right']")
    public WebElement emptyCart;

    @FindBy (xpath = "//button[@type='submit'and text()='Add To Cart']")
    public WebElement addToCart;

    @FindBy (linkText = "View Cart")
    public WebElement viewCart;

}
