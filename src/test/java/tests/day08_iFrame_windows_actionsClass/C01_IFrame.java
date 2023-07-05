package tests.day08_iFrame_windows_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_IFrame  extends TestBase {
    //1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
    // 2 ) Bir metod olusturun: iframeTest
    // - “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.
    // - Text Box’a “Merhaba Dunya!” yazin.
    // - TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu dogrulayin ve  konsolda yazdirin.

    @Test
    public void test01(){
        //1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get(" https://the-internet.herokuapp.com/iframe");

        // 2 ) Bir metod olusturun: iframeTest

        // - “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.
        WebElement anIframeElementi = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(anIframeElementi.isEnabled());
        System.out.println(anIframeElementi.getText());

        // - Text Box’a “Merhaba Dunya!” yazin.

        WebElement iFrameElementi = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iFrameElementi);
        WebElement textBoxElementi = driver.findElement(By.tagName("p"));
        textBoxElementi.clear();
        textBoxElementi.sendKeys("Merhaba Dunya");

        /*
            Bir iFrame e gecis yapildiysa
            normal sayfada islem yapilamaz
            normal sayfada islem yapmak isterseniz
            iFrame den cikmaniz gerekir.

            defaultContent() : ana sayfaya cikar.
            parentFrame() : eger ic ice iFrammeler varsa, bir ust Iframe cikar.

         */

        driver.switchTo().defaultContent();

        // - TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu dogrulayin ve  konsolda yazdirin.
        WebElement elementalSeleniumElementi = driver.findElement(By.xpath("//*[text() ='Elemental Selenium']"));
        Assert.assertTrue(elementalSeleniumElementi.isDisplayed());
        System.out.println(elementalSeleniumElementi.getText() );

        bekle(3);


    }




    }



