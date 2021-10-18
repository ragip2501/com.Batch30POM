package test.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_pages extends TestBase {

    //// amazon sayfasina gidip
    //// nutella icin arama yapin
    //// sonuc sayisini yazdirin ve sonuc yazisinin nutella icerdigini test edin

    @Test
    public void test(){

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella");

    }
}
