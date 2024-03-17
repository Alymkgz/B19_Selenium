package selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DriverHelper {

    // Singleton pattern design
    private static WebDriver driver; // encapsulation

    private DriverHelper() {
    } // encapsulation


    public static WebDriver getDriver() {
        if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {
            switch (ConfigReader.readProperty("browser")) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    driver = new FirefoxDriver();

                case "edge":
                    driver = new EdgeDriver();

                case "safari":
                    driver = new SafariDriver();

                default:
                    driver = new ChromeDriver();
                    break;


            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

           return driver;
    }
}