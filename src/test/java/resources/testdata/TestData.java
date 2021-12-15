package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * By Naresh Savalia
 */

public class TestData  {

    @DataProvider(name = "authentications")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"","123456","An email address required."},
                {"abcd@gmail.com","","Password is required."},
                {"adfdfgfg","123456","Invalid email address."},
                {"abcd@gmail.com","123456","Authentication failed."}

        };
        return data;
    }
    @DataProvider(name = "productdata")
    public Object[][] getProductData() {
        Object[][] data = new Object[][]{
                {"Blouse","2","M","White"},
                {"Printed Dress","3","L","Orange"},
                {"Printed Chiffon Dress","4","S","Green"},
                {"Printed Summer Dress with Price $28.98","2","M","Blue"}


        };
        return data;
    }

}
