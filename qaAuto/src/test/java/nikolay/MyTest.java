package nikolay;

import basetest.BaseTest;
import io.qameta.allure.Owner;
import main_page.ManePage;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {

    private String name = "Nikolay";
    private String lastName = "Smornov";

    ManePage manePage = new ManePage();

    @Test
    @Owner("Nikolay")
    public void startTest(){
        manePage.clickBtnLogIn()
                .writeName(name)
                .writeLastName(lastName);
    }
}
