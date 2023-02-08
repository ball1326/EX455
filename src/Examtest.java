import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class SE {

    @Test
    void TC1001wwNPRU()  {
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://nxtgenaiacademy.com/demo-site/");
        driver.findElement(By.xpath("//*[@id=\"vfb-5\"]")).sendKeys("Athicha");
        driver.findElement(By.xpath("//*[@id=\"vfb-7\"]")).sendKeys("Phrombut");
        driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("Samut Sakhon");
        driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys("not have");
        driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("Samut Sakhon");
        driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("Samut Sakhon");
        driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]")).sendKeys("Samut Sakhon");
        driver.findElement(By.xpath("//*[@id=\"vfb-14\"]")).sendKeys("aticha13264@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"vfb-18\"]")).sendKeys("18/07/2566");
        driver.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("0642411826");
        driver.findElement(By.id("vfb-20-0")).click();
        driver.findElement(By.id("vfb-20-1")).click();
        driver.findElement(By.id("vfb-20-2")).click();
        driver.findElement(By.id("vfb-20-3")).click();
        driver.findElement(By.id("vfb-20-4")).click();
        driver.findElement(By.id("vfb-20-5")).click();
        driver.findElement(By.xpath("//*[@id=\"vfb-23\"]")).sendKeys("Hello My like.");
        driver.findElement(By.xpath("//*[@id=\"vfb-3\"]")).sendKeys("99");
        driver.findElement(By.xpath("//*[@id=\"vfb-4\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"txt_comment\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"txt_comment\"]")).sendKeys("Heart");
//        driver.findElement(By.xpath("//*[@id=\"btn-book-appointment\"]")).click();
        //        driver.close();
    }

}