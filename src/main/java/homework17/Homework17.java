package homework17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework17 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver chromeBrowser = new ChromeDriver();
        Runtime.getRuntime().addShutdownHook(new Thread(chromeBrowser::quit));
        chromeBrowser.get("https://guest:welcome2qauto@qauto.forstudy.space/");

        WebElement buttonGuestLogIn = chromeBrowser.findElement(By.cssSelector("button.header-link.-guest"));
        buttonGuestLogIn.click();

        List<WebElement> leftSideBar = chromeBrowser.findElements(By.cssSelector("*.sidebar_btn"));
        for (WebElement element : leftSideBar) {
            System.out.println(element.getText());
        }
        Thread.sleep(3000);

        chromeBrowser.quit();
    }
}