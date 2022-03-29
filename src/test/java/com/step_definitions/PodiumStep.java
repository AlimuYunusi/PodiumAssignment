package com.step_definitions;

import com.pages.mainPage;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PodiumStep {
    mainPage mainSearch;

    public PodiumStep() {
        mainSearch = new mainPage();

    }

    @Given("User able to land on home page {string}")
    public void userAbleToLandOnHomePageBaseUrl(String a) {
        String url = ConfigurationReader.getProperty(a);
        Driver.getDriver().get(url);
    }


    @When("click on chatWidgetButton")
    public void clickOnChatWidgetButton() throws InterruptedException {
        //System.out.println("Testing phase");
        Thread.sleep(4000);
        Driver.getDriver().switchTo().frame(mainSearch.iframeElem);
        //System.out.println("Iframe");
        Thread.sleep(4000);
        mainSearch.chatWidgetButton.click();
    }


    @And("select one of the locationSuggested")
    public void selectOneOfTheLocationSuggested() throws InterruptedException {
        Thread.sleep(4000);
        Driver.getDriver().switchTo().defaultContent();
        Driver.getDriver().switchTo().frame(mainSearch.iframeElem2);
        Thread.sleep(4000);
        mainSearch.locationSuggested.click();
    }



    @And("I input {string} as a {string}")
    public void iInputAsA(String arg0, String arg1) throws InterruptedException {
        switch (arg1) {
        case "Name":
            mainSearch.NameFiled.sendKeys("Alim");
            Thread.sleep(1000);
            break;
        case "MobilePhoneNumber":
            mainSearch.PhoneNumberFiled.sendKeys("2029973877");
            Thread.sleep(1000);
            break;
        case "SMSFiled":
            mainSearch.SMSFiled.sendKeys("Hello");
            Thread.sleep(1000);
            break;

        default:
            System.out.println("Invalid field type");
    }
    }

    @And("Click on sendButton")
    public void clickOnSendButton() throws InterruptedException {
        Thread.sleep(1000);
        mainSearch.SendButton.click();
    }
}

