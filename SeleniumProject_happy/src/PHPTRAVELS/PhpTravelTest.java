package PHPTRAVELS;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhpTravelTest extends PhpHomePage {


@Test
    public void testPricing() throws InterruptedException {
        Pricing();
        String expectedTest= "Plans and prices";
         String actualText =driver.findElement(By.xpath("//*[@id=\"Main\"]/div[6]/div/div[1]/section/div[1]/div[1]/div[1]")).getText();
        Assert.assertEquals(actualText,expectedTest,"Product does not match");

    }
    /*@Test
    public void testproduct() throws InterruptedException {
       product();
        String expectedResults = "Product services";
        String  actualResults= driver.findElement(By.id("header-title")).getText();
        Assert.assertEquals(actualResults,expectedResults,"Product does not match");

    }

     */
   @Test
    public void testIntegrations(){
        Integrations();
        String expectedResults = "Checkout Below Which 3rd Party Services Integrated With Us!";
        String  actualResults = driver.findElement(By.id("header-description")).getText();
        Assert.assertEquals(actualResults,expectedResults,"Product does not match");



    }

}

