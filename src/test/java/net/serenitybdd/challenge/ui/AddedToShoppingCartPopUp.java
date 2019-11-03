package net.serenitybdd.challenge.ui;

import net.serenitybdd.core.pages.PageObject;

public class AddedToShoppingCartPopUp  extends PageObject {
	
	public void checkPopUp () {
		//Validar que salga ventana que confirma producto añadido al carrito
		$("//*[@id=\"footer\"]/div[3]/div/div").waitUntilPresent();
	
	}
}
