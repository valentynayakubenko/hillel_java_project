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

}

