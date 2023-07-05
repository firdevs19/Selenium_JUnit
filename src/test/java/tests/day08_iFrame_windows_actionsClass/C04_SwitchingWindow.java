package tests.day08_iFrame_windows_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseQuit;

import java.util.Set;

public class C04_SwitchingWindow extends TestBaseQuit {

    @Test

    public void test01(){

        //● https://the-internet.herokuapp.com/windows adresine gidin.

        driver.get("https://the-internet.herokuapp.com/windows ");

        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement openingYaziElementi = driver.findElement(By.tagName("h3"));
        String expectedYazi = "Opening a new window";
        String actualYazi = openingYaziElementi.getText();
        Assert.assertEquals(expectedYazi,actualYazi);

        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.

        String expectedTitle = "The Internet";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

        // gorevde bu sayfaya geri donus oldugu icin handle degerini kaydedelim

        String ilkSayfaWHD = driver.getWindowHandle();
        System.out.println(ilkSayfaWHD);


        //● Click Here butonuna basın.
        driver.findElement(By.xpath("//[*text()='Click Here']")).click();


        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.

        /*
            KONTROLUMUZ disinda yeni bir tab veya window acilinca
            driver otomatik olarak oraya gecmez.

            Yeni sayfaya gecebilmek icin ikinci sayfanin Window Handle degerini bulmaliyiz
            Bunun icin

            1- ilk sayfada iken ilk sayfaWHD ini kaydedin
            2- yeni sayfayi acan linki tiklayalim
            3- ilk ve ikinci sayfanin window Handle Degerlerini bir Set olarak kaydedelim
                Set<String> wHDSeti = driver.getWindowHandles():
            4- Bir for-each loop ile Set deki window handle degerlerini
               ilk sayfanin window handle degeri ile karsilastiralim
               ilkSayfaWHD ne esit OLMAYAN handle degerini
               ikinciSayfaWHD olarak kaydedelim
           5- buldugumuz ikinciSayfaWHD ni kullanarak 2. sayfaya gecelim.

         */

        Set<String> wHDSeti = driver.getWindowHandles();
        System.out.println(wHDSeti);

        String ikinciSayfaHandle = "";
        for (String each :wHDSeti
             ) {

            if (!each.equals(ilkSayfaWHD)){
                ikinciSayfaHandle=each;
            }

        }


        driver.switchTo().window(ikinciSayfaHandle);
        expectedTitle = "New Window";
        actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);


        //● Sayfadaki textin “New Window” olduğunu doğrulayın.

        WebElement yaziElementi = driver.findElement(By.tagName("h3"));
        expectedYazi = "New Window";
        actualYazi =yaziElementi.getText();
        Assert.assertEquals(expectedYazi,actualYazi);

        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.

        driver.switchTo().window(ilkSayfaWHD);
        expectedTitle = "The Internet";
        actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);





    }
}
