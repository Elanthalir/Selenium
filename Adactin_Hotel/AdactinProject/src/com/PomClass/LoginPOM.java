package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class LoginPOM extends BaseClass {

	public LoginPOM() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")

	private WebElement username;

	public WebElement getusername() {

		return username;

	}

	@FindBy(xpath = "//input[@id='password']")

	private WebElement pass;

	public WebElement getpass() {

		return pass;

	}

	@FindBy(xpath = "//input[@class='login_button']")

	private WebElement button;

	public WebElement getbutton() {

		return button;

	}

}
