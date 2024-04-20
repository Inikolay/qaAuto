package nikolay;

import basetest.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Flaky;
import io.qameta.allure.Owner;
import main_page.MainPage;
import org.testng.annotations.Test;

public class TestQaAuto extends BaseTest {

    private MainPage mainPage = new MainPage();

    @Test
    @Owner("nikolay")
    @Description("")
    @Flaky
    public void testQaAuto(){
       mainPage.clickBtnSignUp();
    }
}
