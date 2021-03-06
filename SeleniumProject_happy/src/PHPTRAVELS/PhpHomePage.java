package PHPTRAVELS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class PhpHomePage {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        String chromeDriverPath = "Browser/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
         driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }



    public void Pricing() {
        driver.findElement(By.xpath(" /html/body/header/div/nav/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"Main\"]/div[6]/div/div[1]/section/div[1]/div[1]/div[1]")).getText();
        System.out.println("Plans and prices");

    }


   public void product() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/header/div/nav/div[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/header/div/nav/div[2]/div/a[1]")).click();

        driver.findElement(By.id("header-title")).getText();
        System.out.println("Product services");
   }

   public void Integrations(){
        driver.findElement(By.xpath("/html/body/header/div/nav/a[3]")).click();
        driver.findElement(By.id("header-description")).getText();
        System.out.println("Checkout Below Which 3rd Party Services Integrated With Us!");

   }

}
