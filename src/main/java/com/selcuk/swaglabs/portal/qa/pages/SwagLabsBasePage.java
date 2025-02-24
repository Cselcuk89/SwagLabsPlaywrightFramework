package com.selcuk.swaglabs.portal.qa.pages;

import com.microsoft.playwright.Page;
import com.selcuk.swaglabs.portal.qa.commons.WebBasePage;
import com.selcuk.swaglabs.portal.qa.pages.SwagLabsCheckoutPage;


public sealed class SwagLabsBasePage extends WebBasePage permits SwagLabsCartPage,
        SwagLabsCheckoutCompletePage, SwagLabsCheckoutOverviewPage, SwagLabsCheckoutPage,
        SwagLabsHomePage, SwagLabsLoginPage, SwagLabsProductPage {

    public SwagLabsBasePage(Page basePage) {
        super(basePage);
    }
}
