package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class ThirdPagePOM extends BaseClass {
	
	public ThirdPagePOM() {
		
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "first_name")

	private WebElement firstNameTextBox;

	public WebElement getfirstNameTextBox() {

		return firstNameTextBox;
		
	}
	
	@FindBy(name = "last_name")

	private WebElement lastNameTextBox;

	public WebElement getlastNameTextBox() {

		return lastNameTextBox;
		
	}
	
	@FindBy(id = "address")

	private WebElement billingAddressTextBox;

	public WebElement getbillingAddressTextBox() {

		return billingAddressTextBox;
		
	}
	
	@FindBy(id = "cc_num")

	private WebElement creditCardNumberTextBox;

	public WebElement getcreditCardNumberTextBox() {

		return creditCardNumberTextBox;
		
	}
	
	@FindBy(id = "cc_type")
	
	private WebElement selectCreditCardType;

	public WebElement getselectCreditCardType() {

		return selectCreditCardType;
		
	}
	
	@FindBy(id = "cc_exp_month")
	
	private WebElement selectExpiryMonth;

	public WebElement getselectExpiryMonth() {

		return selectExpiryMonth;
		
	}
	
	
	@FindBy(id = "cc_exp_year")

	private WebElement selectExpiryYear;

	public WebElement getselectExpiryYear() {

		return selectExpiryYear;
		
	}
	
	@FindBy(id = "cc_cvv")

	private WebElement cvvNumberTextBox;

	public WebElement getcvvNumberTextBox() {

		return cvvNumberTextBox;
		
	}
	
	@FindBy(id = "book_now")

	private WebElement booknowBtn;

	public WebElement getbooknowBtn() {

		return booknowBtn;
		
	}

}
