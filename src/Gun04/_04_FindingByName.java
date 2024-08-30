package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {
        // By.Name()
        // Senaryo: (locator olarak name kullanılacak)
        // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
        // 2-  isim kutucuğuna "ismet" yazdırınız
        // 3-  soyad kutucuğuna "temur" yazdırınız

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        driver.manage().window().maximize(); // Ekranı max yani Tam Ekran yapıyor

        WebElement ad=driver.findElement(By.name("q8_name[first]"));
        ad.sendKeys("İsmet");

        WebElement soyad=driver.findElement(By.name("q8_name[last]"));
        soyad.sendKeys("Temur");
        soyad.clear(); // kutucuğu temizler, burada kullanılmasa idi, TemurYılmaz yan yana yazacaktı
        soyad.sendKeys("Yılmaz");

        WebElement btnSubmit=driver.findElement(By.id("input_2"));
        btnSubmit.click();

        MyFunc.Bekle(5);
        driver.quit();
    }
}
