package homework22;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.SocialNetworksPage;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Homework22Test {

    private static WebDriver chromeBrowser;
    private SocialNetworksPage socialNetworksPage;


    @BeforeAll
    static void setUp() {
        chromeBrowser = new ChromeDriver();
        chromeBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeEach
    void openWebsite() {
        chromeBrowser.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        socialNetworksPage = new SocialNetworksPage(chromeBrowser);
    }

    @AfterAll
    static void tearDown() {
        if (chromeBrowser != null) {
            chromeBrowser.quit();
        }
    }

    @Order(1)
    @Test
    @DisplayName("Frame title")
    public void frameTitleTest() {
        WebElement iframe = chromeBrowser.findElement(By.cssSelector("iframe[src*='youtube.com']"));
        chromeBrowser.switchTo().frame(iframe);

        WebElement videoTitle = chromeBrowser.findElement(By.cssSelector(".ytp-title-link"));

        String actualTitle = videoTitle.getText();
        String expectedTitle = "Як потрапити у майбутнє? Трансформація навчання.";
        assertEquals(expectedTitle, actualTitle, "Title doesn't equals to the expected result");

        chromeBrowser.switchTo().defaultContent();
    }

    @Order(2)
    @Test
    @DisplayName("Social networks block")
    public void socialNetworksBlockTest() {
        int expectedCount = 5;
        int actualCount = socialNetworksPage.getSocialIconsCount();
        assertEquals(expectedCount, actualCount, "Social network block doesn't contain 5 items");
    }

    @ParameterizedTest
    @MethodSource("socialNetworkDataProvider")
    @DisplayName("Check social networks URLs")
    public void socialNetworksBlockURLsTest(int index, String expectedUrl) {
        List<WebElement> socialIcons = socialNetworksPage.getSocialIcons();
        String mainWindow = chromeBrowser.getWindowHandle();

        WebElement icon = socialIcons.get(index);
        icon.click();

        var allWindows = chromeBrowser.getWindowHandles();
        assertEquals(2, allWindows.size(), "New tab did not open after clicking");

        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                chromeBrowser.switchTo().window(window);
                break;
            }
        }

        String currentUrl = chromeBrowser.getCurrentUrl();
        assertTrue(currentUrl.startsWith(expectedUrl), "Incorrect URL of Social network");

        chromeBrowser.close();
        chromeBrowser.switchTo().window(mainWindow);
    }


    private static Stream<Arguments> socialNetworkDataProvider() {
        return Stream.of(
                Arguments.arguments(0, "https://www.facebook.com/Hillel.IT.School"),
                Arguments.arguments(1, "https://t.me/ithillel_kyiv"),
                Arguments.arguments(2, "https://www.youtube.com/user/HillelITSchool"),
                Arguments.arguments(3, "https://www.instagram.com/hillel_itschool/"),
                Arguments.arguments(4, "https://www.linkedin.com/school/ithillel/")
        );
    }
}
