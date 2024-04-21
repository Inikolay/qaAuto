package nikolay;

import basetest.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Flaky;
import io.qameta.allure.Owner;
import main_page.Garage;
import main_page.MainPage;
import main_page.Profile;
import org.testng.Assert;
import org.testng.annotations.Test;

import static common.CommonMethods.checkingContainsUrl;

public class TestQaAuto extends BaseTest {

    private MainPage mainPage = new MainPage();
    private Garage garage = new Garage();

    private String name = "nikolay";
    private String lastName = "smirnov";
    private String email = "zdxxfgf30@gmail.com";
    private String password = "1234567890Qqs";
    private String rePassword = "1234567890Qqs";
    private String nameAndLastNAme = "nikolay smirnov";
    private String mileageUpd = ".5";
    private String mileage = "1234";
    private String numberOfLiters = "888";
    private String totalCost = "55555";

    @Test
    @Owner("nikolay")
    @Description("")
    @Flaky
    public void testQaAuto() {
        mainPage.clickBtnSignUp()
                .writeName(name)
                .writeLastName(lastName)
                .writeEmail(email)
                .writePassword(password)
                .writeRePassword(rePassword)
                .clickBtnRegister();
        garage.clickBtnMyProfile()
                .clickBtnProfile();
        Assert.assertEquals(new Profile().getNameAndLastName(), nameAndLastNAme);
        garage.clickGoToGarage()
                .clickBtnAddCar()
                .checkIsVisiblePopUpAddCar()
                .writeMileageForNewCar(mileage)
                .clickBtnAddCAr()
                .checkIsVisibleBlockNewCar()
                .clickBtnAddFuelExpense()
                .writeMileage(mileageUpd)
                .writeNumberOfLiters(numberOfLiters)
                .writeTotalCost(totalCost)
                .clickBtnAddAnExpense()
                .checkIsVisibleBlockExpenses()
                .clickBtnSetting()
                .clickBtnRemoveMyAccount()
                .clickBtnRemove();
        checkingContainsUrl("https://guest:welcome2qauto@qauto.forstudy.space/");
    }
}
