package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DarkSkyLoginPage extends BasePage{

    private By loginButton = By.xpath("//button[contains(text(),'Log in')]");

    public void clickOnLoginButton(){
        clickOn(loginButton);
    }


}
