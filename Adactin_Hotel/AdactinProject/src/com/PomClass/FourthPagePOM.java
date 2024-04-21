package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class FourthPagePOM extends BaseClass {
	
	public FourthPagePOM() {
		
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "my_itinerary")

	private WebElement myItineraryBtn;

	public WebElement getMyItineraryBtn() {

		return myItineraryBtn;
		
	}
	

}
