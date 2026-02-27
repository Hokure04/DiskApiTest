package org.example.Pages;

import org.example.Elements.Button;
import org.example.Elements.InputField;
import org.openqa.selenium.By;

public class LoginForm extends BasePage{

    private final InputField emailInput = new InputField(By.xpath("//input[@data-testid='text-field-input']"));
    private final Button signInButton = new Button(By.xpath("//button[@data-testid= 'add-user-next']"));

    public LoginForm(){
        super(By.xpath(""));
    }

    public void login(String email){
        emailInput.inputText(email);
        signInButton.click();
    }


}
