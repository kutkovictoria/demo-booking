package ui.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import po.HomePage;

public class LoginTest extends BaseTest{

    @Test
    public void openHomePage(){
        HomePage homePage = new HomePage();
        homePage.openHomePage();
        String actualResult = homePage.getCopyRightText();
        String expectedResult = "Copyright © 1996–2023 Booking.com™. All rights reserved.";
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
