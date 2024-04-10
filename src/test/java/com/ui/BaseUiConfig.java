package com.ui;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.configuration.ConfigurationReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseUiConfig {

    @BeforeMethod
    public void setupBrowser() {
        Configuration.pageLoadTimeout = Duration.ofMinutes(3).toMillis();
        Configuration.baseUrl = ConfigurationReader.getConfiguration().getUiBaseUrl();
    }

    @AfterMethod
    public void closeBrowser() {
        if (WebDriverRunner.hasWebDriverStarted()) {
            WebDriverRunner.closeWebDriver();
        }
    }
}
