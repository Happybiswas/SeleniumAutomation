package Amazon;

import org.openqa.selenium.By;
import org.seleniumhq.jetty9.io.ByteBufferPool;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {


    @Test
    public void testPageTitle() {
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");
    }


    @Test
    public void testCheckSearchBox() {
        checkSearchBox();
        String expectedText = "\"Mask\"";
        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    @Test
    public void testlickAllSearchButton()  {
       // checkSearchBox();
        clickAllSearchButton();
        String expectedText = "Trending";
        String actualText = driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(1) > div")).getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");

    }
    @Test
   public void testClickOnFashionTab(){
        //calling this method with method name
        ClickOnFashionTab();
        String expectedText = "New Arrivals";
        String actualText = driver.findElement(By.xpath("//*[@id=\"sobe_d_b_4_5\"]/a")).getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");


    }
 @Test
    public  void testAccountList(){
        //calling this method with method name
        AccountList();
        String expectedText = "Sign-In";
        String actualTest = driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/h1")).getText();
        Assert.assertEquals(actualTest, expectedText, "page does not match");


    }

   @Test
    public void testselectYourAddress() {
       selectYourAddress();
       String expectedText = "Choose your location";
       String actualTest = driver.findElement(By.id("a-popover-header-3")).getText();
       Assert.assertEquals(actualTest, expectedText, "page does not match");
    }
}

