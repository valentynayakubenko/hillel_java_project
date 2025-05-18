package homework28;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pageObject2.LoginPage;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class Homework28Test {

    @AfterEach
    void tearDown() {
        closeWebDriver();
    }

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "firefox"})
    void remoteNegativeLoginTest(String browser) {
        var driver = CreateRemoveDriver.createDriver(browser);
        WebDriverRunner.setWebDriver(driver);

        open("https://guest:welcome2qauto@qauto.forstudy.space/");

        LoginPage loginPage = new LoginPage();
        loginPage.clickSignInButton();
        loginPage.enterEmail("test@hillel.ua");
        loginPage.enterPassword("1111");
        loginPage.clickLoginButton();

        String errorText = loginPage.getErrorText();
        assertThat(errorText).contains("Wrong email or password");
    }

}
