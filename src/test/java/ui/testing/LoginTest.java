package ui.testing;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import po.HomePage;
import po.LoginPage;

public class LoginTest extends BaseTest{
    @Test
    public void testLoginPage(){
        HomePage homePage = new HomePage();
        homePage.openHomePage();
        homePage.clickSingInButton();

        LoginPage loginPage = new LoginPage();
        Faker faker = new Faker();
        loginPage.enterEmail("test@st.com");
        loginPage.clickContinueButton();

        loginPage.enterPassword(faker.internet().password());
        loginPage.clickContinueButton();
    }
}
