package sortable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sortableHomePage {

    WebDriver driver;
    String jQuerynUrl = "https://sortablejs.github.io/Sortable/";



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
    public void simpleList(){
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/li[1]/a")).click();
        String actualResult = driver.findElement(By.xpath("//*[@id=\"simple-list\"]/h4")).getText();
        System.out.println(actualResult);
    }
@Test
    public void grid(){
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/li[8]")).click();
        String actualResult = driver.findElement(By.xpath("//*[@id=\"grid\"]/h4")).getText();
        System.out.println(actualResult);
    }
@Test
    public void comparision(){
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/h5[4]/a")).click();
        String actualTest = driver.findElement(By.xpath("//*[@id=\"comparisons\"]/h2")).getText();
        System.out.println(actualTest);
    }
    @Test
    public void frameWork(){
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/h5[5]/a")).click();
    }

  @Test
    public void reactSortableJs(){
        frameWork();
        driver.findElement(By.xpath("/html/body/div/div[21]/h3[4]/a")).click();
        //String actualTest = driver.findElement(By.xpath("//*[@id=\"readme\"]/div[3]/article/h1/code")).getText();

       // System.out.println(actualTest);


    }
}
