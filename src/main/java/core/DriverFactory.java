package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {


    private static WebDriver driver;

    public void iniciarDriver(){
        driver = new ChromeDriver();
       // driver = new FirefoxDriver();
    }

    public WebDriver pegaDriver(){
        return driver;
    }
}
