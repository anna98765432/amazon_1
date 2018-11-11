import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingToCartTest extends MainTest {



    @Test
    public void shouldFindSuite(){
        upperMenuPage.goToAmazon();
        upperMenuPage.searchInListClick();
        upperMenuPage.selectMenFashion();
        upperMenuPage.inputTextToSearch("suits for men");
        upperMenuPage.search();
        Assert.assertTrue(searchResultsPage.areSuitesDisplayed());
    }

    @Test
    public void shouldAdd3ItemsToCart(){
        upperMenuPage.goToAmazon();
        upperMenuPage.inputTextToSearch("dress");
        upperMenuPage.search();
        searchResultsPage.clickFirstResult();
        searchResultsDetailsPage.clickSizeSelection();
        searchResultsDetailsPage.selectFirstSize();
        searchResultsDetailsPage.addToCart();
        upperMenuPage.searchInListClick();
        upperMenuPage.selectAllDeparments();
        upperMenuPage.inputTextToSearch("bag");
        upperMenuPage.search();
        searchResultsPage.clickFirstResult();
        searchResultsDetailsPage.addToCart();
        upperMenuPage.searchInListClick();
        upperMenuPage.selectAllDeparments();
        upperMenuPage.inputTextToSearch("iphone");
        upperMenuPage.search();
        searchResultsPage.clickFirstResult();
        searchResultsDetailsPage.addToCart();
        cartPage.goToCart();
        Assert.assertTrue(cartPage.are3ElementsInCart());

    }

    public void addToCartFew(int element){
        for(int i = 0;i<element;i++){
            upperMenuPage.inputTextToSearch("dress");
            upperMenuPage.search();
            searchResultsPage.clickFirstResult();
            searchResultsDetailsPage.clickSizeSelection();
            searchResultsDetailsPage.selectFirstSize();
            searchResultsDetailsPage.addToCart();


        }
    }

    public void addFewToCart(int liczba){
do        {
            upperMenuPage.inputTextToSearch("dress");
            upperMenuPage.search();
            searchResultsPage.clickFirstResult();
            searchResultsDetailsPage.clickSizeSelection();
            searchResultsDetailsPage.ania();
            searchResultsDetailsPage.selectFirstSize();
            searchResultsDetailsPage.addToCart();
            cartPage.goToCart();

        }
        while(cartPage.checkItem()<liczba);
    }

    @Test
    public void shouldAddToCart2Items(){
        upperMenuPage.goToAmazon();
        addFewToCart(2);
        Assert.assertTrue(cartPage.getCartItems()==2);

    }



    @Test
    public void shouldAddToCart5Items(){
        upperMenuPage.goToAmazon();
        addToCartFew(5);
        cartPage.goToCart();
        Assert.assertTrue(cartPage.are5ElementsInCart());

    }

    @Test
    public void shouldNotRegisterBecauseOfRepeatingEmail(){
        upperMenuPage.goToAmazon();


    }

}
