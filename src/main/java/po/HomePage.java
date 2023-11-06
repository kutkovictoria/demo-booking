package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webdriver.Singleton;

public class HomePage {

    private String singInButtonLocator = "//a[@data-testid='header-sign-in-button']";
    private String copyRightLocator = "//div[@class='copyright_text']";
    public void openHomePage() {
        Singleton.getDriver().get("https://www.booking.com/");
    }

    public void clickSingInButton(){
        WebElement singInButtonElement = Singleton.getDriver().findElement(By.xpath(singInButtonLocator));
        singInButtonElement.click();
    }

    public String getCopyRightText(){
        WebElement copyRightElement = Singleton.getDriver().findElement(By.xpath(copyRightLocator));
        String result = copyRightElement.getText();
        return result;
    }
}
