package framework.webPages;

import org.openqa.selenium.By;

public class HotelsLandingPage extends BasePage {
    HomePage hp = new HomePage();

    private By closePopUp = By.xpath("//button[@class='cta widget-overlay-close']");
    private By searchButton = By.xpath("//button[@class='cta cta-strong']");
    private By city = By.xpath("//input[@id='qf-0q-destination']");
    private By dropDown = By.xpath("//h1[@class='cont-hd-alt widget-query-heading']");


    public void closePopUp(){hp.clickOn(closePopUp);}

    public void clickOnSearchButton(){hp.clickOn(searchButton);}

    public void setCity(){hp.setValue(city, "Los Angeles");}

    public void closeDropDown(){hp.clickOn(dropDown);}
}
