package features.findProduct;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import steps.NavigatingUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenFindProduct {
	
	@Steps
	NavigatingUser jaam;
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	@Test
	public void shouldBeAbleToFindProduct() {
		//Given
		// Primer paso asegurar que está en el homepage del sitio
		jaam.isOnTheHomePage();
		
		//When
		// Se debe realizar la búsqueda del producto y añadirlo al carrito
		jaam.findProduct();
		
		//Then
		// Se valida que el producto haya sido añadido al carrito
		jaam.shouldSeePopupConfirmation();
	}
}
