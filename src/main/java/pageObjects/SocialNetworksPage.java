package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class SocialNetworksPage extends BasePage {

    private By socialBlockLocator = By.cssSelector(".contacts_socials.socials");
    private By socialIconLocator = By.cssSelector("a");

    public SocialNetworksPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSocialIcons() {
        WebElement socialBlock = findElement(socialBlockLocator);
        return socialBlock.findElements(socialIconLocator);
    }

    public int getSocialIconsCount() {
        return getSocialIcons().size();
    }
}

