package org.example.Elements;

import org.openqa.selenium.By;

public class InputField extends BaseElement{

    public InputField(By locator){
        super(locator);
    }


    public void InputText(String text){
        findElement().sendKeys(text);
    }

    public String getText(){
        return findElement().getDomAttribute("value");
    }
}
