package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import stepdefinition.SharedSD;
import static org.junit.Assert.assertArrayEquals;


import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class DarkSkyHomePage extends BasePage {

    private By currentTemperature = By.xpath("//span[@class='summary swap']");
    private By dailyTemperature = By.xpath("//div[@id='timeline']//div[@class='temps']");
    private By lowestTodayWeatherShown = By.xpath("//a[1]//span[2]//span[1]");
    private By highestTodayWeatherShown = By.xpath("//a[1]//span[2]//span[3]");
    private By lowestTodayWeatherHidden = By.xpath("/html[1]/body[1]/div[6]/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]");
    private By highestTodayWeatherHidden = By.xpath("/html[1]/body[1]/div[6]/div[2]/div[1]/div[2]/div[1]/span[3]/span[1]");
    private By timeOfTheDay = By.xpath("//div[@id='timeline']//div[@class='hours']");
    private By expandWeather = By.xpath("//body[@class='forecast']/div[@id='week']/a[1]");

    public void checkTheWeather(){
        List<WebElement> temperatures = SharedSD.getDriver().findElements(dailyTemperature);
        List<String> temprs = new ArrayList<>();
        String text = SharedSD.getDriver().findElement(currentTemperature).getText();
        String[] split = text.split("˚");
        String current = split[0];
        int currentint = Integer.parseInt(current);

        for (WebElement temp : temperatures){
            temprs.add(temp.getText());
        }
        for (String tempr: temprs){
            String [] splitDaily = tempr.split("°");
            String spDaily = splitDaily[0];
            int dailyint = Integer.parseInt(spDaily);
            int currentMinusDaily=(currentint - dailyint);
            Assert.assertTrue(currentMinusDaily < Math.abs(10));

        }
    }
    public void clickOnTodayExpandButton(){


        JavascriptExecutor js = (JavascriptExecutor) SharedSD.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", SharedSD.getDriver().findElement(expandWeather));
		js.executeScript("arguments[0].click();",SharedSD.getDriver().findElement(expandWeather));

    }

    public void compareTodaysWeather(){
       String one = SharedSD.getDriver().findElement(lowestTodayWeatherHidden).getText();
       String two = SharedSD.getDriver().findElement(highestTodayWeatherHidden).getText();
       String three = SharedSD.getDriver().findElement(lowestTodayWeatherShown).getText();
       String four = SharedSD.getDriver().findElement(highestTodayWeatherShown).getText();
        String [] splitLoHi = one.split("˚");
        String [] splitHiHi = two.split("˚");
        String [] splitLoSho = three.split("˚");
        String [] splitHiSho = four.split("˚");
        String loSho = splitLoSho[0];
        String hiSho = splitHiSho[0];
        String loHi = splitLoHi[0];
        String hiHi = splitHiHi[0];

        int intLoSho = Integer.parseInt(loSho);
        int intHiSho = Integer.parseInt(hiSho);
        int intLoHi = Integer.parseInt(loHi);
        int intHiHi = Integer.parseInt(hiHi);

        Assert.assertEquals(intLoHi,intLoSho);
        Assert.assertEquals(intHiHi,intHiSho);



    }

    public void timeIncr(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh");
        Date date = new Date();
        String  current = dateFormat.format(date);
        int currentInt = Integer.parseInt(current);
        ArrayList<Integer> incCurrent = new ArrayList<>();
        for(int i = currentInt; i<12; i+=2){
            if(currentInt == 12){
                incCurrent.add(currentInt-2);
            }
            incCurrent.add(currentInt);
        }
        incCurrent.remove(0);
        List<WebElement> times = SharedSD.getDriver().findElements(timeOfTheDay);
        List<String> timeList = new ArrayList<>();
        List<Integer> timeInt = new ArrayList<>();
        for (WebElement time : times){
            timeList.add(time.getText());
        }
        for(String timelst : timeList){
            if(!timelst.contains("Now")) {
                String[] splitAmPm = timelst.split("p|a");
                String split = splitAmPm[0];
                int tiInt = Integer.parseInt(split);
                timeInt.add(tiInt);


            }


        }
        Collections.sort(incCurrent);
        Collections.sort(timeInt);
        Assert.assertEquals(incCurrent.toArray(),timeInt.toArray());

        }


    }




