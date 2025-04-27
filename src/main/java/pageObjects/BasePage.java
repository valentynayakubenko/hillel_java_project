package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void clickElement(By locator) {
        findElement(locator).click();
    }

    public String getElementText(By locator) {
        return findElement(locator).getText();
    }

    public boolean isElementDisplayed(By locator) {
        return findElement(locator).isDisplayed();
    }
}

