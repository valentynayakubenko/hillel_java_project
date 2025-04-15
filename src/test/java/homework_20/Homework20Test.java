package homework_20;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Homework20Test {

    private static WebDriver chromeBrowser;
    private static WebDriverWait explicitWait;



    @BeforeAll
    static void setUp() {
        chromeBrowser = new ChromeDriver();
        chromeBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        explicitWait = new WebDriverWait(chromeBrowser, Duration.ofSeconds(15));
    }

    @AfterAll
    static void quiteBrowser() {
        chromeBrowser.quit();
    }

    @Order(1)
    @Test
    @DisplayName("Open website")
    void openWebsiteTest() {
        chromeBrowser.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        Assertions.assertTrue(chromeBrowser.getCurrentUrl().contains("qauto.forstudy.space/"));
    }

    @Order(2)
    @Test
    @DisplayName("Waiting for the title")
    void waitingForTheTitleTest() {
        explicitWait.until(ExpectedConditions.titleIs("Hillel Qauto"));
        String title = chromeBrowser.getTitle();
        Assertions.assertEquals("Hillel Qauto", title);
    }

    @Order(3)
    @Test
    @DisplayName("Click on 'Guest log in' button")
    void clickOnGuestLogInButtonTest() {
        WebElement guestLoginButton = explicitWait.until(ExpectedConditions
                .elementToBeClickable(By.cssSelector("button.header-link.-guest")));
        ((JavascriptExecutor) chromeBrowser).executeScript("arguments[0].click();", guestLoginButton);
    }

    @Test
    @DisplayName("Waiting for the “Add car” button")
    void waitingForTheAddCarButtonTest() {
        WebElement addCarButton = explicitWait.until(ExpectedConditions
                .elementToBeClickable(By.cssSelector("button.btn.btn-primary")));
        Assertions.assertTrue(addCarButton.isDisplayed(), "Add car button is displayed");
        Assertions.assertTrue(addCarButton.isEnabled(), "Add car button is enabled");
    }

}
