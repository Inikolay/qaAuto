package Dimon;

import basetest.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Flaky;
import io.qameta.allure.Owner;
import main_page.MainPage;
import org.testng.annotations.Test;

public class TestQAuto extends BaseTest {

    //private MainPage mainPage = MainPage();

    @Test
    @Owner("dimon")
    @Description("chekc")
    @Flaky
    public void testQAyto(){
       new MainPage().clickBtnSignUp();
    }
}
