package po;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import webdriver.Singleton;

import java.time.Duration;

import static po.LoginPageLocators.*;

public class LoginPage {
    public void enterEmail(String email) {
        WebElement emailInputElement = Singleton.getDriver().findElement(By.xpath(EMAIL_LOCATOR));
        emailInputElement.sendKeys(email);
    }

    public void clickContinueButton() {
        WebElement continueWebElement = Singleton.getDriver().findElement(By.xpath(CONTINUE_LOCATOR));
        continueWebElement.click();
    }

    public void enterPassword(String password) {
      Singleton.sendKeysElement(PASSWORD_LOCATOR,password);
    }
}
