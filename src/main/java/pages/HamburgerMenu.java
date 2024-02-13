package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HamburgerMenu extends BasePage {

    public HamburgerMenu(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "entry_217832")
    private WebElement hamburgerMenuIcon;

    public void hamburgerMenuIconClick() {
        hamburgerMenuIcon.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/nav/div/ul/li[1]/a/div[2]/span")
    private WebElement componentsSubMenu;

    public void componentsSubMenuClick() {
        componentsSubMenu.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/nav/div/ul/li[2]/a/div[2]/span")
    private WebElement camerasSubMenu;

    public void camerasSubMenuClick() {
        camerasSubMenu.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/nav/div/ul/li[3]/a/div[2]/span")
    private WebElement tabletsSubMenu;

    public void tabletsSubMenuClick() {
        tabletsSubMenu.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/nav/div/ul/li[4]/a/div[2]/span")
    private WebElement softwareSubMenu;

    public void softwareSubMenuClick() {
        softwareSubMenu.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/nav/div/ul/li[5]/a/div[2]/span")
    private WebElement mP3PlayersSubMenu;

    public void mP3PlayersSubMenuClick() {
        mP3PlayersSubMenu.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/nav/div/ul/li[6]/a/div[2]/span")
    private WebElement laptopsSubMenu;

    public void laptopsSubMenuClick() {
        laptopsSubMenu.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/nav/div/ul/li[7]/a/div[2]/span")
    private WebElement monitorsSubMenu;

    public void monitorsSubMenuClick() {
        monitorsSubMenu.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/nav/div/ul/li[8]/a/div[2]/span")
    private WebElement printersSubMenu;

    public void printersSubMenuClick() {
        printersSubMenu.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/nav/div/ul/li[9]/a/div[2]/span")
    private WebElement miceAndTrackballsSubMenu;

    public void miceAndTrackballsSubMenuClick() {
        miceAndTrackballsSubMenu.click();
    }
}
