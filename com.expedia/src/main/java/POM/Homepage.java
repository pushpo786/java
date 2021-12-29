package POM;

import javaBase.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

public class Homepage extends Base {
    private static final String ABSOLUTE_PATH = System.getProperty("user.dir");

    public Homepage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[@id=\"wizardMainRegionV2\"]/div//ul/li[2]/a")
    public WebElement flightsLink;

    public FlightSearchPage navigateToFlightSearchPage(){
        clickJScript(flightsLink);
        return new FlightSearchPage();

    }

    public void setUpLocations(WebElement location, WebElement locationText, String text, WebElement firstResult){
        clickOnElement(location);
        sendKeysToInput(locationText,text);
        clickOnElement(firstResult);
    }


    public void selectBox(WebElement input){
        clickOnElement(input);
        webDriverWait.until(ExpectedConditions.elementSelectionStateToBe(input, true));
    }

    public void unselectBox(WebElement input){
        clickOnElement(input);
        webDriverWait.until(ExpectedConditions.elementSelectionStateToBe(input, false));
    }

    public void assertOneDList(List<String> tested, String sheetname) throws IOException {
        String relPath = ABSOLUTE_PATH + "/src/test/resources/ExpediaTestData.xlsx";
        SoftAssert softAssert = new SoftAssert();
        String[] expectedText = dataReader.fileReaderStringXSSF(relPath, sheetname);
        int length = tested.size();
        for (int i = 0; i < length; i++) {
            System.out.println("EXPECTED: " + expectedText[i] + "\nACTUAL: " + tested.get(i));
            softAssert.assertEquals(tested.get(i), expectedText[i]);
        }
        softAssert.assertAll();
    }

    public void clickStartDate(WebElement date,String startingDate){
        clickOnElement(date);
        WebElement element = driver.findElement(By.xpath("//*[@aria-label=\"" + startingDate + "\"]"));
        clickOnElement(element);
    }

    public void clickEndDate(WebElement done,String endingDate){
        WebElement element = driver.findElement(By.xpath("//*[@aria-label=\"" + endingDate + "\"]"));
        clickOnElement(element);
        clickOnElement(done);
    }



}
