package goblantGrupo39.locurasWikipedia;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class WikiTest {

    Scanner sc = new Scanner(System.in);
    WebDriver driver = null;

    @Test
    public void setUpDriver(){
        String driverPath = "O:\\Octavio\\QA-A\\Automation\\Web\\locurasWikipedia\\utils\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        driver.navigate().to("https://www.wikipedia.org/");

        WebElement searchInput = driver.findElement(By.id("searchInput"));
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[3]/form/fieldset/button"));
        searchInput.sendKeys("Microsoft");
        searchButton.click();

        Assert.assertEquals(driver.getTitle(), "Microsoft - Wikipedia");
        driver.close();
    }

}
