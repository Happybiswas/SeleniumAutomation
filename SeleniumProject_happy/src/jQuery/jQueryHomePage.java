package jQuery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jQueryHomePage {
    WebDriver driver;
    String jQuerynUrl = "https://jqueryui.com/";



    @BeforeMethod
    public void setup() {

        String chromeDriverPath = "Browser/Windows/chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get(jQuerynUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
@Test
    public void demos() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[1]")).click();
        Thread.sleep(5000);
        String actualTest = driver.findElement(By.className("entry-title")).getText();
        System.out.println(actualTest);
    }

    @Test
    public void apiDocumentation() throws InterruptedException {
        //demos();
        driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[3]/a")).click();
        Thread.sleep(5000);
        String actualTest = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
        System.out.println(actualTest);


    }
@Test
    public void JQueryUi() throws InterruptedException {
        apiDocumentation();
        driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/a")).click();
        Thread.sleep(5000);
        String actualTest = driver.findElement(By.xpath("//*[@id=\"post-2\"]/header/h1/a")).getText();
        System.out.println(actualTest);

    }
@Test
    public void AccordionWidget() throws InterruptedException {

        JQueryUi();

        driver.findElement(By.xpath("//*[@id=\"post-2\"]/header/h1/a")).click();
        Thread.sleep(5000);
        String actualTest = driver.findElement(By.xpath("//*[@id=\"accordion1\"]/div/p/strong")).getText();
        System.out.println(actualTest);


    }
@Test
    public void example() throws InterruptedException {
        AccordionWidget();
        driver.findElement(By.xpath("//*[@id=\"quick-nav\"]/header/h2/a")).click();
        Thread.sleep(5000);
        String actualTest = driver.findElement(By.xpath("//*[@id=\"example-0\"]/p")).getText();
        System.out.println(actualTest);


    }
    @Test
    public void support(){
        driver.findElement(By.cssSelector("#menu-top > li:nth-child(6) > a")).click();

    }
@Test
    public void entryTitle(){
    support();
        driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/a")).click();
    }


}
