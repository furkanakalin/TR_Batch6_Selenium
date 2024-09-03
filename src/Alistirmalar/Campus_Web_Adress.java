package Alistirmalar;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Campus_Web_Adress extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://test.mersys.io/");
        MyFunc.Bekle(2);

        WebElement username = driver.findElement(By.id("mat-input-0"));
        username.sendKeys("Student_3");
        MyFunc.Bekle(1);

        WebElement password = driver.findElement(By.id("mat-input-1"));
        password.sendKeys("S12345");
        MyFunc.Bekle(1);

        WebElement girisbutonu = driver.findElement(By.className("submit-button"));
        girisbutonu.click();
        MyFunc.Bekle(1);
        driver.manage().window().maximize();


        WebElement hamburger = driver.findElement(By.className("mat-mdc-menu-trigger"));
        hamburger.click();
        MyFunc.Bekle(1);

        List<WebElement> elements=driver.findElements(By.className("mat-mdc-menu-item"));

        WebElement finance =elements.get(1);
        finance.click();
        MyFunc.Bekle(1);

        WebElement myfinance = driver.findElement(By.xpath("//button//span[contains(text(), 'My Finance')]"));
        myfinance.click();
        MyFunc.Bekle(1);


        List<WebElement> elements1 =driver.findElements(By.className("mat-mdc-tooltip-trigger"));

        WebElement ilkgoz = elements1.get(13);
        ilkgoz.click();
        MyFunc.Bekle(1);

        WebElement stripe = driver.findElement(By.id("mat-radio-8-input"));
        stripe.click();
        MyFunc.Bekle(1);

        WebElement payamount = driver.findElement(By.id("mat-radio-13-input"));
        payamount.click();
        MyFunc.Bekle(10);

        /*WebElement pay = driver.findElement(By.id("mat-radio-10-input"));
        pay.click();
        MyFunc.Bekle(1);

        List<WebElement> elements2=driver.findElements(By.className("mat-mdc-input-element"));

        WebElement amount=elements2.get(3);
        amount.sendKeys("5000");
        MyFunc.Bekle(1);

        WebElement payagain = driver.findElement(By.id("mat-radio-10-input"));
        payagain.click();
        MyFunc.Bekle(1);

        List<WebElement>elements3=driver.findElements(By.className("mdc-button__label"));

        WebElement payclick=elements3.get(15);
        payclick.click();
        MyFunc.Bekle(1);*/

        List<WebElement>elements2= driver.findElements(By.className("p-Input-input"));

        WebElement cardnumber=elements2.get(0);
        cardnumber.sendKeys("1515 2020 3030 4040");
        MyFunc.Bekle(1);




        driver.quit();


    }
}
