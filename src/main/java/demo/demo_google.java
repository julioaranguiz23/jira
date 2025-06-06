package demo;

import java.io.File;
import java.nio.file.Files;
import java.util.UUID;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demo_google {
    public static void main(String[] args) throws Exception {
        //System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        String titulo = driver.getTitle();
        System.out.println("Título de la página: " + titulo);
        Assert.assertEquals("Google", titulo);
        Thread.sleep(2000);
        driver.quit();
    }
}
