package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.fleetPage;
import com.Vytrack.pages.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class jsExec extends TestBase{




    @Test()
    @Environment(url = "_url")
    public void jsTest(){


        BrowserUtils.waitFor(3);

        WebElement ac = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        ac.click();

        BrowserUtils.waitFor(3);


        WebElement nba = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/footer/div/div/section[2]/ul/li[1]/a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        BrowserUtils.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView(true);"+"arguments[0].click()",nba);
        BrowserUtils.waitFor(3);










    }


}
