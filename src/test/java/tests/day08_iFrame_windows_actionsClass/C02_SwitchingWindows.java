package tests.day08_iFrame_windows_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;
import utilities.TestBaseQuit;

public class C02_SwitchingWindows extends TestBaseQuit {

    @Test

    public void test01(){

        // amazon ana sayfaya gidin

        driver.get("https://amazon.com");
        // url nin amazon icerdigini test edin
        String expectedUrl ="amazon";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        bekle(2);

        // Yeni bir tab olarak wise quarter anasayfaya gidin
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.wisequarter.com");

        // title in Wise icerdigini test edin
        String expectedTitle = "Wise";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        bekle(2);

        // yeni bir window acarak youtube sayfasina gidin
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.youtube.com");
        // url'in youtube icerdigini test edin

        expectedUrl ="youtube";
        actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        bekle(3);

        // acilan tum sayfalari kapatin





    }

}
