package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    @FindBy(css = "button.header-link.-guest")
    private WebElement guestLoginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    public void openForFirefox() {
        driver.get("https://qauto.forstudy.space");
    }

    public void clickGuestLogin() {
        guestLoginButton.click();
    }

    public boolean isGaragePage() {
        return driver.getCurrentUrl().equals("https://guest:welcome2qauto@qauto.forstudy.space/panel/garage");
    }
}