import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;

import java.time.Duration;


public class HomePageTests extends BasePage {

    private HomePage homePage;

    @BeforeMethod
    public void setUp() {
        super.setUp();

        homePage = new HomePage(driver);
    }

    @Test
    public void clickOnComponentsSubMenu() {
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
        WebElement hamburgerMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#entry_217833 > a")));
        WebElement componentsSubmenu = driver.findElement(By.cssSelector("#widget-navbar-217841 > ul > li:nth-child(1) > a > div.info > span"));
        Actions hamburgerMenuAction = new Actions(driver);
        hamburgerMenuAction.moveToElement(hamburgerMenu, 2, 2).click().perform();
        hamburgerMenuAction.moveToElement(componentsSubmenu).click().perform();
    }

}
