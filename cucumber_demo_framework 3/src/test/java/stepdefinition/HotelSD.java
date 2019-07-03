package stepdefinition;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HotelsLandingPage;
import framework.webPages.HotelsSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class HotelSD {

    HotelsLandingPage hLandPage = new HotelsLandingPage();
    HotelsSearchPage hSearchPage = new HotelsSearchPage();

    @Given("^I am on default locations search result screen$")
    public void iAmOnLandingPage(){SharedSD.getDriver().manage().window().maximize();
    hLandPage.closePopUp();
    hLandPage.setCity();
    hLandPage.closeDropDown();
    hLandPage.clickOnSearchButton();}

    @When("^I select property class (.+) stars$")
    public void selectStars(String star){
        String  beginning ="//input[@id='f-star-rating-";
        String end ="']";
        JavascriptExecutor js = (JavascriptExecutor) SharedSD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", SharedSD.getDriver().findElement(By.xpath(beginning + star + end)));
        SharedSD.getDriver().findElement(By.xpath(beginning + star + end)).click();

    }

    @Then("^I verify system displays only (.+) stars hotels on search result$")
    public void verifyStars(int stars)throws InterruptedException{
        hSearchPage.scroll();
        hSearchPage.starsCheck(stars);
    }

    @Then("^I verify system displays all hotels within 10 miles radius of airport$")
    public void verifyRadius()throws InterruptedException{hSearchPage.clickOnAirportDistance();
    hSearchPage.scroll();
    hSearchPage.checkAirportDistance();}

    @And("^I verify Hilton Hotel is within radius$")
    public void verifyHilton(){hSearchPage.checkIfHotelIsDisplayes("hilton");}

}
