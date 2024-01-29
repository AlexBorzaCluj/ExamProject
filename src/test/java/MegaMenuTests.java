import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MegaMenu;

import java.util.concurrent.TimeUnit;

public class MegaMenuTests extends BasePage {

    private MegaMenu megaMenu;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        megaMenu = new MegaMenu(driver);
    }

    @Test
    public void megaMenuAppleSubMenuSelection() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        megaMenu.megaMenuHover();
        megaMenu.megaMenuAppleSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "Apple");
    }

    @Test
    public void megaMenuHTCSubMenuSelection() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        megaMenu.megaMenuHover();
        megaMenu.megaMenuHTCSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "HTC");
    }

    @Test
    public void megaMenuLGSubMenuSelection() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        megaMenu.megaMenuHover();
        megaMenu.megaMenuLGSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "LG");
    }

    @Test
    public void megaMenuNokiaSubMenuSelection() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        megaMenu.megaMenuHover();
        megaMenu.megaMenuNokiaSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "Nokia");
    }

    @Test
    public void megaMenuSamsungSubMenuSelection() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        megaMenu.megaMenuHover();
        megaMenu.megaMenuSamsungSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "Samsung");
    }

    @Test
    public void megaMenuAppleMacbookSubMenuSelection() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        megaMenu.megaMenuHover();
        megaMenu.megaMenuAppleMacbookSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "Apple Macbook");
    }

    @Test
    public void megaMenuAsusSubMenuSelection() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        megaMenu.megaMenuHover();
        megaMenu.megaMenuAsusSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "Asus");
    }

    @Test
    public void megaMenuHPSubMenuSelection() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        megaMenu.megaMenuHover();
        megaMenu.megaMenuHPSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "HP");
    }

    @Test
    public void megaMenuLenovoSubMenuSelection() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        megaMenu.megaMenuHover();
        megaMenu.megaMenuLenovoSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "Lenovo");
    }

    @Test
    public void megaMenuXiomiSubMenuSelection() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        megaMenu.megaMenuHover();
        megaMenu.megaMenuXiomiSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "Xiomi");
    }

}
