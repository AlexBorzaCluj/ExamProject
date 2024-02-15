package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MegaMenu extends BasePage {

    public MegaMenu(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[4]")
    private WebElement megaMenuItem;

Actions megaMenuSelection = new Actions(driver);
public void megaMenuHover() {
    megaMenuSelection.moveToElement(megaMenuItem).perform();
}

@FindBy (xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[4]/ul/div/div[1]/div[1]/div/div/ul/li[1]/a")
private WebElement megaMenuAppleSubMenu;
public void megaMenuAppleSubMenuClick() {
    megaMenuSelection.moveToElement(megaMenuAppleSubMenu).click().perform();
}

@FindBy (xpath = ("/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[4]/ul/div/div[1]/div[1]/div/div/ul/li[2]/a"))
    private WebElement megaMenuHTCSubMenu;

    public void megaMenuHTCSubMenuClick() {
        megaMenuSelection.moveToElement(megaMenuHTCSubMenu).click().perform();
    }

    @FindBy (xpath = ("/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[4]/ul/div/div[1]/div[1]/div/div/ul/li[3]/a"))
private WebElement megaMenuLGSubMenu;

    public void megaMenuLGSubMenuClick() {
        megaMenuSelection.moveToElement(megaMenuLGSubMenu).click().perform();
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[4]/ul/div/div[1]/div[1]/div/div/ul/li[4]/a")
    private WebElement megaMenuNokiaSubMenu;

    public void megaMenuNokiaSubMenuClick() {
        megaMenuSelection.moveToElement(megaMenuNokiaSubMenu).click().perform();
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[4]/ul/div/div[1]/div[1]/div/div/ul/li[5]/a")
    private WebElement megaMenuSamsungSubMenu;

    public void megaMenuSamsungSubMenuClick() {
        megaMenuSelection.moveToElement(megaMenuSamsungSubMenu).click().perform();
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[4]/ul/div/div[1]/div[1]/div/div/ul/li[6]/a")
    private WebElement megaMenuXiomiSubMenu;

    public void megaMenuXiomiSubMenuClick() {
        megaMenuSelection.moveToElement(megaMenuXiomiSubMenu).click().perform();
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[4]/ul/div/div[1]/div[2]/div/div/ul/li[1]/a")
    private WebElement megaMenuAppleMacbookSubMenu;

    public void megaMenuAppleMacbookSubMenuClick() {
        megaMenuSelection.moveToElement(megaMenuAppleMacbookSubMenu).click().perform();
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[4]/ul/div/div[1]/div[2]/div/div/ul/li[2]/a")
    private WebElement megaMenuAsusSubMenu;

    public void megaMenuAsusSubMenuClick() {
        megaMenuSelection.moveToElement(megaMenuAsusSubMenu).click().perform();
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[4]/ul/div/div[1]/div[2]/div/div/ul/li[3]/a")
    private WebElement megaMenuHPSubMenu;

        public void megaMenuHPSubMenuClick() {
        megaMenuSelection.moveToElement(megaMenuHPSubMenu).click().perform();
    }

    @FindBy (xpath = "/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[3]/nav/div/ul/li[4]/ul/div/div[1]/div[2]/div/div/ul/li[4]/a")
    private WebElement megaMenuLenovoSubMenu;

    public void megaMenuLenovoSubMenuClick() {
        megaMenuSelection.moveToElement(megaMenuLenovoSubMenu).click().perform();
    }

    }


