package homework26;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObject2.GaragePage;
import pageObject2.LoginPage;

public class Homework26Test {

    @BeforeAll
    static void setUpAndClickGuestLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.clickGuestLogin();
    }

    @Test
    @DisplayName("Add car")
    public void testAddCarAsGuest() {
        GaragePage garagePage = new GaragePage();
        garagePage.clickAddCar();
        garagePage.selectBrand("Audi");
        garagePage.selectModel("TT");
        garagePage.enterMileage("20");
        garagePage.clickAdd();

        garagePage.getCarName().equals("Audi TT");
        garagePage.isCurrentDateDisplayed();
        garagePage.getMilesValue().equals("20");
        garagePage.isCarLogoDisplayed();
        assert garagePage.getCarLogoSource().endsWith("audi.png");
    }
}
