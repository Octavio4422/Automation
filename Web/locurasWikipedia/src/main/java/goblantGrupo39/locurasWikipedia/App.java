package goblantGrupo39.locurasWikipedia;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main( String[] args ){
    	Scanner sc = new Scanner(System.in);
    	String pathChrome = "/home/octavio/Downloads/mvn/chromedriver-linux64/chromedriver";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://wikipedia.org/");
       
//        WebElement cuadrito = driver.findElement(By.id("searchInput"));   
        WebElement cuadrito = driver.findElement(By.xpath("/html/body/div[3]/form/fieldset/div/input"));
        WebElement botoncito = driver.findElement(By.xpath("/html/body/div[3]/form/fieldset/button"));
        cuadrito.sendKeys("Menem");
        botoncito.click();
        
        if(driver.getTitle() == "Microsoft") {
        	System.out.println("Felicidades");
        } else {
        	System.out.println("Aguante memen");
        }
        
        sc.next();
        
        
        driver.quit();
    }
}
