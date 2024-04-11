package basetest;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeMethod()
    public void openUrl() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 120000;
        open("https://guest:welcome2qauto@qauto.forstudy.space/");
        System.out.println("The site is open.");
    }

    @AfterMethod()
    public void turnDown() {
        closeWebDriver();
        System.out.println("The site is closed.");
    }
}
