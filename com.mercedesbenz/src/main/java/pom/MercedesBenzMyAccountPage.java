package pom;

import javaBase.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MercedesBenzMyAccountPage extends Base {
    public MercedesBenzMyAccountPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//div[1]/header/nav/ul/li[5]/div/div/ul/li[2]/section/div/div/div[2]/button")
    public WebElement registerTab;

    @FindBy(xpath="//*[@id=\"registrationPage\"]/div[1]")
    public WebElement createAUserAccount;

    @FindBy(xpath="//*[@id=\"username\"]")
    public WebElement inputEmailAddress;

    @FindBy(xpath="//*[@id=\"firstname\"]")
    public WebElement inputFirstName;

    @FindBy(xpath ="//*[@id=\"lastname\"]")
    public WebElement inputLastName;

    @FindBy(xpath="//*[@id=\"56-button\"]/span")
    public WebElement selectLanguageDropDownMenu;

    @FindBy(xpath ="//*[@id=\"56-option-en_US\"]")
    public WebElement selectLanguageEnglishUS;

    @FindBy(xpath="//*[@id=\"59-button\"]/span")
    public WebElement selectCountryDropDownMenu;

    @FindBy(xpath="//*[@id=\"59-option-US\"]")
    public WebElement selectCountryUSA;

    @FindBy(xpath="//*[@id=\"password\"]")
    public WebElement inputPassword;

    @FindBy(xpath="//*[@id=\"toas\"]/div[1]/div")
    public WebElement checkBox;

    @FindBy(xpath="//*[@id=\"continue\"]")
    public WebElement createUserAccount;



}
