package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class keyPressesPage {

    public keyPressesPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "result")
    public WebElement result;
}
