package com.selcuk.swaglabs.portal.qa.screenshotMnaager;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class FullPageScreenshotStrategy implements ScreenshotStrategy{
    @Override
    public void capture(Page page, String filePath) {
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get(filePath)).setFullPage(true));
    }
}
