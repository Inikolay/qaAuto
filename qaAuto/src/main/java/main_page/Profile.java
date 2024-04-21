package main_page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class Profile {

    private SelenideElement textNameLastName = Selenide.$x("//p[@class='profile_name display-4']");

    public String getNameAndLastName(){
        return textNameLastName.getText();
    }


}
