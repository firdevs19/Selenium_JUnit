package tests.day11_excelOtomasyonu;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class C01_ReadExcel {

    @Test

    public void test01() throws IOException {

        String dosyaYolu = "src/test/java/tests/day11_excelOtomasyonu/ulkeler.xlsx";
        System.out.println(System.getProperty("user.dir"));

        FileInputStream fis = new FileInputStream(dosyaYolu);


        Workbook workbook = WorkbookFactory.create(fis);

        Sheet sheet = workbook.getSheet("Sayfa1");

        Row row = sheet.getRow(3);

        Cell cell = row.getCell(3);

        System.out.println(cell);

        row=sheet.getRow(11);
        cell= row.getCell(1);

        String expectedBaskentIsmi = "Baku";
        String actualBaskentIsmi = cell.toString();
        Assert.assertEquals(expectedBaskentIsmi,actualBaskentIsmi);
    }
}
