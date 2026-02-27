package org.example.Pages;

import org.example.Elements.BaseElement;
import org.example.Elements.PageWrapper;
import org.openqa.selenium.By;

public abstract class BasePage {
    private final BaseElement baseElement;

    public BasePage(By locator){
        this.baseElement = new PageWrapper(locator);
    }

    public boolean isPageOpen(){
        return baseElement.isDisplayed();
    }
}
