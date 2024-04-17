package main_page;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

public class MainPage {

    //private SelenideElement productCardNotebook = Selenide.$x("//button[@class='buy-button goods-tile__buy-button ng-star-inserted']");

    private SelenideElement btnSignUp = Selenide.$x("//button[@class='hero-descriptor_btn btn btn-primary']");
    private SelenideElement inputName = Selenide.$x("//input[@id='signupName']']");
    private SelenideElement inputLastName = Selenide.$x("//input[@id='signupLastName']");
    private SelenideElement inputEmail = Selenide.$x("//input[@id='signupEmail']");
    private SelenideElement inputPassword = Selenide.$x("//input[@id='signupPassword']");
    private SelenideElement inputRepassword = Selenide.$x("//input[@id='signupRepeatPassword']");
    private SelenideElement btnRegister = Selenide.$x("//button[@class='btn btn-primary']");


    public MainPage clickBtnSignUp() {
        btnSignUp.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        return this;
    }

    public MainPage writeName(String name) {
        inputName.setValue(name);
        return this;
    }

    public MainPage writeLastName(String lastName) {
        inputName.setValue(lastName);
        return this;
    }

    public MainPage writeEmail(String Email) {
        inputName.setValue(Email);
        return this;
    }

    public MainPage writeLastPassword(String password) {
        inputName.setValue(password);
        return this;
    }

    public MainPage writeRePassword(String rePasswor) {
        inputName.setValue(rePasswor);
        return this;
    }
}