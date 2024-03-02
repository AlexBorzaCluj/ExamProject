Am creat proiectul utilizand design pattern-ul Page Object model.
Pentru testele automate am folosit Selenium Webdriver framework.
Testele sunt construite si rulate folosind Maven. Fisierul pom.xml al sistemului Maven contine
dependintele necesare pentru: Selenium, Chrome Driver, TestNG.
Fiecare test case deschide o instanta de browser Chrome in full screen, iar dupa rularea fiecarui test
acea instanta o sa fie inchisa. Aceste setari sunt definite in @BeforeMethod si @AfterMethod, in
BasePage.
Proiectul este format din 2 pachete (pages si test):
● pages contine locatorii din pagini si metodele care ii utilizeaza, cum ar fi locatorii din AddToCart,
Categories, HamburgerMenu, MegaMenu;
○ In interiorul pages se gaseste si clasa BasePage care este responsabila cu configurari si prerechizite
necesare rularii testelor (definirea URL-ului, @BeforeMethod si @AfterMethod);
● testCases contine test case-urile pentru elementele din clasele din pachetul de pages:
- AddToCartTests test the shopping cart quantity and value;
- CategoriesTests test the total quantity of products in each category;
- HamburgerMenuTests test the submenu categories of the hamburger menu link to the correct
page;
- MegaMenuTests test the submenu categories of the mega menu link to the correct page.
Pentru a rula testele folosim comanda test din cadrul Lifecycle al meniului Maven cu simbolul “m”
din partea dreapta sus. Daca comanda test da eroare este recomandat sa rulam comenzile
clean, validate, compile si apoi test, in ordine.
Dupa ce testele s-au rulat, generam un raport “allure” folosind comenzile allure:report si allure:serve
aflate tot in meniul “m”, in cadrul Plugins/allure. Comanda allure:report va genera raportul pe baza
testelor rulate iar comanda allure:serve va afisa raportul.
