package jQuery;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JQueryTestPge extends jQueryHomePage {



   @Test
    public void testdemos() throws InterruptedException {
    demos();
       String expectedText= "jQuery UI Demos";
        String actualText = driver.findElement(By.className("entry-title")).getText();
       Assert.assertEquals(actualText,expectedText,"page does no match");

    }
    @Test
    public void testapiDocumentation() throws InterruptedException {
        apiDocumentation();
        String expectedText = "jQuery UI 1.12 API Documentation";
        String actualText  = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
        Assert.assertEquals(actualText,expectedText,"page does no match");



    }

    @Test
    public void testJQueryUi() throws InterruptedException {

        JQueryUi();
        String expectedText = "Accordion Widget";
        String actualTest = driver.findElement(By.xpath("//*[@id=\"post-2\"]/header/h1/a")).getText();
        Assert.assertEquals(actualTest,expectedText,"page does no match");


    }
@Test
    public void testexample() throws InterruptedException {
       example();
        String expectedText = "A simple jQuery UI Accordion";
        String actualTest = driver.findElement(By.xpath("//*[@id=\"example-0\"]/p")).getText();
        Assert.assertEquals(actualTest,expectedText,"page does no match");



    }

}
