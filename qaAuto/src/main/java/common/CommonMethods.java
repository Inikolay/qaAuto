package common;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import java.time.Duration;
import java.util.Random;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.url;

public class CommonMethods {

    @DataProvider(name = "password")
    Object[][] dataProviderPassword() {
        return new Object[][]{
                {"11111"}, {"22222"}, {"2222"}

        };
    }

    public static void checkingContainsUrl(String expectedContainsUrl) {
        try {
            Wait<WebDriver> wait = new WebDriverWait(getWebDriver(), Duration.ofMinutes(1));
            wait.until(webDriver -> url().contains(expectedContainsUrl));
        } catch (TimeoutException e) {
            System.out.println(url());
            Assert.fail("Url doesn't contains: " + expectedContainsUrl);
        }
    }

    public static String randomMail() {
        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt();
        return random + "@test.com";
    }


}
