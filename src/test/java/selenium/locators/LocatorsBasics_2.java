package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsBasics_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/azanbaevalym/Desktop/Batch%2019%20HTML/B19FirstHTML.html");
        driver.manage().window().maximize();

        WebElement firstNane = driver.findElement(By.id("fname"));
        firstNane.sendKeys("Bruce");

        WebElement lastName = driver.findElement(By.name("lname"));
        lastName.sendKeys("Lee");

        WebElement bDate = driver.findElement(By.id("bdate"));
        bDate.sendKeys("01/06/2022");

        WebElement emailUser = driver.findElement(By.id("email"));
        emailUser.sendKeys("lv@gmail.com");

        WebElement quantity = driver.findElement(By.id("quantity"));
        quantity.sendKeys("100");

        driver.findElement(By.id("Dr")).click();

        WebElement paragraph =  driver.findElement(By.tagName("p"));
        System.out.println(paragraph.getText());

        WebElement clickHere = driver.findElement(By.partialLinkText("click"));
        clickHere.click();



    }
}
