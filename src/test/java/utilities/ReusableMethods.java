package utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class  ReusableMethods {

    public static String ikinciSayfaWHD(String IlkSayfaWindowHandleDegeri, WebDriver driver){

        String ikinciSayfaWHD="";

        Set<String> windowHandleSeti =driver.getWindowHandles();

        for (String each:windowHandleSeti
             ) {
            if(!each.equals(IlkSayfaWindowHandleDegeri)){

                ikinciSayfaWHD=each;
            }

        }

        return ikinciSayfaWHD;
    }
}
