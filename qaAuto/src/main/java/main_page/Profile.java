package main_page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class Profile {
    private SelenideElement textUserNameLast = Selenide.$x("//p[@class='profile_name display-4']");

    public String getNameAndLastName(){
        return textUserNameLast.getText();
    }

}
