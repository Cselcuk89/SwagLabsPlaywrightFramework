package com.selcuk.swaglabs.portal.qa.commons;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.selcuk.swaglabs.portal.qa.exceptions.WebPageException;
import com.selcuk.swaglabs.portal.qa.locators.Locators;

public abstract class WebBasePage {
    protected Page basePage;
    protected Locators locators;

    public WebBasePage(Page basePage) {
        this.basePage = basePage;
        this.locators = new Locators(basePage);
    }
    protected void validateAction(boolean condition,String errorMessage){
        if (!condition){
            throw new WebPageException(errorMessage);
        }
    }
    protected void validatenonEmptyText(String text,String errorMessage){
        if (text.isEmpty()){
            throw new WebPageException(errorMessage);
        }
    }
    protected void clickElement(Locator locator,String errorMessage){
        if (!locator.isVisible() || !locator.isEnabled())
            throw new WebPageException(errorMessage);
        locator.click();
    }
    protected void fillText(Locator locator,String textContent){
        if (!locator.isVisible() || !locator.isEnabled())
            throw new WebPageException("Text area not visible or enabled!!");
        locator.clear();
        locator.fill(textContent);
    }

}
