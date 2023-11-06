package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.Singleton;

import static po.HomePageLocators.COPY_RIGHT_LOCATOR;
import static po.HomePageLocators.SING_IN_BUTTON_LOCATOR;

public class HomePage {

    public void openHomePage() {
        Singleton.getDriver().get("https://www.booking.com/");
    }

    public void clickSingInButton(){
        WebElement singInButtonElement = Singleton.getDriver().findElement(By.xpath(SING_IN_BUTTON_LOCATOR));
        singInButtonElement.click();
    }

    public String getCopyRightText(){
        WebElement copyRightElement = Singleton.getDriver().findElement(By.xpath(COPY_RIGHT_LOCATOR));
        String result = copyRightElement.getText();
        return result;
    }
}
