package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DriverManager {

    public static WebDriver getDriver(String driverName, Map<String, String> options) {
        WebDriver driver = null;
        String downloadDirectory = options.get("download_directory");
        File downloadDir = null;

        if (Objects.nonNull(downloadDirectory)) {
            downloadDir = new File(downloadDirectory);
            if (!downloadDir.exists()) {
                downloadDir.mkdir();
            }
        }

        switch (driverName.toLowerCase()) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                if (Objects.nonNull(downloadDir)) {
                    HashMap<String, Object> prefs = new HashMap<>();
                    prefs.put("download.default_directory", downloadDir.getAbsolutePath());
                    chromeOptions.setExperimentalOption("prefs", prefs);
                }
                driver = new ChromeDriver(chromeOptions);
                break;

            case "firefox":
                FirefoxProfile firefoxProfile = new FirefoxProfile();
                if (Objects.nonNull(downloadDir)) {
                    firefoxProfile.setPreference("browser.download.dir", downloadDir.getAbsolutePath());
                    firefoxProfile.setPreference("browser.download.folderList", 2);
                    firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream");
                }
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setProfile(firefoxProfile);
                driver = new FirefoxDriver(firefoxOptions);
                break;

            default:
                throw new IllegalArgumentException("Unknown driver name");
        }
        driver.manage().window().maximize();

        String implicitWait = options.getOrDefault("implicit_wait", "5");
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(implicitWait), java.util.concurrent.TimeUnit.SECONDS);

        return driver;
    }

}
