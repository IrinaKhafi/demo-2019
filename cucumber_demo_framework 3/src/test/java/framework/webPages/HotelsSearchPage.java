package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.util.ArrayList;
import java.util.List;

public class HotelsSearchPage extends BasePage {

    private By starsRating = By.xpath("//span[@class='star-rating-text']");
    private By hotelsNames = By.xpath("//a[@class='property-name-link']");
    private By locationButton = By.xpath("//a[contains(text(),'Distance')]");
    private By airport = By.xpath("//li[@class='section-airports root-section']//ul//li//a[contains(text(),'Los Angeles Intl. (LAX)')]");
    private By distanceToTheHotel = By.xpath("//ul[@class='property-landmarks']/li[1]");



    public void scroll()throws InterruptedException{
        for(int i=0; i<10; i++){
        JavascriptExecutor js =(JavascriptExecutor) SharedSD.getDriver();
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        i++;} }

    public void starsCheck(int stars){

        List<WebElement> hotelStars = SharedSD.getDriver().findElements(starsRating);
        boolean isStarsCorrect = true;
         List<Integer> numberOfStars = new ArrayList<>();
        for(WebElement st : hotelStars){
            String [] number = st.getText().split("[.]|-");
            String ind = number[0];
            int fin = Integer.parseInt(ind);
            numberOfStars.add(fin);
            if ((fin>=stars+1) || (fin<stars)){
                isStarsCorrect=false;
            if (numberOfStars.size()==50){
            break;}
            }
        }
        Assert.assertTrue(isStarsCorrect);
    }

    public void clickOnAirportDistance()throws InterruptedException{
        mouseOver(locationButton);
        Thread.sleep(3000);
        SharedSD.getDriver().findElement(airport).click();
        Thread.sleep(5000);
    }

    public void checkAirportDistance(){

                  try{
                      boolean distanceIsLessThanTen = false;
                      List<WebElement> distanceList = SharedSD.getDriver().findElements(distanceToTheHotel);
                      List<Integer> webToArray = new ArrayList<>();
                      for(WebElement distanceListCompare : distanceList ) {
                          String [] split = distanceListCompare.getText().split("m");
                          String string=split[1];
                          int mile = Integer.parseInt(string);
                          if(mile<=10){
                              distanceIsLessThanTen = true;
                          }
                          webToArray.add(mile);
                          Assert.assertTrue(distanceIsLessThanTen,"Distance to the airport is less or equal to 10");

                 }

                 }catch(NumberFormatException nfe){
                      System.out.println("Number Problem caught");
                 }
           }


           public void checkIfHotelIsDisplayes(String hotel){
        List<WebElement> distanceList=SharedSD.getDriver().findElements(hotelsNames);
        boolean isHiltonDisplayed=false;
        for(WebElement htel : distanceList){
        if(htel.getText().toLowerCase().contains(hotel)){
        isHiltonDisplayed=true;
        }
        Assert.assertTrue(isHiltonDisplayed,hotel + " is out of range");
        }
    }
}
