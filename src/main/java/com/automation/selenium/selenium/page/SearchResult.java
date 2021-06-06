package com.automation.selenium.selenium.page;

import com.automation.selenium.selenium.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchResult extends Base {

    @FindBy(css="div.g")
    List<WebElement> results ;

    public int getResults (){
        System.out.println(this.results.size());
        return this.results.size();

    }

    @Override
    public boolean isLoaded() {
        return false;
    }
}
