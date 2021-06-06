package com.automation.selenium.selenium.page;

import com.automation.selenium.selenium.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GoogleSearch extends Base {

    @Autowired
    private SearchPage searchPage;

    @Autowired
    private SearchResult searchResult;

    @Value("${application.url}")
    private String url;

    public void navigateTo(){
        this.driver.get(this.url);
    }

    public SearchPage getSearchPage() {
        return searchPage;
    }

    public SearchResult getSearchResult() {

        return searchResult;
    }
    public void CloseApplication(){
        this.driver.quit();
    }

    @Override
    public boolean isLoaded() {

        return this.searchPage.isLoaded();
    }
}
