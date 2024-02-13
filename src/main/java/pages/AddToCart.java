package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddToCart extends BasePage {

    public AddToCart(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[2]/div[1]/div[2]/div/form/div/div[1]/div[1]/div[2]/input")
    private WebElement searchBar;

    public void searchBarInput(String searchBarInput) {
        searchBar.sendKeys(searchBarInput);
    }

    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[2]/div[1]/div[2]/div/form/div/div[2]/button")
    private WebElement searchButton;

    public void searchButtonClick() {
        searchButton.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[1]/div/div[1]/div[1]/a/div/div[1]/img")
    private WebElement firstResult;
    Actions clickAddToCart = new Actions(driver);

    public void firstResultHover() {
        clickAddToCart.moveToElement(firstResult).perform();
    }

    @FindBy(xpath = "/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[1]/div/div[1]/div[2]/button[1]/i")
    private WebElement addToCartButton;

    public void addOnePieceToCart() {
        addToCartButton.click();
    }

    public void addTwoPiecesToCart() {
        clickAddToCart.moveToElement(firstResult).doubleClick(addToCartButton).perform();
    }

    @FindBy(xpath = "/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[2]/div/div[1]/div[1]/a/div/div[1]/img")
    private WebElement secondResult;

    public void secondResultHover() {
        clickAddToCart.moveToElement(secondResult).perform();
    }

    @FindBy(xpath = "/html/body/div[1]/div[6]/div[1]/div[2]/div/div[1]/div[5]/div/div[2]/div/div[1]/div[2]/button[1]/i")
    private WebElement secondResultAddToCartButton;

    public void SecondResultAddOnePieceToCart() {
        secondResultAddToCartButton.click();
    }

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div[2]/a")
    private WebElement checkOutButton;

    public void checkOutButtonClick() {
        checkOutButton.click();
    }

}
