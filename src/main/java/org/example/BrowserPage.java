package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

// browser page.
//Current browser is chrome. Depending on the browser we can add dependency and updated accordingly
public class BrowserPage extends Utils {

String browser = "Chrome";

public void openBrowser(){
if (browser.equalsIgnoreCase("chrome"))
{
    System.out.println("Your browser is Chrome");
    driver = new ChromeDriver();
}
else{
    System.out.println("Wrong Browser");
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://demo.nopcommerce.com/");

}

public void closeBrowser(){
driver.quit();
}

}
