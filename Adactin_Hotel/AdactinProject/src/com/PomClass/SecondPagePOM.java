package com.PomClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class SecondPagePOM extends BaseClass {

	public SecondPagePOM() {
		
		PageFactory.initElements(driver, this);

		}

		@FindBy(name = "radiobutton_0")

		private WebElement radioBtn;

		public WebElement getRadioBtn() {

			return radioBtn;
			
	}
		
		@FindBy(id = "continue")
		
		private WebElement continueBtn;
		
		public WebElement getContinueBtn() {
			
			return continueBtn;
		}
}
