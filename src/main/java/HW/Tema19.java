package HW;

import java.util.List;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Tema19 extends BaseTest {

    @Test
    public void checkForest() {
        List<WebElement> categories = driver.findElements(By.cssSelector("ul[class*=sc_tabs_titles] a"));
        WebElement theForest = driver.findElement(By.linkText("The forest"));
        for (WebElement i : categories) {
            i.click();
            System.out.println(i.getText());
            assertTrue(theForest.isDisplayed());
        }

        theForest.click();
        String URL = driver.getCurrentUrl();
        assertEquals(URL, "https://keybooks.ro/shop/the-forest/");
    }
}
