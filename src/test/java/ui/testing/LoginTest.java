package ui.testing;

import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import po.HomePage;
import po.LoginPage;

public class LoginTest extends BaseTest{
    private static final Logger logger = LogManager.getLogger();
    @Test
    public void testLoginPage(){
        HomePage homePage = new HomePage();
        homePage.openHomePage();
        homePage.clickSingInButton();
        logger.info("Open HomePage");

        LoginPage loginPage = new LoginPage();
        Faker faker = new Faker();
        loginPage.enterEmail("test@st.com");
        loginPage.clickContinueButton();

        loginPage.enterPassword(faker.internet().password());
        loginPage.clickContinueButton();
    }
}
