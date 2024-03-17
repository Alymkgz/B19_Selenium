package selenium.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

public class SeleniumBasics_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.get("file:///Users/azanbaevalym/Desktop/Batch%2019%20HTML/B19FirstHTML.html");
        driver.manage().window().maximize();

        String pageSource = driver.getPageSource();
        System.out.println("page source " + pageSource);

        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();
        driver.navigate().refresh();

        driver.close(); // will close only the one that driver is looking at
        driver.quit(); //  will shut down all the browsers that were opened with selenium


    }
}
