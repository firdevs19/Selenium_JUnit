package tests.day08_iFrame_windows_actionsClass;

import org.junit.Assert;
import org.openqa.selenium.WindowType;
import utilities.TestBaseQuit;

public class C03_SwitchingWindow extends TestBaseQuit {

    public void test01(){

        driver.get("https://www.amazon.com");
        String wHDAmazon = driver.getWindowHandle();
        bekle(2);

        // yeni bir tab olarak amazon a gidelim

        driver.switchTo().newWindow(WindowType.TAB).get("https//www.wisequarter.com");
        String wHDWise = driver.getWindowHandle();
        bekle(2);

        // yeni bir sayfa olarak youtube a gidin.

        driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.youtube.com");
        String wHDYoutube = driver.getWindowHandle();
        bekle(2);

        // amazonun acik oldugu sayfaya donun ve url nin amazon icerdigini test edin
        driver.switchTo().window(wHDAmazon);
        String expectedUrl ="amazon";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


        // wise quarter in acik oldugu sayfaya gidin ve title in wise icerdigini test edin
        driver.switchTo().window(wHDWise);
        String expectedTitle = "Wise";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        // youtube un acik oldugu sayfaya gidin ve url nin youtube icerdigini test edin.
        driver.switchTo().window(wHDYoutube);
        expectedUrl ="youtube";
        actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


    }
}
