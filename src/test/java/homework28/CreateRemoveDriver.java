package homework28;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateRemoveDriver {

    public static RemoteWebDriver createDriver(String browser) {
        try {
            if ("chrome".equalsIgnoreCase(browser)) {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setCapability("browserVersion", "127.0");
                return new RemoteWebDriver(new URL("http://selenoid:4444/wd/hub"), chromeOptions);

            } else if ("firefox".equalsIgnoreCase(browser)) {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setCapability("browserVersion", "125.0");
                return new RemoteWebDriver(new URL("http://selenoid:4444/wd/hub"), firefoxOptions);

            } else {
                throw new RuntimeException("Unsupported browser: " + browser);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid URL for remote driver", e);
        }
    }
}
