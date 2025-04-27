package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InstructionsPage {
    private WebDriver driver;

    @FindBy(css = "a.instruction-link_download[href='https://qauto.forstudy.space/public/instructions/audi/tt/Front windshield wipers on Audi TT.pdf']")
    private WebElement pdfLink;

    @FindBy(id = "carSelect")
    private WebElement carSelect;

    @FindBy(id = "brandSelectDropdown")
    private WebElement brandSelectDropdown;

    @FindBy(css = ".brand-select-dropdown_menu.dropdown-menu.show li.dropdown-item")
    private WebElement brandSelectDropdownItem;

    public InstructionsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void downloadPdf() {
        pdfLink.click();
    }

    public void clickBrandSelectDropdown() {
        brandSelectDropdown.click();
    }

    public List<String> getAvailableCars() {
        List<WebElement> dropdownItems = driver.findElements(By.cssSelector(
                ".brand-select-dropdown_menu.dropdown-menu.show li.dropdown-item"));
        List<String> cars = new ArrayList<>();
        for (WebElement item : dropdownItems) {
            cars.add(item.getText().trim());
        }
        return cars;
    }

    public void saveCarsToFile(List<String> cars) throws IOException {
        String directoryPath = "/Users/valentynayakubenko/IdeaProjects/hillel_java_project/src/main/resources/downloads";
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            directory.mkdirs();
        }

        File file = new File(directoryPath, "available_cars.txt");
        try (FileWriter writer = new FileWriter(file, true)) {
            for (String car : cars) {
                writer.write(car + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}