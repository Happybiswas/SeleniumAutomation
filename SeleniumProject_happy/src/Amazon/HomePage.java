package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
    WebDriver driver;
    String amazonUrl = "https://www.amazon.com/";
    String productName = "Mask";
    String searchBoxLocator = "twotabsearchtextbox";
    String searchButtonLocator = "nav-search-submit-button";
    String allButton = "hm-icon-label";

    @BeforeMethod
    public void setup() {
        String chromeDriverPath = "Browser/Windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get(amazonUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
    // action method

    public void checkSearchBox() {

        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        driver.findElement(By.id(searchButtonLocator)).click();
        // driver.findElement(By.className(allButton)).click();


    }

    public void clickAllSearchButton()  {

        driver.findElement(By.className(allButton)).click();
        //Thread.sleep(5000);
        String actualText = driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(1) > div")).getText();
        System.out.println(actualText);

    }

    public void ClickOnFashionTab()  {

        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
        String actualText = driver.findElement(By.xpath("//*[@id=\"sobe_d_b_4_5\"]/a")).getText();
       System.out.println(actualText);


}


    public void AccountList(){
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        String actualText = driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/h1")).getText();
        System.out.println(actualText);
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("happybiswas1983@yahoo.com");
        driver.findElement(By.className("a-button-input")).click();
        String actualTest1 = driver.findElement(By.className("a-alert-heading")).getText();
        System.out.println(actualTest1);

    }


    public void selectYourAddress(){
        driver.findElement(By.id("glow-ingress-line2")).click();
        String actualText = driver.findElement(By.id("a-popover-header-3")).getText();
        System.out.println(actualText);

    }








        @AfterMethod
        public void tearDown () {
            // driver.close();
             //driver.quit();

        }


    }
