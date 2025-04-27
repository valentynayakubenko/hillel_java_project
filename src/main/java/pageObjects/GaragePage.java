package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GaragePage {
    private WebDriver driver;

    @FindBy(css = ".btn.btn-primary")
    private WebElement addCarButton;

    @FindBy(id = "addCarBrand")
    private WebElement brandSelect;

    @FindBy(id = "addCarModel")
    private WebElement modelSelect;

    @FindBy(id = "addCarMileage")
    private WebElement mileageInput;

    @FindBy(css = ".btn.btn-primary:nth-of-type(2)")
    private WebElement addButton;

    @FindBy(css = ".car_name.h2")
    private WebElement carName;

    @FindBy(css = "p.car_update-mileage")
    private WebElement carUpdateMileage;

    @FindBy(css = "input.update-mileage-form_input")
    private WebElement milesInput;

    @FindBy(css = "img.car-logo_img")
    private WebElement carLogo;

    @FindBy(css = "a.btn-sidebar[href='/panel/instructions']")
    private WebElement instructionsLink;

    public GaragePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddCar() {
        addCarButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-content")));
    }

    public void selectBrand(String brand) {
        Select brandDropdown = new Select(brandSelect);
        brandDropdown.selectByVisibleText(brand);
    }

    public void selectModel(String model) {
        Select modelDropdown = new Select(modelSelect);
        modelDropdown.selectByVisibleText(model);
    }

    public void enterMileage(String mileage) {
        mileageInput.sendKeys(mileage);
    }

    public void clickAdd() {
        addButton.click();
    }

    public String getCarName() {
        return carName.getText();
    }

    public String getCarUpdateMileage() {
        return carUpdateMileage.getText();
    }

    public String getMilesValue() {
        return milesInput.getAttribute("value");
    }

    public boolean isCarLogoDisplayed() {
        return carLogo.isDisplayed();
    }

    public String getCarLogoSource() {
        return carLogo.getAttribute("src");
    }

    public boolean isCurrentDateDisplayed() {
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return getCarUpdateMileage().contains(currentDate);
    }

    public void clickInstructions() {
        instructionsLink.click();
    }

}