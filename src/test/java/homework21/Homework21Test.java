package homework21;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class Homework21Test {

    private static WebDriver chromeBrowser;

    @BeforeAll
    static void setUp() {
        chromeBrowser = new ChromeDriver();
        chromeBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeEach
    void openWebsite() {
        chromeBrowser.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @AfterAll
    static void tearDown() {
        if (chromeBrowser != null) {
            chromeBrowser.quit();
        }
    }

    @Test
    @DisplayName("Check display logo")
    public void logoDisplayedTest() {
        try {
            WebElement logo = chromeBrowser.findElement(By.cssSelector("a.header_logo"));
            assertTrue(logo.isDisplayed(), "Logo does not displayed");
        } catch (Exception e) {
            System.out.println("Logo does not displayed");
            fail("Logo does not displayed");
        }
    }

    @Test
    @DisplayName("Check background color of 'Sign up' button")
    public void signUpButtonBackgroundColorTest() {
       try {
        WebElement signUpButton = chromeBrowser.findElement(By.cssSelector("button.hero-descriptor_btn"));
        String backgroundColor = signUpButton.getCssValue("background-color");
        String expectedColor = "rgba(2, 117, 216, 1)";

           assertEquals(expectedColor, backgroundColor, "Background color of Sign up button is incorrect");
       } catch (Exception e) {
           System.out.println("Background color of Sign up button is incorrect");
           fail("Background color of Sign up button is incorrect");
       }
    }

}
