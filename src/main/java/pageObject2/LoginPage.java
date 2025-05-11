package pageObject2;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {


    private SelenideElement guestLoginButton() {
        return $("button.header-link.-guest");
    }

    @Step("Click Guest Login button")
    public void clickGuestLogin() {
        guestLoginButton().shouldBe(visible).click();
    }

    @Step("Open Login page")
    public void open() {
        Selenide.open("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    private SelenideElement signInButton() {
        return $("button.header_signin");
    }

    @Step("Click 'Sign in' button")
    public void clickSignInButton() {
        signInButton().click();
    }

    private SelenideElement emailField() {
        return $("#signinEmail");
    }

    @Step("Enter email: {email}")
    public void enterEmail(String email) {
        emailField().setValue(email);
    }

    private SelenideElement passwordField() {
        return $("#signinPassword");
    }

    @Step("Enter password: {password}")
    public void enterPassword(String password) {
        passwordField().setValue(password);
    }

    private SelenideElement loginButton() {
        return $x("//button[@type='button' and contains(text(), 'Login')]");
    }

    @Step("Click Login button")
    public void clickLoginButton() {
        loginButton().shouldBe(visible).click();
    }

    private SelenideElement errorText() {
        return $("p.alert.alert-danger");
    }

    @Step("Get error text")
    public String getErrorText() {
        return errorText().getText();
    }

    public SelenideElement getErrorTextElement() {
        return errorText();
    }

    private SelenideElement closeModalButton() {
        return $("button.close");
    }

    @Step("Click Close button")
    public void clickCloseButton() {
        closeModalButton().shouldBe(visible).click();
    }


}

