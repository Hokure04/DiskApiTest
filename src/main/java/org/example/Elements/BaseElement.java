package org.example.Elements;

import org.example.Driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class BaseElement {

    private By locator;

    public BaseElement(By locator) {
        this.locator = locator;
    }

    public WebElement findElement() {
        return DriverManager.getDriver().findElement(locator);
    }

    public boolean isDisplayed(){
        return findElement().isDisplayed();
    }
}
