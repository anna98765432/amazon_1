import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CartPage;
import pages.UpperMenuPage;
import pages.SearchResultsDetailsPage;
import pages.SearchResultsPage;

public abstract class MainTest {
    WebDriver driver;
    UpperMenuPage upperMenuPage;
    SearchResultsPage searchResultsPage;
    SearchResultsDetailsPage searchResultsDetailsPage;
    CartPage cartPage;


    @BeforeMethod
    public void beforeTest(){
        driver = new ChromeDriver();
        upperMenuPage = new UpperMenuPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        searchResultsDetailsPage = new SearchResultsDetailsPage(driver);
        cartPage = new CartPage(driver);
    }

    @AfterMethod
    public void afterTest(){
        driver.close();
    }

}
