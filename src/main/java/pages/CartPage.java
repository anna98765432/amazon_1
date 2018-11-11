package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends UpperMenuPage {

    @FindBy(id="hlb-view-cart-announce") WebElement cartButton;
    @FindBy(xpath="//div[@class='a-box-inner']//span[@class='a-size-medium a-text-bold']") WebElement amountOfElements;

    public CartPage(WebDriver driver){
        super(driver);
    }

    public void goToCart(){
        cartButton.click();
    }

    public boolean are3ElementsInCart(){
        return amountOfElements.getText().contains("Subtotal (3 items):");

    }

    public Integer checkItem(){
       String lvTekst = amountOfElements.getText();
       if (lvTekst != null && lvTekst.contains("item"))
       {
           try {
               System.out.println("tekst:" + lvTekst);
               lvTekst = lvTekst.substring(lvTekst.indexOf("(")+1, lvTekst.indexOf("item")-1);
               System.out.println("obciety:" + lvTekst);
               Integer lvIle = Integer.parseInt(lvTekst);
               return lvIle;
           }
           catch(Exception e)
           {
               System.out.println("b"+lvTekst+"j");
           }
       }
       return 0;
    }

    public boolean are5ElementsInCart(){
        return amountOfElements.getText().contains("Subtotal (5 items):");

    }







}
