package common;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

public class CommonActions {
	
	public  static void clickElement(WebElement element) {
		try {
			element.click();
			
		}catch (NoSuchElementException | NullPointerException e) {
			//e.printStackTrace();
			System.out.println("Exceptions is:" + e);
		}
	}

}
