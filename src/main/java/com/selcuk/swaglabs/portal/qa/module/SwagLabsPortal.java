package com.selcuk.swaglabs.portal.qa.module;

import com.microsoft.playwright.Page;
import com.selcuk.swaglabs.portal.qa.pages.*;

public class SwagLabsPortal {
    private final Page PAGE;
    public final SwagLabsLoginPage SWAGLABS_LOGIN_PAGE;
    public final SwagLabsHomePage SWAGLABS_HOME_PAGE;
    public final SwagLabsProductPage SWAGLABS_PRODUCT_PAGE;
    public final SwagLabsCartPage SWAGLABS_CART_PAGE;
    public final SwagLabsCheckoutPage SWAGLABS_CHECKOUT_PAGE;
    public final SwagLabsCheckoutOverviewPage SWAGLABS_CHECKOUT_OVERVIEW_PAGE;
    public final SwagLabsCheckoutCompletePage SWAGLABS_CHECKOUT_COMPLETE_PAGE;
    public SwagLabsPortal(Page page){
        this.PAGE = page;
        SWAGLABS_LOGIN_PAGE = new SwagLabsLoginPage(page);
        SWAGLABS_HOME_PAGE = new SwagLabsHomePage(page);
        SWAGLABS_PRODUCT_PAGE = new SwagLabsProductPage(page);
        SWAGLABS_CART_PAGE = new SwagLabsCartPage(page);
        SWAGLABS_CHECKOUT_PAGE = new SwagLabsCheckoutPage(page);
        SWAGLABS_CHECKOUT_OVERVIEW_PAGE = new SwagLabsCheckoutOverviewPage(page);
        SWAGLABS_CHECKOUT_COMPLETE_PAGE = new SwagLabsCheckoutCompletePage(page);






    }

}
