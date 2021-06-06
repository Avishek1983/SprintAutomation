package com.automation.selenium.gooleTest;

import com.automation.selenium.SeleniumSpringTestng;
import com.automation.selenium.selenium.page.GoogleSearch;
import com.automation.selenium.selenium.util.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class GoogleTest extends SeleniumSpringTestng {

    @Autowired
    private GoogleSearch googleSearch;

    @Autowired @Lazy
    private ScreenShot screenShot;

    @Test
    public void GoogleTestCases() throws InterruptedException {
        this.googleSearch.navigateTo();
        Assert.assertTrue(this.googleSearch.isLoaded(), "check the Page ");
        this.googleSearch.getSearchPage().search("Test");
        Assert.assertTrue(this.googleSearch.getSearchResult().getResults() > 2, "check the result");
        screenShot.getScreenshot("Test.png");

    }

    @AfterTest
    public void CloseApplication() {
        this.googleSearch.CloseApplication();
    }
}
