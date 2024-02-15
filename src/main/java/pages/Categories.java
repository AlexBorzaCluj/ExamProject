package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Categories extends BasePage {

    public Categories(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/header/div[2]/div[1]/div[2]/div/form/div/div[1]/div[1]/div[1]/button")
    private WebElement allCategories;

    @FindBy (xpath = "/html/body/div[1]/div[5]/header/div[2]/div[1]/div[2]/div/form/div/div[2]/button")
    private WebElement searchButton;

    @FindBy (xpath = "/html/body/div[1]/div[5]/header/div[2]/div[1]/div[2]/div/form/div/div[1]/div[1]/div[1]/div/a[3]")
    private WebElement laptops;

    public void laptopsCategoryClick() {
    allCategories.click();
    laptops.click();
    searchButton.click();
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/header/div[2]/div[1]/div[2]/div/form/div/div[1]/div[1]/div[1]/div/a[4]")
    private WebElement components;

    public void componentsCategoryClick() {
        allCategories.click();
        components.click();
        searchButton.click();
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/header/div[2]/div[1]/div[2]/div/form/div/div[1]/div[1]/div[1]/div/a[5]")
    private WebElement tablets;

    public void tabletsCategoryClick() {
        allCategories.click();
        tablets.click();
        searchButton.click();
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/header/div[2]/div[1]/div[2]/div/form/div/div[1]/div[1]/div[1]/div/a[6]")
    private WebElement software;

    public void softwareCategoryClick() {
        allCategories.click();
        software.click();
        searchButton.click();
    }

    }

