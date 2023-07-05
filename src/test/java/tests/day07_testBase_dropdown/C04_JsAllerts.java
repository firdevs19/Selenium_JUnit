package tests.day07_testBase_dropdown;

import org.junit.Test;
import utilities.TestBase;

public class C04_JsAllerts  extends TestBase {

    //1. Test
    // - https://the-internet.herokuapp.com/javascript_alerts adresine gidin
    // - 1.alert’e tiklayin
    // - Alert’deki yazinin “I am a JS Alert” oldugunu test edin
    // - OK tusuna basip alert’i kapatin
    //2.Test
    // - https://the-internet.herokuapp.com/javascript_alerts adresine gidin
    // - 2.alert’e tiklayalim
    // - Cancel’a basip, cikan sonuc yazisinin “You clicked: Cancel” oldugunu test edin
    //3.Test
    // - https://the-internet.herokuapp.com/javascript_alerts adresine gidin
    // - 3.alert’e tiklayalim
    // - Cikan prompt ekranina “Abdullah” yazdiralim
    // - OK tusuna basarak alert’i kapatalim
    // - Cikan sonuc yazisinin Abdullah icerdigini test edelim



    @Test
    public void test01(){

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

}
