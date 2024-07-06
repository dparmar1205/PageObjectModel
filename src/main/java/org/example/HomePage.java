package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{

public void openComputerSection(){
    clickOnElement(By.linkText("Computers"));
}
}
