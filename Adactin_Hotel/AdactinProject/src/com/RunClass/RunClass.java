package com.RunClass;

import java.awt.AWTException;
import java.io.IOException;

import com.BaseClass.BaseClass;
import com.PomClass.FifthPagePOM;
import com.PomClass.FirstPagePOM;
import com.PomClass.FourthPagePOM;
import com.PomClass.LoginPOM;
import com.PomClass.SecondPagePOM;
import com.PomClass.ThirdPagePOM;

public class RunClass extends BaseClass {

	public static void main(String[] args) throws AWTException, IOException{

		launchBrowser("chrome");

		maximize();

		launchUrl("https://adactinhotelapp.com/");
		
		implicitWait(30);

		LoginPOM lg = new LoginPOM();

		sendkeys(lg.getusername(), "Elanthalir");

		sendkeys(lg.getpass(), "Thalir@12345");

		click(lg.getbutton());

		FirstPagePOM fpp = new FirstPagePOM();

		dropdown(fpp.getlocation(), "value", "New York");

		MouseClick(fpp.getSelecthotels());
		keyBoard("down");
		keyBoard("enter");

		dropdown(fpp.getRoomType(), "text", "Double");

		click(fpp.getRoomNO());
		keyBoard("down");
		keyBoard("enter");

		sendkeys(fpp.getCheckin(), "27/03/2023");

		sendkeys(fpp.getCheckout(), "29/03/2023");

		click(fpp.getsearchbtn());
		
		SecondPagePOM spp = new SecondPagePOM();
		
		click(spp.getRadioBtn());
		
		click(spp.getContinueBtn());
		
		ThirdPagePOM tpp = new ThirdPagePOM();
		
		sendkeys(tpp.getfirstNameTextBox(), "Elanthalir");
		
		sendkeys(tpp.getlastNameTextBox(), "S");
		
		sendkeys(tpp.getbillingAddressTextBox(), "Chennai");
		
		sendkeys(tpp.getcreditCardNumberTextBox(), "1234567890123456");
		
		dropdown(tpp.getselectCreditCardType(),"value","VISA");
		
		dropdown(tpp.getselectExpiryMonth(),"text","October");
		
		dropdown(tpp.getselectExpiryYear(),"index","17");
		
		sendkeys(tpp.getcvvNumberTextBox(),"1234");
		
		click(tpp.getbooknowBtn());
		
		FourthPagePOM fopp = new FourthPagePOM();

		click(fopp.getMyItineraryBtn());
		
		FifthPagePOM fipp = new FifthPagePOM();
		
		click(fipp.getcheckAllBtn());
		
		click(fipp.getLogoutBtn());
		
		screenshot("output");
		
		}
	
}