package org.example;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BaseTest extends Utils {

    BrowserPage browserPage = new BrowserPage();

    @BeforeMethod
    public void setUp(){
        browserPage.openBrowser();
    }

    @AfterMethod
    public void tearDown(){
        browserPage.closeBrowser();
    }
}
