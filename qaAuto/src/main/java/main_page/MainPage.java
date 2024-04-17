package main_page;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

public class MainPage {

    //private SelenideElement productCardNotebook = Selenide.$x("//button[@class='buy-button goods-tile__buy-button ng-star-inserted']");

private SelenideElement btnSignUp = Selenide.$x("//button[@class='hero-descriptor_btn btn btn-primary']");
private SelenideElement inputName = Selenide.$x("//input[@Id='signupName']");
private SelenideElement inputLastName = Selenide.$x("//input[@Id='//input[@Id='signupName']");
private SelenideElement inputEmail = Selenide.$x("//input[@Id='//input[@Id='signupEmail']");
private SelenideElement inputPassword = Selenide.$x("//input[@Id='//input[@Id='signupPassword']");
private SelenideElement inputRePassword = Selenide.$x("//input[@Id='//input[@Id='signupRepeatPassword']");
private SelenideElement btnRegister = Selenide.$x("//input[@Id='//input[@Id='btn btn-primary']");


        public MainPage clickBtnSignUp(){
                btnSignUp.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
                return this;
        }
        public MainPage writeName(String name){
                inputName.setValue(name);
                return this;
        }
        public MainPage writeLastName(String lastname){
                inputName.setValue(lastname);
                return this;
        }
        public MainPage writeEmail(String email){
                inputName.setValue(email);
                return this;
        }
        public MainPage writePassword(String password){
                inputName.setValue(password);
                return this;
        }
        public MainPage writeRePassword(String repassword){
                inputName.setValue(repassword);
                return this;
        }


}
