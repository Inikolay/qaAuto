package main_page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.sleep;
import static java.time.Duration.ofSeconds;

public class Garage {

    private SelenideElement btnMyProfile = Selenide.$x("//button[@class='dropdown-toggle user-nav_toggle']");
    private SelenideElement btnProfile = Selenide.$x("//a[@class='btn btn-white btn-sidebar sidebar_btn -profile']");
    private SelenideElement btnSetting = Selenide.$x("(//a[@class='btn btn-white btn-sidebar sidebar_btn'])[3]");
    private SelenideElement btnGarage = Selenide.$x("//a[@class='dropdown-item btn btn-link user-nav_link disabled']");
    private SelenideElement btnAddCar = Selenide.$x("//button[@class='btn btn-primary']");
    private SelenideElement goToGarage = Selenide.$x("//a[@class='btn btn-white btn-sidebar sidebar_btn']");
    private SelenideElement popUpAddCar = Selenide.$x("//div[@class='modal-content']");
    private SelenideElement inputAddMileage = Selenide.$x("//input[@id='addCarMileage']");
    private SelenideElement btnAdd = Selenide.$x("//div[@class='modal-content']//button[@class='btn btn-primary']");
    private SelenideElement blockNewCar = Selenide.$x("//div[@class='car jumbotron']");
    private SelenideElement btnAddFuelExpense = Selenide.$x("//button[@class='car_add-expense btn btn-success']");
    private SelenideElement inputMileage = Selenide.$x("//input[@name='mileage']");
    private SelenideElement inputNumberOfLiters = Selenide.$x("//input[@name='liters']");
    private SelenideElement inputTotalCost= Selenide.$x("//input[@name='totalCost']");
    private SelenideElement btnAddAnExpense = Selenide.$x("//div[@class='modal-content']//button[@class='btn btn-primary']");
    private SelenideElement blockExpenses = Selenide.$x("//div[@class='panel-page']");



    public Garage clickBtnMyProfile(){
        btnMyProfile.click();
        return this;
    }

    public Profile clickBtnProfile(){
        btnProfile.scrollIntoView("{block:\"center\"}").shouldBe(visible, ofSeconds(10)).click();
        return page(Profile.class);
    }

    public Garage clickBtnGarage(){
        btnGarage.click();
        return page(Garage.class);
    }


    public Garage clickGoToGarage(){
        goToGarage.click();
        return this;
    }

    public Garage clickBtnAddCar(){
        btnAddCar.click();
        return this;
    }

    public Garage checkIsVisiblePopUpAddCar(){
        popUpAddCar.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return this;
    }

    public Garage writeMileageForNewCar(String mileage){
        inputAddMileage.setValue(mileage);
        return this;
    }

    public Garage clickBtnAddCAr(){
        btnAdd.click();
        return this;
    }

    public Garage checkIsVisibleBlockNewCar(){
        blockNewCar.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return this;
    }

    public Garage clickBtnAddFuelExpense(){
        btnAddFuelExpense.click();
        return this;
    }

    public Garage writeMileage(String mileage){
        inputMileage.setValue(mileage);
        sleep(3000);
        return this;
    }

    public Garage writeNumberOfLiters(String numberOfLiters){
        inputNumberOfLiters.setValue(numberOfLiters);
        return this;
    }

    public Garage writeTotalCost(String totalCost){
        inputTotalCost.setValue(totalCost);
        return this;
    }

    public Garage clickBtnAddAnExpense(){
        btnAddAnExpense.click();
        return this;
    }

    public Garage checkIsVisibleBlockExpenses(){
        blockExpenses.shouldBe(Condition.visible, Duration.ofSeconds(15));
        return this;
    }


    public Setting clickBtnSetting(){
        btnSetting.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        return page(Setting.class);
    }

}
