package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        WebElement passwordInputElement = new WebDriverWait(Singleton.getDriver(), Duration.ofSeconds(4)).
                until(ExpectedConditions.presenceOfElementLocated(By.xpath(PASSWORD_LOCATOR)));
        passwordInputElement.sendKeys(password);
    }
}
