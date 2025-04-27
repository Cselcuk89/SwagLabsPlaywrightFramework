package com.selcuk.swaglabs.portal.qa.screenshotMnaager;

import com.microsoft.playwright.Page;

public interface ScreenshotStrategy {
    void capture(Page page, String filePath);
}
