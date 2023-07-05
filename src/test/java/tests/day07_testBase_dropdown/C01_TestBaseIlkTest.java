package tests.day07_testBase_dropdown;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class C01_TestBaseIlkTest extends TestBase {

    @Test

    public void test01()  {

        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));
        bekle(3);

    }
}
