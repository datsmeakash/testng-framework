package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
        driver.get("http://www.amazon.com/");
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("field-keywords")));
        WebElement element = driver.findElement(By.name("field-keywords"));
        element.sendKeys("iPhone 6");
        element.submit();
        Thread.sleep(3000);

        Assert.assertEquals("Amazon.com: iPhone 6 - Cell Phones: Cell Phones & Accessories", driver.getTitle());
    }
}
