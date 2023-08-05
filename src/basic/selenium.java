package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium
{
    public static void main(String[] args) throws InterruptedException {
        // Specify the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "E:\\soft testing\\Velocity notes\\Selenium\\chromedriver\\chromedriver.exe");

        // Create an instance of ChromeDriver (WebDriver)
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();
        

    }

}
