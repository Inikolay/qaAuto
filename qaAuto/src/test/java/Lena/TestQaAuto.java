package Lena;

import basetest.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Flaky;
import io.qameta.allure.Owner;
import main_page.MainPage;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;


public class TestQaAuto extends BaseTest {
private MainPage mainPage = new MainPage();


@Test
@Owner("Lena")
@Description("Checking web-site")
@Flaky

public void testQaAuto(){
    mainPage.clickBtnSignUp();


}


}
