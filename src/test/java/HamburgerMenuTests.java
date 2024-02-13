import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HamburgerMenu;

import java.time.Duration;


public class HamburgerMenuTests extends BasePage {

    private HamburgerMenu hamburgerMenu;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        hamburgerMenu = new HamburgerMenu(driver);
    }

    @Test
    public void componentsSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        hamburgerMenu.hamburgerMenuIconClick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/ul/li[1]/a/div[2]/span")));
        hamburgerMenu.componentsSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "Components");
    }

    @Test
    public void camerasSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        hamburgerMenu.hamburgerMenuIconClick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/ul/li[1]/a/div[2]/span")));
        hamburgerMenu.camerasSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "Cameras");
    }


    @Test
    public void tabletsSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        hamburgerMenu.hamburgerMenuIconClick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/ul/li[1]/a/div[2]/span")));
        hamburgerMenu.tabletsSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "Tablets");
    }

    @Test
    public void softwareSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        hamburgerMenu.hamburgerMenuIconClick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/ul/li[1]/a/div[2]/span")));
        hamburgerMenu.softwareSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "Software");
    }

    @Test
    public void mP3PlayersSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        hamburgerMenu.hamburgerMenuIconClick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/ul/li[1]/a/div[2]/span")));
        hamburgerMenu.mP3PlayersSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "MP3 Players");
    }

    @Test
    public void monitorsSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        hamburgerMenu.hamburgerMenuIconClick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/ul/li[1]/a/div[2]/span")));
        hamburgerMenu.monitorsSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "Monitors");
    }


    @Test
    public void printersSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        hamburgerMenu.hamburgerMenuIconClick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/ul/li[1]/a/div[2]/span")));
        hamburgerMenu.printersSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "Printers");
    }


    @Test
    public void miceAndTrackballsSubMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        hamburgerMenu.hamburgerMenuIconClick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/ul/li[1]/a/div[2]/span")));
        hamburgerMenu.miceAndTrackballsSubMenuClick();
        String actualResult = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(actualResult, "Mice and Trackballs");
    }

}
