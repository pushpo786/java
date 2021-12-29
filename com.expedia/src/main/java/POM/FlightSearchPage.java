package POM;

import javaBase.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSearchPage extends Base {
    public FlightSearchPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[1]/a")
    public WebElement roundTripButton;

    @FindBy(xpath="//*[@id=\"location-field-leg1-origin-menu\"]//div[1]/button")
    public WebElement leavingFromCity;

    @FindBy(xpath="//*[@id=\"location-field-leg1-origin-menu\"]/div[2]//ul/li[1]/button")
    public WebElement inputLeavingFromCityName;

    @FindBy(xpath="//*[@id=\"location-field-leg1-destination-menu\"]//div[1]/button")
    public WebElement goingToCity;

    @FindBy(xpath="//*[@id=\"location-field-leg1-destination-menu\"]/div[2]//ul/li[1]/button")
    public WebElement inputGoingToCityName;


}
