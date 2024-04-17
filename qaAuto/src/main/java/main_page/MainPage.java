package main_page;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

public class MainPage {

    //private SelenideElement productCardNotebook = Selenide.$x("//button[@class='buy-button goods-tile__buy-button ng-star-inserted']");
private SelenideElement btnSignUp = Selenide.$x("//button[@class='hero-descriptor_btn btn btn-primary']");

public MainPage clickBtnSignUp(){
    btnSignUp.shouldBe(Condition.visible, Duration.ofSeconds(5)).click();
    return this;


}


}
