package steps;

import net.serenitybdd.challenge.ui.AddedToShoppingCartPopUp;
import net.serenitybdd.challenge.ui.CurrentPage;
import net.serenitybdd.challenge.ui.ProductSearchBox;
import net.serenitybdd.challenge.ui.WongHomePage;
import net.thucydides.core.annotations.Step;



public class NavigatingUser {

	WongHomePage wongHomePage;
	CurrentPage currentPage;
	ProductSearchBox productSearchBox;
	AddedToShoppingCartPopUp addedToShoppingCartPopUp;
	
	@Step
	public void isOnTheHomePage() {
		// TODO Auto-generated method stub
		wongHomePage.open();
	}
	
	@Step
	public void findProduct() {
		// TODO Auto-generated method stub
		productSearchBox.searchProduct();
	}
	
	@Step
	public void shouldSeePopupConfirmation() {
		// TODO Auto-generated method stub
		addedToShoppingCartPopUp.checkPopUp();
	}
	
}
