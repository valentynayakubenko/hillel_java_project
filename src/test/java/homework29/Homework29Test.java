package homework29;

import com.codeborne.selenide.WebDriverRunner;
import homework28.CreateRemoveDriver;
import io.qameta.allure.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageObject2.GaragePage;
import pageObject2.LoginPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Homework29Test {

    @BeforeAll
    static void setUpAndClickGuestLogin() {
        var driver = CreateRemoveDriver.createDriver("chrome");
        WebDriverRunner.setWebDriver(driver);

        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.clickGuestLogin();
    }

    @AfterEach
    void tearDown() {
        closeWebDriver();
    }

    @Test
    @DisplayName("Add car")
    @Description("Test to add a car as a guest")
    @Owner("QA Engineer")
    @Link(name = "Task Link", url = "https://testtraker.com/task/123")
    @Severity(SeverityLevel.CRITICAL)
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
