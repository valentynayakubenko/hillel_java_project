package homework19;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework19Test {

    static WebDriver chromeBrowser = new ChromeDriver();

    @BeforeAll
    static void openWebsite() {
        chromeBrowser.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @AfterAll
    static void quiteBrowser() {
        chromeBrowser.quit();
    }

    @Test
    @DisplayName("Check display logo")
    void checkLogoTest() {
        WebElement logo = chromeBrowser.findElement(By.cssSelector("a.header_logo"));
        if (logo.isDisplayed()) {
            System.out.println("Logo displayed");
        } else {
            System.out.println("Logo does not displayed");
        }
    }

    @Test
    @DisplayName("Check background color of 'Sign up' button")
    void checkSignUpButtonColorTest() {
        WebElement signUpButton = chromeBrowser.findElement(By.cssSelector("button.hero-descriptor_btn"));
        String backgroundColor = signUpButton.getCssValue("background-color");

        // #0275d8 = rgba(2, 117, 216, 1)
        String expectedColor = "rgba(2, 117, 216, 1)";

        if (backgroundColor.equals(expectedColor)) {
            System.out.println("Background color of Sign up button is correct");
        } else {
            System.out.println("Background color of Sign up button is incorrect");
        }
    }

}
