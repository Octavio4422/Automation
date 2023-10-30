package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Objects;
import java.util.logging.Logger;

public class AppTest {
    public Logger log = Logger.getLogger(String.valueOf(AppTest.class));

    @Test
    @Parameters({"string1", "string2"})
    public void testParameters(String a, String b){
        log.info(a);
        log.info(b);
        Assert.assertEquals(a, "Hello");
        Assert.assertEquals(b, "Octavio");
    }

    @DataProvider(name="translateHello")
    public static Object [][] inputData(){
        return new Object[][] {{"Hello"}, {"Hola"}, {"Ciao"}};
    }

    @Test(dataProvider="translateHello")
    public void testTranslations(String data){
        log.info(data);
    }
}
