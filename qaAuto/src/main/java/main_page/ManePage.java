package main_page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;


import java.time.Duration;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$x;

////button[@class='hero-descriptor_btn btn btn-primary']

public class ManePage {

    SelenideElement btnLogIN(){
        return $x("//button[@class='hero-descriptor_btn btn btn-primary']");
    }


    SelenideElement subscriptionBtnClosePopup() {
        return $x("(//span[@class='subscription-link-popup-wrap__close js-close-subscription-link-popup'])[2]");
    }



    private SelenideElement inputName = $x("//input[@id='signupName']");
    private SelenideElement inputLastName = $x("//input[@id='signupLastName']");


    public ManePage clickBtnLogIn(){
        btnLogIN().should(Condition.visible, Duration.ofSeconds(5)).click();
        return this;
    }

    public ManePage writeName(String name){
        inputName.setValue(name);
        return this;
    }

    public ManePage writeLastName(String lastName){
        inputLastName.setValue(lastName);
        return this;
    }
}
