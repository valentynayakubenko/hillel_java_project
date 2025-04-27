package homework23;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import pageObjects.BrowserFactory;
import pageObjects.GaragePage;
import pageObjects.LoginPage;

import java.time.Duration;

public class Homework23ChromeTest {

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
    void openGaragePageAndAddCarTest() {
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
