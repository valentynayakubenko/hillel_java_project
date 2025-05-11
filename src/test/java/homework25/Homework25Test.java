package homework25;

import io.qameta.allure.*;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.BrowserFactory;
import pageObjects.GaragePage;
import pageObjects.LoginPage;

import java.time.Duration;

@Epic("Garage Functionality")
@Feature("Add Car")
public class Homework25Test {

    private static WebDriver chromeBrowser;
    private static SoftAssertions softAssert;

    @BeforeAll
    static void setUp() {
        chromeBrowser = BrowserFactory.getDriver("chrome");
        softAssert = new SoftAssertions();
        chromeBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterAll
    static void tearDown() {
        if (chromeBrowser != null) {
            chromeBrowser.quit();
        }
    }

    @Test
    @DisplayName("Open Garage page and Add car")
    @Description("Test to verify that a guest user can add a car to the garage and all expected UI elements and values are displayed correctly.")
    @Owner("QA Engineer")
    @Link(name = "Task Link", url = "https://testtraker.com/task/123")
    @Severity(SeverityLevel.CRITICAL)
    public void openGaragePageAndAddCarTest() {
        LoginPage loginPage = new LoginPage(chromeBrowser);
        loginPage.open();
        loginPage.clickGuestLogin();
        softAssert.assertThat(loginPage.isGaragePage())
                .as("Failed to navigate to Garage page").isTrue();

        GaragePage garagePage = new GaragePage(chromeBrowser);
        garagePage.clickAddCar();
        garagePage.selectBrand("Audi");
        garagePage.selectModel("TT");
        garagePage.enterMileage("20");
        garagePage.clickAdd();

        softAssert.assertThat(garagePage.getCarName()).isEqualTo("Audi TT");
        softAssert.assertThat(garagePage.isCurrentDateDisplayed()).isTrue();
        softAssert.assertThat(garagePage.getMilesValue()).isEqualTo("20", "Mileage value is incorrect");
        softAssert.assertThat(garagePage.isCarLogoDisplayed()).isTrue();
        softAssert.assertThat(garagePage.getCarLogoSource()).endsWith("audi.png");
        softAssert.assertAll();

    }
}
