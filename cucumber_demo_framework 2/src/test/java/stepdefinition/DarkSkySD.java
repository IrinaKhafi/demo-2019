package stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.BasePage;
import framework.webPages.DarkSkyHomePage;
import framework.webPages.DarkSkyLoginPage;
import framework.webPages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DarkSkySD {
    private HomePage homePage = new HomePage();
    private DarkSkyLoginPage loginPage = new DarkSkyLoginPage();
    private DarkSkyHomePage dsHomePage = new DarkSkyHomePage();

    @Given("^I am on the darksky Register page$")
    public void iAmOnRegisterPage(){
        homePage.clickOnApiButton();
        homePage.clickOnLoginPage();
    }
    @When("^I click on Register button$")
    public void clickOnRegisterButton(){
        loginPage.clickOnLoginButton();

    }

    @Then("^I verify error message \"please fill out this field\"$")
    public void verifyErrorMessage(){
        Assert.assertEquals("https://darksky.net/dev/login", SharedSD.getDriver().getCurrentUrl());

    }

    @Given("^I am on Darksky Home Page$")
    public void iAmOnHomePage(){
        SharedSD.getDriver().manage().window().maximize();
    }

    @Then("^I verify current temperature is not greater or less then temps from daily timeline$")
    public void checkTemperature(){
        dsHomePage.checkTheWeather();

    }

    @When("^I expand todays timeline$")
    public void expandTimeline(){
        dsHomePage.clickOnTodayExpandButton();
    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void compareWeather(){
        dsHomePage.compareTodaysWeather();
    }


    @Then("^I verify timeline is displayed with two hours incremented$")
    public void checkTimeIncrementation(){ dsHomePage.timeIncr();}
}
