package pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.interactions.Pause;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test
	public void clickHomeButton() throws InterruptedException {
		homePage.clickHomeButton();

	}

	@Test
	public void clickfindadoctor() throws InterruptedException {
		homePage.clickfindadoctor();
	}

	@Test
	public void clickdirectionsparking() throws InterruptedException {
		homePage.clickdirectionsparking();
	}

	@Test
	public void clickmenu() throws InterruptedException {
		homePage.clickmenu();
	}

	@Test
	public void clickhospitalinforamation() throws InterruptedException {
		homePage.clickhospitalinformation();
	}

	@Test
	public void clickalllocations() throws InterruptedException {
		homePage.clickalllocations();
	}

	@Test
	public void clicksearch() throws InterruptedException {
		homePage.clicksearch();

	}

	@Test
	public void clickfindalocation() throws InterruptedException {
		homePage.clickfindalocation();

	}
	
	@Test
	public void clickdoctorname() throws InterruptedException {
		homePage.clickdoctorname();

	}
	
	@Test
	public void clickdonate() throws InterruptedException{
		homePage.clickdonate();
	}

	@Test
	public void clicksignin() throws InterruptedException{
		homePage.clicksignin();
	}
		
//we are using 2 actions here
	@Test
	public void clickhospitalinformationthenclickfindadoctortheninputTextIndoctornamethenclicksearch() throws InterruptedException {
		homePage.clickhospitalinformationthenclickfindadoctortheninputTextIndoctornamethenclicksearch();

	}

	@Test
	public void clickmenuthenclickalllocationsthensearch() throws InterruptedException {
		homePage.clickmenuthenclickalllocationsthensearch();

	}

	// test for implicitly and it shows no such element exception
	@Test
	public void clickwrongfindadoctor() {
		homePage.clickwrongfindadoctor();
	}

}
