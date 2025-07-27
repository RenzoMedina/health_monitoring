package com.ejemplo;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class UserTest {
    
    @Test
    public void testViewInformation() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu"); 
        options.addArguments("--window-size=1920,1080");
        
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        
        WebElement input = driver.findElement(By.name("my-text"));
        input.sendKeys("58.0");
        
        WebElement submit = driver.findElement(By.cssSelector("button"));
        submit.click();

        System.out.println("¡Su peso ha sido actualizado!");

        driver.quit();
    }
    
    @Test
    @Tag("regression")
    public void testCurrentWeight() {
        //
        User user = new User("John", 70.0);
        user.updateWeight(58.0);
        assertTrue(user.getWeight() == 58.0, "Weight should be updated to 69.0");
    }
}
