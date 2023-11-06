package ui.testing;

import org.junit.jupiter.api.AfterEach;
import webdriver.Singleton;

public class BaseTest {
    @AfterEach
    public void quitBrowser(){
        Singleton.quitDriver();
    }
}
