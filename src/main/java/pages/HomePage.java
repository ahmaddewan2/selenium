package pages;

import org.bouncycastle.asn1.ess.SigningCertificate;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;
	
	
	
	
public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(id="menu-item-3746")
WebElement allLocations;


@FindBy(id="Bellevue Menu")
WebElement homeButton;

@FindBy(id="menu-item-3745")
WebElement findADoctor;

@FindBy(xpath="//a[@class='link link-white has-icon icon-last large has-underline']")
WebElement directionsParking;


@FindBy(id="header-menu")
WebElement menu;

@FindBy(xpath="//section[@class='hospital-information']")
WebElement hospitalinformation;

@FindBy(id="-item-3745")
WebElement wrongFindADoctor;

@FindBy(id="search-global")
WebElement search;

@FindBy( xpath="//span[text()='find a location']")
WebElement findalocation;

@FindBy(id="search-input")
WebElement doctorname;

@FindBy(xpath="//a[text()='Donate']")
WebElement donate;

@FindBy(xpath="//input[@name='submit']")
WebElement signin;
public void clickHomeButton() throws InterruptedException{
	homeButton.click();
	Thread.sleep(4000);

	
}

public void clickfindadoctor() throws InterruptedException{
	findADoctor.click();
	Thread.sleep(4000);
}

public void clickdirectionsparking() throws InterruptedException {
	directionsParking.click();
	Thread.sleep(4000);
}

public void clickmenu() throws InterruptedException{
	menu.click();
	Thread.sleep(4000);
}





//public void clickhospitalinformation() throws InterruptedException {
	//hospitalinformation.click();
	//Thread.sleep(4000);
//}

public void clickalllocations()throws InterruptedException{
	allLocations.click();
	Thread.sleep(4000);
}
//how to test implicitly wait
public void clickwrongfindadoctor(){
	wrongFindADoctor.click();
	//we use try catch block to throw exception
	try {
	Thread.sleep(4000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	
}
public void clickhospitalinformation()  {
	clickElement(hospitalinformation);
	
}

public void clicksearch() throws InterruptedException{
	Search.click();
	Thread.sleep(4000);
	
}
public void clickfindalocation() throws InterruptedException{
	findalocation.click();
	Thread.sleep(4000);
	
}

public void clickdoctorname() throws InterruptedException{
	doctorname.click();
	Thread.sleep(4000);
	
}

public void clickdonate() throws InterruptedException{
	donate.click();
	Thread.sleep(4000);
}

public void clicksignin() throws InterruptedException{
	signin.click();
}


//we are using 2 actions here
public void clickhospitalinformationthenclickfindadoctortheninputTextIndoctornamethenclicksearch() {
	
	clickElement(hospitalinformation);
	Pause(3);
	clickElement(findADoctor);
	Pause(3);
	inputText(doctorname,"dr.alex");
	Pause(3);
	clickElement(search);
	Pause(3);
	
	
}
private void inputText(WebElement doctorname2, String string) {
	// TODO Auto-generated method stub
	
}

public void clickmenuthenclickalllocationsthensearch() {
	
	clickElement(menu);
	Pause(3);
	clickElement(allLocations);
	Pause(3);
	clickElement(search);
	Pause(3);
	
	
}

//we are using the sendkeys() method to input the text in any field

private void Pause(int i) {
	// TODO Auto-generated method stub
	
}

public void inputTextInputHospitalInformationfield() {
	hospitalinformation.sendKeys("february 2024 weekend batch");
	try {
		Thread.sleep(4000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
}
		
}
