package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class FifthPagePOM extends BaseClass{

	public FifthPagePOM() {
		
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "check_all")

	private WebElement checkAllBtn;

	public WebElement getcheckAllBtn() {

		return checkAllBtn;
		
	}
	
	@FindBy(name = "logout")

	private WebElement logoutBtn;

	public WebElement getLogoutBtn() {

		return logoutBtn;
		
	}

}