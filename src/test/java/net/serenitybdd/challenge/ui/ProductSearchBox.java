package net.serenitybdd.challenge.ui;

import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.Keys;

public class ProductSearchBox extends PageObject {
	
	public void searchProduct () {
		
		// Establecer filtro de busqueda
		$("//input[@id='search-autocomplete-input']").sendKeys("Café en Granos Illy Arábica Guatemala Lata 250 gr");

		// Aceptar los filtros debusqueda y hacer que la pagina busque lo requerido
		$("//input[@id='search-autocomplete-input']").sendKeys(Keys.RETURN);
				
		//Clic en el botón "AGREGAR"
		$("//html/body/div[24]/div/div[2]/div[4]/div[2]/div[2]/div[2]/div/ul/li[1]/div[1]/div[3]/div[5]/button").click();
		
	}

}
