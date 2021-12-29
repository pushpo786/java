package testPOM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.MercedesBenzMyAccountPage;
import testBase.TestBase;

import java.io.IOException;
import java.util.List;

public class TestMercedesBenzMyAccountPage extends TestBase {

    Homepage homepage;
    List<String> testData;
    String[][]stringValue;

    @Test(description="Case ID:01",priority=1,enabled = true)
    public void testNavigateToMercedesBenzMyAccountPage() throws IOException {
        Homepage homepage=getHomepage();
        MercedesBenzMyAccountPage myAccountPage=getMercedesBenzMyAccountPage();
        clickOnElement(homepage.myAccountTab);
        List<String> expectedList=getExpectedList("MercedesBenz");
        String actualText=homepage.myAccountTab.getText();
        String expectedText="My Account";
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Found Mercedesbenz MyAccount Page");
    }

    @Test(description="Case ID: 02", priority=2,enabled=true)
    public void testNavigateToRegisterPage() throws IOException {
        Homepage homepage=getHomepage();
        MercedesBenzMyAccountPage myAccountPage= homepage.navigateToMercedesBenzPageMyAccount();
        waitForElementToBeVisible(myAccountPage.registerTab);
        clickOnElement(myAccountPage.registerTab);
        List<String> expectedList=getExpectedList("MercedesBenz");
        String actualText=myAccountPage.registerTab.getText();
        String expectedText="Register";
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Found MercedesbenzRegister Page");

    }

    @Test(description="Case ID:03",priority=3,enabled=true)
    public void testNavigateToCreateUserAccountPage() throws IOException {
        Homepage homepage=getHomepage();
        MercedesBenzMyAccountPage myAccountPage= homepage.navigateToMercedesBenzPageMyAccount();
        waitForElementToBeVisible(myAccountPage.registerTab);
        clickOnElement(myAccountPage.registerTab);
        clickOnElement(myAccountPage.createAUserAccount);
        sendKeysToElement(myAccountPage.inputEmailAddress,"tom@gmail.com");
        sendKeysToElement(myAccountPage.inputFirstName,"Tom");
        sendKeysToElement(myAccountPage.inputLastName,"Hunter");
        clickOnElement(myAccountPage.selectLanguageDropDownMenu);
        clickOnElement(myAccountPage.selectLanguageEnglishUS);
        clickOnElement(myAccountPage.selectCountryDropDownMenu);
        clickOnElement(myAccountPage.selectCountryUSA);
        sendKeysToElement(myAccountPage.inputPassword,"Hunter123!");
        clickOnElement(myAccountPage.checkBox);
        clickOnElement(myAccountPage.createUserAccount);
        List<String> expectedList=getExpectedList("MercedesBenz");
        String actualText=myAccountPage.createAUserAccount.getText();
        String expectedText="Create user account";
        Assert.assertEquals(actualText,expectedText);
        System.out.println("Found Mercedesbenz create a user account Page");


    }



}
