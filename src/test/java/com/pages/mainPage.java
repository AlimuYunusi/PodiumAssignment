package com.pages;

import com.utilities.Driver;
import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainPage {

    public mainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "[class='ContactBubble__IconContainer']")
    public WebElement chatWidgetButton;

    @FindBy(id = "podium-bubble")
    public WebElement iframeElem;

    @FindBy(id = "podium-modal")
    public WebElement iframeElem2;

    @FindBy(xpath = "//*[text()='1402 E Main St, Lehi, UT 84043, United States']")
    public WebElement locationSuggested;

    @FindBy(id = "Name")
    public WebElement NameFiled;

    @FindBy(id = "Mobile Phone")
    public WebElement PhoneNumberFiled;

    @FindBy(id = "Message")
    public WebElement SMSFiled;
    //*[text()='send']
    @FindBy(xpath = "//*[text()='Send']")
    public WebElement SendButton;

}
