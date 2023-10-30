package utiils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {
    private WebDriver driver;

    public MyDriver (String browser){
        if("chrome".equalsIgnoreCase(browser)){
            String path = System.getProperty("user.dir");
            System.out.println(path);
            System.setProperty("webdriver.chrome.driver", "O:\\Octavio\\QA-A\\Automation\\Web\\Demoblaze\\src\\drivers\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }
    }
    public WebDriver getDriver() {
        return driver;
    }
}
