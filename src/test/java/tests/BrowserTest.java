package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest {

    WebDriver driver;

    @Parameters("browser")
    @Test
    public void openGoogle(String browser) throws Exception {

        if(browser.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

        }

        else{

            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();

        }

        driver.get("https://www.google.com");

        System.out.println(browser+" opened successfully");

        Thread.sleep(3000);

        driver.quit();

    }

}