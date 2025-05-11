package pageObject2;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class GaragePage {


    private SelenideElement addCarButton() {
        return $(".btn.btn-primary");
    }

    private SelenideElement brandSelect() {
        return $("#addCarBrand");
    }

    private SelenideElement modelSelect() {
        return $("#addCarModel");
    }

    private SelenideElement mileageInput() {
        return $("#addCarMileage");
    }

    private SelenideElement addButton() {
        return $$("button.btn.btn-primary").get(1); // друга кнопка "Add"
    }

    private SelenideElement carName() {
        return $(".car_name.h2");
    }

    private SelenideElement carUpdateMileage() {
        return $("p.car_update-mileage");
    }

    private SelenideElement milesInput() {
        return $("input.update-mileage-form_input");
    }

    private SelenideElement carLogo() {
        return $("img.car-logo_img");
    }

    private SelenideElement instructionsLink() {
        return $("a.btn-sidebar[href='/panel/instructions']");
    }

    @Step("Click Add Car button and wait for modal")
    public void clickAddCar() {
        addCarButton().shouldBe(visible).click();
        $(".modal-content").shouldBe(visible);
    }

    @Step("Select brand: {brand}")
    public void selectBrand(String brand) {
        brandSelect().shouldBe(visible).selectOption(brand);
    }

    @Step("Select model: {model}")
    public void selectModel(String model) {
        modelSelect().shouldBe(visible).selectOption(model);
    }

    @Step("Enter mileage: {mileage}")
    public void enterMileage(String mileage) {
        mileageInput().shouldBe(visible).setValue(mileage);
    }

    @Step("Click Add button to submit car")
    public void clickAdd() {
        addButton().shouldBe(enabled).click();
    }

    @Step("Get added car name")
    public String getCarName() {
        return carName().shouldBe(visible).getText();
    }

    @Step("Get car update mileage paragraph text")
    public String getCarUpdateMileage() {
        return carUpdateMileage().shouldBe(visible).getText();
    }

    @Step("Get miles input value")
    public String getMilesValue() {
        return milesInput().shouldBe(visible).getValue();
    }

    @Step("Check if car logo is displayed")
    public boolean isCarLogoDisplayed() {
        return carLogo().shouldBe(visible).isDisplayed();
    }

    @Step("Get car logo src")
    public String getCarLogoSource() {
        return carLogo().shouldHave(attribute("src")).getAttribute("src");
    }

    @Step("Check if current date is displayed in update mileage")
    public boolean isCurrentDateDisplayed() {
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return getCarUpdateMileage().contains(currentDate);
    }

    @Step("Click Instructions link")
    public void clickInstructions() {
        instructionsLink().shouldBe(visible).click();
    }
}
