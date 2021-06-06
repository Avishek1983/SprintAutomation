package com.automation.selenium.selenium.page;

import com.automation.selenium.selenium.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchPage extends Base {

    @FindBy(name="q")
    private  WebElement searchEditFile ;

    @FindBy(name ="btnK")
    private List<WebElement> searchButtons;


    public void search(final String keyvalue ) throws InterruptedException {
        searchEditFile.sendKeys(keyvalue);
        Thread.sleep(2000);
        //searchEditFile.sendKeys(Keys.TAB);
        //Thread.sleep(1000);
        searchButtons.stream()
                .filter(webElement -> webElement.isDisplayed() && webElement.isEnabled())
                .findFirst()
                .ifPresent(WebElement::click);

    }


    @Override
    public boolean isLoaded() {
        return this.wait.until((dis) -> this.searchEditFile.isEnabled());
    }
}
