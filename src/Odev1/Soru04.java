package Odev1;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru04 extends BaseDriver {

    /*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Calculate'e tıklayınız.

    İlk input'a herhangi bir sayı giriniz.

    İkinci input'a herhangi bir sayı giriniz.

Calculate button'una tıklayınız.

Sonucu alınız.

Sonucu yazdırınız.
    */

    @Test
    public void Test(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculator = driver.findElement(By.cssSelector("div[class='titledesc'] [href='calculator']"));
        calculator.click();
        MyFunc.Bekle(1);

        WebElement firstinput = driver.findElement(By.cssSelector("[name='number1']"));
        firstinput.sendKeys("7");
        MyFunc.Bekle(1);

        WebElement secondinput = driver.findElement(By.cssSelector("[name='number2']"));
        secondinput.sendKeys("37");
        MyFunc.Bekle(1);

        WebElement calculate= driver.findElement(By.cssSelector("[value='Calculate']"));
        calculate.click();
        MyFunc.Bekle(1);

        WebElement answer = driver.findElement(By.cssSelector("[id='answer']"));
        System.out.println(answer.getText());

        BekleKapat();







    }
}
