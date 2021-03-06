package AutomationPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutoUnitTest extends AutoHomePage {



   // public void

@Test
    public void testcontactUs() {
    contactUs();
        String expectedText = "CUSTOMER SERVICE - CONTACT US";
        String actualText = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");
    }
@Test
    public void testsingIn(){
        singIn();
        String expectedText = "AUTHENTICATION";
        String actualText = driver.findElement(By.className("page-heading")).getText();
        Assert.assertEquals(actualText, expectedText, "Page Title not match");


    }
@Test
    public void testaccountCreation(){

        accountCreation();
        String expectedResult = "AUTHENTICATION";
        String actualText = driver.findElement(By.className("page-heading")).getText();
        Assert.assertEquals(actualText,expectedResult,"Text does not found ");
    }
}
