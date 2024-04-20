package main_page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class Garage {
    private SelenideElement btnMyProfile = Selenide.$x("//button[@class='dropdown-toggle user-nav_toggle']");
    private SelenideElement btnProfile = Selenide.$x("//a[@class='dropdown-item btn btn-link user-nav_link'/a[@class='user-nav_menu-group']");


    public Garage clickBtnMyProfile(){
        btnMyProfile.click();
        return this;
    }
    public Profile clickProfile(){
        btnProfile.click();
        return page(Profile.class);
    }




    private SelenideElement UserName = Selenide.$x("//[@class='profile_name display-4']");

    private SelenideElement btnGarage = Selenide.$x("//a[@class='dropdown-item btn btn-link user-nav_link']");

    public Garage clickBtnGarage(){
        btnGarage.click();
        return page(Garage.class);
    }


    private SelenideElement btnAddCar = Selenide.$x("//button[@class='btn btn-primary']");

    public Garage clickBtnAddCar(){
        btnAddCar.click();
        return this;
    }
private SelenideElement PopUpAddCar = Selenide.$x("//div[@class='form-control ng-pristine ng-invalid is-invalid ng-touched']");

    public Garage checkIsVisiblePopUpAddCar(){
        PopUpAddCar.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return this;
    }


    private SelenideElement InputAddMilage = Selenide.$x("//input[@id='addCarMileage']");

    public Garage writeMileageForNewCar(String mileage){
        InputAddMilage.setValue(mileage);
        return this;
    }

    private SelenideElement BtnAdd = Selenide.$x("//button[@class='btn btn-primary']");

    public Garage clickBtnAddCarr(){
        BtnAdd.click();
        return this;
    }

    private SelenideElement BlockNewCar = Selenide.$x("//div[@class='car jumbotron']");

    public Garage checkIsVisiblePopUpBlockNewCar(){
        BlockNewCar.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return this;
    }



}
