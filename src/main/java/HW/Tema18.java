package HW;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Tema18 extends BaseTest {
  @Test(priority = 1)
  public void clickLogin() {

    driver.findElement(By.linkText("Login")).click();
  }

  @Test(dependsOnMethods = "clickLogin")
  public void checkFields() {

    JavascriptExecutor jse = (JavascriptExecutor) driver;

    WebElement login = driver.findElement(By.id("log"));
    assertTrue(login.isDisplayed());
    jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid	red')", login);

    WebElement password = driver.findElement(By.id("password"));
    assertTrue(password.isDisplayed());
    jse.executeScript("arguments[0].setAttribute('style', 'border:4px solid	red')", password);
  }
}
