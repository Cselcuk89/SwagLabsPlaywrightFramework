package com.selcuk.swaglabs.portal.qa.locators;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public interface ILocator<T> {
    T getPageLocator(String webLocator);
    T getByText(String webLocatorText);
    T getByLabel(String labelText);

    T getByRole(AriaRole role, Page.GetByRoleOptions options);

    T getByPlaceholder(String placeholderText);

}
