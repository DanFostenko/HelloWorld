package mypackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\bfostenko\\IdeaProjects\\TestProject\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bfostenko\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");

        WebDriver driver1 = new FirefoxDriver();
        driver1.manage().window().maximize();
        driver1.get("https://www.seleniumhq.org");

        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://www.seleniumhq.org");

        driver1.quit();
        driver2.quit();
    }
}
