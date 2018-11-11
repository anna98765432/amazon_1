package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpperMenuPage extends MainPage {

    private String url = "https://www.amazon.com/";
    @FindBy(xpath = "//select[@title='Search in']" ) WebElement searchInListButton;
    @FindBy(xpath= "//select[@title='Search in']/option[@value='search-alias=fashion-mens']") WebElement menFashionFromList;
    @FindBy(id = "twotabsearchtextbox") WebElement searchBox;
    @FindBy(xpath = "//input[@value='Go']") WebElement search;
    @FindBy(xpath= "//select[@title='Search in']/option[@value='search-alias=aps']") WebElement allDepartmentsFromList;
    @FindBy(xpath= "//span[@id='nav-cart-count']") WebElement cartElements;




    public UpperMenuPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public Integer getCartItems(){
        String cart = cartElements.getText();
        return Integer.parseInt(cart);
    }

    public void goToAmazon(){
        driver.get(url);
    }

    public void searchInListClick(){
        searchInListButton.click();
    }

    public void selectMenFashion(){
        menFashionFromList.click();
    }

    public void inputTextToSearch(String inputText){
        searchBox.sendKeys(inputText);
    }

    public SearchResultsPage search(){
        search.click();
        return new SearchResultsPage(driver);
    }

    public void selectAllDeparments(){
        allDepartmentsFromList.click();
    }









}
