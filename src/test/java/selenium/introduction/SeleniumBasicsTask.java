package selenium.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicsTask {
    public static void main(String[] args) {
        /*
           Create Driver object, navigate to CodeFish
           Webpage, get its title, validate with if condition
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://codefish.io/");
        driver.manage().window().maximize();
        String actual = driver.getTitle();
        String expTitle = "CodeFish";
        if (actual.equals(expTitle)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

        System.out.println("driver.getPageSource() = " + driver.getPageSource());
        driver.manage().window().minimize();
        driver.quit();


    }
}


