import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToCart;
import pages.BasePage;
import java.time.Duration;


public class AddToCartTests extends BasePage {
    private AddToCart addToCart;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        addToCart = new AddToCart(driver);
    }

    @Test
    public void addToCartOneIPhone() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        addToCart.searchBarInput("iPhone");
        addToCart.searchButtonClick();
        addToCart.firstResultHover();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[1]/div/div[1]/div[2]/button[1]/i")));
        addToCart.addOnePieceToCart();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[1]/a")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/header/div[2]/div[1]/div[5]/a/div[1]/span")));
        String getCartQuantity = driver.findElement(By.xpath("/html/body/div[1]/div[6]/header/div[2]/div[1]/div[5]/a/div[1]/span")).getText();
        Assert.assertEquals(getCartQuantity, "1");
    }

    @Test
    public void addToCartTwoIPhone() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        addToCart.searchBarInput("iPhone");
        addToCart.searchButtonClick();
        addToCart.firstResultHover();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[1]/div/div[1]/div[2]/button[1]/i")));
        addToCart.addTwoPiecesToCart();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[1]/a")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/header/div[2]/div[1]/div[5]/a/div[1]/span")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/header/div[2]/div[1]/div[5]/a/div[1]/span")));
        String getCartQuantity = driver.findElement(By.xpath("/html/body/div[1]/div[6]/header/div[2]/div[1]/div[5]/a/div[1]/span")).getText();
        Assert.assertEquals(getCartQuantity, "2");
    }

    @Test
    public void addFirstAndSecondResultToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        addToCart.searchBarInput("iPhone");
        addToCart.searchButtonClick();
        addToCart.firstResultHover();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[1]/div/div[1]/div[2]/button[1]/i")));
        addToCart.addOnePieceToCart();
        addToCart.secondResultHover();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[2]/div/div[1]/div[2]/button[1]/i")));
        addToCart.SecondResultAddOnePieceToCart();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/header/div[2]/div[1]/div[5]/a/div[1]/span")));
        String getCartQuantity = driver.findElement(By.xpath("/html/body/div[1]/div[6]/header/div[2]/div[1]/div[5]/a/div[1]/span")).getText();
        Assert.assertEquals(getCartQuantity, "2");
    }


    @Test
    public void checkOutOneIPhone() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        addToCart.searchBarInput("iPhone");
        addToCart.searchButtonClick();
        addToCart.firstResultHover();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[1]/div/div[1]/div[2]/button[1]/i")));
        addToCart.addOnePieceToCart();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[1]/a")));
        addToCart.checkOutButtonClick();
        String checkOutTotalPrice = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div/form/div/table/tbody/tr/td[6]")).getText();
        Assert.assertEquals(checkOutTotalPrice,"$123.20");
    }

    @Test
    public void checkOutTwoIPhone() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        addToCart.searchBarInput("iPhone");
        addToCart.searchButtonClick();
        addToCart.firstResultHover();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[1]/div/div[1]/div[2]/button[1]/i")));
        addToCart.addTwoPiecesToCart();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[1]/a")));
        addToCart.checkOutButtonClick();
        String checkOutTotalPrice = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div/form/div/table/tbody/tr/td[6]")).getText();
        Assert.assertEquals(checkOutTotalPrice,"$246.40");
    }

    @Test
    public void checkOutFirstAndSecondResult() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        addToCart.searchBarInput("iPhone");
        addToCart.searchButtonClick();
        addToCart.firstResultHover();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[1]/div/div[1]/div[2]/button[1]/i")));
        addToCart.addOnePieceToCart();
        addToCart.secondResultHover();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[2]/div/div[1]/div[2]/button[1]/i")));
        addToCart.SecondResultAddOnePieceToCart();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[1]/a")));
        addToCart.checkOutButtonClick();
        String checkOutSubTotalPrice = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/strong")).getText();
        Assert.assertEquals(checkOutSubTotalPrice,"$202.00");
    }

    @Test
    public void checkOutModifyQuantity() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        addToCart.searchBarInput("iPhone");
        addToCart.searchButtonClick();
        addToCart.firstResultHover();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[1]/div/div[1]/div[2]/button[1]/i")));
        addToCart.addOnePieceToCart();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[1]/a")));
        addToCart.checkOutButtonClick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div/form/div/table/tbody/tr/td[4]/div/input")));
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div/form/div/table/tbody/tr/td[4]/div/input")).clear();
        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div/form/div/table/tbody/tr/td[4]/div/input")).sendKeys("2");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div/form/div/table/tbody/tr/td[4]/div/div/button[1]/i"))).click();
        driver.navigate().refresh();
        String checkOutSubTotalPrice = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/strong")).getText();
        Assert.assertEquals(checkOutSubTotalPrice,"$202.00");
    }

    @Test
    public void quickViewIPhone() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        addToCart.searchBarInput("iPhone");
        addToCart.searchButtonClick();
        addToCart.firstResultHover();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[1]/div/div[1]/div[2]/button[3]/i"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div[2]/div[1]/div/div/div[1]/a/img")));
    String quickViewIPhone = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/h1")).getText();
        Assert.assertEquals(quickViewIPhone, "iPhone");
    }

}
