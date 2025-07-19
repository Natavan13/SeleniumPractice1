package part2.com.saucedemo.tests.products;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTests;

public class ProductsTest extends BaseTests {
    @Test
    public void testProductsHeaderIsDisplayed(){
        loginPage.loginIntoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductsPageHeaderDisplayed(), "\nProducts page header is not displayed\n");
    }
}
