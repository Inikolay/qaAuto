package main_page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;
import static java.time.Duration.ofSeconds;

public class Setting {
    private SelenideElement btnRemoveMyAccount = Selenide.$x("//button[@class='btn btn-danger-bg']");
    private SelenideElement btnRemove = Selenide.$x("//button[@class='btn btn-danger']");

    public Setting clickBtnRemoveMyAccount(){
        btnRemoveMyAccount.scrollIntoView("{block:\"center\"}").shouldBe(visible, ofSeconds(10)).click();
        return this;
    }

    public MainPage clickBtnRemove(){
        btnRemove.click();
        return page(MainPage.class);
    }
}
