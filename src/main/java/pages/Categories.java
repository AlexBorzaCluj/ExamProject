package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Categories extends BasePage {

    public Categories(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/div[1]/div[3]/div/div[2]/div/div[1]/div[2]/a/figure/div[1]/img")
    private WebElement laptops;

    public void laptopsCategoryClick() {
    laptops.click();}

    @FindBy (xpath = "/html/body/div[1]/div[5]/div[1]/div[3]/div/div[2]/div/div[1]/div[3]/a/figure/div[1]/img")
    private WebElement components;

    public void componentsCategoryClick() {
        components.click();
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/div[1]/div[3]/div/div[2]/div/div[1]/div[4]/a/figure/div[1]/img")
    private WebElement tablets;

    public void tabletsCategoryClick() {
        tablets.click();
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/div[1]/div[3]/div/div[2]/div/div[1]/div[5]/a/figure/div[1]/img")
    private WebElement software;

    public void softwareCategoryClick() {
        software.click();}

    }

