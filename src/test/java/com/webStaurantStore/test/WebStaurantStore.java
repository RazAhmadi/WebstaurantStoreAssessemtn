package com.webStaurantStore.test;

import com.webStaurantStore.page.SearchPage;
import com.webStaurantStore.utilities.ConfigurationReader;
import com.webStaurantStore.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;

public class WebStaurantStore {

    SearchPage searchPage = new SearchPage();

    List< WebElement> searchResult;
    @Test (priority = 1)
    public void userGoToUrl(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Test(priority = 2)
    public void userSearchForStainlessWorkTable(){

        searchPage.searchBox.sendKeys("stainless work table" + Keys.ENTER);

    }
    @Test (priority = 3)
    public void userVerifySearchResultTitleContainsTable(){

       searchResult = searchPage.searchResult;

        for (WebElement title : searchResult) {
            Assert.assertTrue(title.getText().contains("Table"));
        }
    }

    @Test (priority = 4)
    public void userAddLastItemToCart(){
        searchPage.pages.get(searchPage.pages.size()-2).click();
        searchPage.addToCardButtonForLastItem.click();
        searchPage.addToCart.click();
    }
    @Test (priority = 5)
    public void userEmptyCart(){
        searchPage.viewCart.click();
        searchPage.emptyCart.click();

        Driver.closeDriver();
    }

}
