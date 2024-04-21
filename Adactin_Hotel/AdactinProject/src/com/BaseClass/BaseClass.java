package com.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Select s;
	public static Actions ac;
	public static Robot r;

	public static void launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		}

	}

	public static void maximize() {

		driver.manage().window().maximize();

	}

	public static void launchUrl(String url) {

		driver.get(url);

	}

	public static void implicitWait(int sec) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

	}

	public static void staticWait(int sec) throws InterruptedException {

		Thread.sleep(sec);

	}

	public static void click(WebElement element) {

		element.click();

	}

	public static void sendkeys(WebElement element, String keys) {

		element.sendKeys(keys);

	}

	public static void dropdown(WebElement element, String ref, String text) {

		s = new Select(element);
		if (ref.equalsIgnoreCase("value")) {
			s.selectByValue(text);

		} else if (ref.equalsIgnoreCase("text")) {
			s.selectByVisibleText(text);

		} else if (ref.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(text));

		}

	}

	public static void jsClick(WebElement element) {

		js.executeScript("arguments[0].click();", element);

	}

	public static void MouseClick(WebElement elements) {

		ac = new Actions(driver);
		ac.click(elements).build().perform();
	}
		
	public static void keyBoard(String keys) throws AWTException {
			
		r=new Robot();
			
		keys.equalsIgnoreCase(keys);
		switch(keys) {
			
		case "down":r.keyPress(KeyEvent.VK_DOWN);
		break;
			
		case "enter":r.keyPress(KeyEvent.VK_ENTER);
		break;
		
		}
			
	}
	
	public static void screenshot(String name) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\elant\\OneDrive\\Documents\\Java\\Programs\\AdactinProject\\Screenshot\\"+name+".png");
		FileHandler.copy(source, des);
		
	}

}
