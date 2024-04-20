package main_page;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

public class MainPage {

    private SelenideElement btnSignUp = Selenide.$x("//button[@class='hero-descriptor_btn btn btn-primary']");
    private SelenideElement inputName = Selenide.$x("//input[@id='signupName']");
    private SelenideElement inputLastName = Selenide.$x("//input[@id='signupLastName']");
    private SelenideElement inputEmail = Selenide.$x("//input[@id='signupEmail']");
    private SelenideElement inputPassword = Selenide.$x("//input[@id='signupPassword']");
    private SelenideElement inputRePassword = Selenide.$x("//input[@id='signupRepeatPassword']");
    private SelenideElement btnRegister = Selenide.$x("//button[@class='btn btn-primary']");

    public MainPage clickBtnSignUp(){
        btnSignUp.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
        return this;
    }

    public MainPage writeName(String name){
        inputName.setValue(name);
        return this;
    }

    public MainPage writeLastName(String lastName){
        inputLastName.setValue(lastName);
        return this;
    }


}
