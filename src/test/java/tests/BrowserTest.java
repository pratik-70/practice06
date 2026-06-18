package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest {

    WebDriver driver;

    @Parameters("browser")
    @Test
    public void openGoogle(String browser) {

        if(browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");

            driver = new ChromeDriver(options);

        }

        else {

            WebDriverManager.firefoxdriver().setup();

            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless");

            driver = new FirefoxDriver(options);

        }

        driver.get("https://www.google.com");

        System.out.println(browser + " working");

        driver.quit();
    }
}