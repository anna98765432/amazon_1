package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends UpperMenuPage {

    @FindBy(xpath="//li[@id='result_1']//h2[contains(@data-attribute,'Suit')]") WebElement suitesResults;
    @FindBy(xpath="//li[@id='result_0']//h2") WebElement firstResult;



    public SearchResultsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean areSuitesDisplayed(){
        return suitesResults.isDisplayed();
    }

    public SearchResultsDetailsPage clickFirstResult(){
        firstResult.click();
        return new SearchResultsDetailsPage(driver);

    }




}
