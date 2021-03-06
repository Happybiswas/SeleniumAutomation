package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoHomePage {
    WebDriver driver;
    String AutomationUrl = "http://automationpractice.com/index.php";

    @BeforeMethod
    public void setup() {


        String chromeDriverPath = "Browser/Windows/chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
         driver = new ChromeDriver();
         driver.get(AutomationUrl);

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }

public void contactUs(){
   // driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
   String actualText = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
    System.out.println(actualText);
}

@Test
public void singIn(){
        driver.findElement(By.className("login")).click();
        String actualText = driver.findElement(By.className("page-heading")).getText();
        System.out.println(actualText);
}


@Test
public void accountCreation(){
    singIn();
        driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("happydas1986@yahoo.com");
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
        String actualText = driver.findElement(By.className("page-heading")).getText();
        System.out.println(actualText);

}

public void registration(){
    singIn();
    accountCreation();
        driver.findElement(By.id("uniform-id_gender2")).isSelected();
        driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("jutika");
        driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("roy");
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("52544");
}




    @AfterMethod
    public void tearDown () {
        // driver.close();
        //driver.quit();

    }


}


