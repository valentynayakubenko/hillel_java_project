package homework24;

import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.GaragePage;
import pageObjects.InstructionsPage;
import pageObjects.LoginPage;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Homework24Test {
    private static WebDriver chromeBrowser;
    private static LoginPage loginPage;
    private static GaragePage garagePage;
    private static InstructionsPage instructionsPage;

    protected static File DOWNLOAD_FILE = new File(
            "/Users/valentynayakubenko/IdeaProjects/hillel_java_project/src/main/resources/downloads");

    @BeforeAll
    static void setUpAndClickOnGuestButton() {
        if (!DOWNLOAD_FILE.exists()) {
            DOWNLOAD_FILE.mkdirs();
        }
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", DOWNLOAD_FILE.getAbsolutePath());
        prefs.put("download.prompt_for_download", false);
        options.setExperimentalOption("prefs", prefs);

        chromeBrowser = new ChromeDriver(options);
        chromeBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        chromeBrowser.manage().window().maximize();

        loginPage = new LoginPage(chromeBrowser);
        garagePage = new GaragePage(chromeBrowser);
        instructionsPage = new InstructionsPage(chromeBrowser);

        loginPage.open();
        loginPage.clickGuestLogin();
        garagePage.clickInstructions();
    }

    @AfterAll
     static void tearDown() {
        Arrays.stream(DOWNLOAD_FILE.listFiles()).forEach(File::delete);
        if (chromeBrowser != null) {
            chromeBrowser.quit();
        }
    }

    @Test
    @DisplayName("Download PDF file")
    public void downloadPdfFileTest() throws InterruptedException {
        instructionsPage.downloadPdf();
        Thread.sleep(2000); // Wait for download to complete
        int actualFileCount = DOWNLOAD_FILE.listFiles().length;
        assertEquals(1, actualFileCount, "PDF file was not downloaded");
    }

    @Test
    @DisplayName("Save to file all available cars")
    public void saveToFileAllAvailableCarsTest() throws Exception {
        instructionsPage.clickBrandSelectDropdown();
        List<String> cars = instructionsPage.getAvailableCars();

        instructionsPage.saveCarsToFile(cars);
        Thread.sleep(2000); // Wait for creating the file

        File carsFile = new File(
                 DOWNLOAD_FILE + "/available_cars.txt");
        List<String> expectedCars = List.of("Audi", "BMW", "Ford", "Porsche", "Fiat");
        List<String> actualCars = Files.readAllLines(carsFile.toPath());
        assertEquals(expectedCars.size(), actualCars.size(), "Number of cars in the file does not match!");
        assertTrue(actualCars.containsAll(expectedCars), "Not all the correct cars are in the file!");
    }

}
