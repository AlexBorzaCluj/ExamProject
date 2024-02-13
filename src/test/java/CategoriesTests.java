import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.Categories;

import java.time.Duration;
import java.util.List;


public class CategoriesTests extends BasePage {
    private Categories categories;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        categories = new Categories(driver);
    }

    @Test
    public void laptopsCategoriesCount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[3]/div/div[2]/div/div[1]/div[2]/a/figure/div[1]/img")));
        categories.laptopsCategoryClick();
        Select drpShow = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]/div/div[4]/div/select")));
        drpShow.selectByVisibleText("100");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[6]/div/div[1]/div/div[1]/div[1]/a/div/div[1]/img")));
        List products = driver.findElements(By.className("product-thumb-top"));
        Assert.assertEquals(products.size(), 75);
    }

    @Test
    public void componentsCategoriesCount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[3]/div/div[2]/div/div[1]/div[2]/a/figure/div[1]/img")));
        categories.componentsCategoryClick();
        Select drpShow = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]/div/div[4]/div/select")));
        drpShow.selectByVisibleText("100");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[6]/div/div[1]/div/div[1]/div[1]/a/div/div[1]/img")));
        List products = driver.findElements(By.className("product-thumb-top"));
        Assert.assertEquals(products.size(), 75);
    }

    @Test
    public void tabletsCategoriesCount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[3]/div/div[2]/div/div[1]/div[2]/a/figure/div[1]/img")));
        categories.tabletsCategoryClick();
        Select drpShow = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]/div/div[4]/div/select")));
        drpShow.selectByVisibleText("100");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[6]/div/div[1]/div/div[1]/div[1]/a/div/div[1]/img")));
        List products = driver.findElements(By.className("product-thumb-top"));
        Assert.assertEquals(products.size(), 75);
    }

    @Test
    public void softwareCategoriesCount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[3]/div/div[2]/div/div[1]/div[2]/a/figure/div[1]/img")));
        categories.softwareCategoryClick();
        Select drpShow = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[4]/div/div[4]/div/select")));
        drpShow.selectByVisibleText("100");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[6]/div/div[1]/div/div[1]/div[1]/a/div/div[1]/img")));
        List products = driver.findElements(By.className("product-thumb-top"));
        Assert.assertEquals(products.size(), 75);
    }
    }

