package com.formax.security.Fuction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.formax.security.Activity.forextradeForexTradeActivity;
import com.formax.security.utils.CommMethod;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OpenTrade extends forextradeForexTradeActivity {
	AndroidDriver driver;
	
	public  OpenTrade(AndroidDriver driver ){
		PageFactory.initElements(driver, this);
//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver=driver;
	}
	
	
	public void opentrade1() {
		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ConfirmGestureAdaptation(driver);
//			System.out.print(isExpectedActivity(driver,"formax.gesture.GestureActivity"));
//			if(isExpectedActivity(driver,"formax.gesture.GestureActivity")){
//				ConfirmGestureAdaptation(driver);
//			}
//			else{
//				Assert.assertEquals(true, false);
//			}
						

			Quotes.get(1).click();
			try {
				Thread.sleep(2000);
				ForexTab.click();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			for(int i=0;i<Symbol.size();i++){
			
				if(Symbol.get(i).getText().equals("EURUSD")){
					Symbol.get(i).click();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return ;
				}

				
			}
			
			
			
		
	}
	
	public void opentradestep2(){
		try {
			Thread.sleep(2000);
//			((RemoteWebElement) driver.findElementsById("com.formax.security:id/al5").get(0)).click();
//			 CommMethod wait =new CommMethod(driver);
//			 wait.waitElement(TradeBtn);
			 TradeBtn.click();
		} 
			 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e1){
			e1.printStackTrace();
		}
//		CommMethod wait1 =new CommMethod(driver);
		new CommMethod(driver).waitElement(ConfirmTradeBtn);
		ConfirmTradeBtn.click();
		
		final WebDriverWait wait = new WebDriverWait(driver, 10);
		Assert.assertNotNull(wait.until(
	            ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(@text,'当前品种为休市时间')]"))));

	
	}
	
}
