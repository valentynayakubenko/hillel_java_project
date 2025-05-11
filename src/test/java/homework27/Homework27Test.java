package homework27;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pageObject2.LoginPage;

import static com.codeborne.selenide.Condition.text;

public class Homework27Test {

    LoginPage loginPage = new LoginPage();

    @BeforeAll
    static void setUpAndClickGuestLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.open();
    }

    @AfterEach
    void closeModal(){
        loginPage.clickCloseButton();
    }

    @ParameterizedTest(name = "Login test with email: {0} and password: {1}")
    @CsvSource({
            "test@hillel.ua, 1111",
            "test@hillel.ua, 1234"
    })
    void loginNegativeTest(String email, String password) {
        loginPage.clickSignInButton();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        loginPage.getErrorTextElement().shouldHave(text("Wrong email or password"));
    }

}