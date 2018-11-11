package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.applet.Main;

import java.util.List;

public class SearchResultsDetailsPage extends UpperMenuPage{

    @FindBy(xpath="//a[contains(@data-value,'{\"stringVal\":\"0')]") WebElement firstSizeFromList;
    @FindBy(id = "dropdown_selected_size_name") WebElement sizeSelect;
    @FindBy(id = "add-to-cart-button") WebElement addToCartButton;
    @FindBy(xpath = "//ul/li[@role='option']") List<WebElement> lista;




    public SearchResultsDetailsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void ania(){
        for(int i=0;i<lista.size();i++)
        System.out.println(lista.get(i).getText());
    }

    public void clickSizeSelection(){
        sizeSelect.click();
    }

    public void selectFirstSize(){
        firstSizeFromList.click();
    }

    public CartPage addToCart(){
        waitForJStoLoad();
        addToCartButton.click();
        return new CartPage(driver);

    }



}
