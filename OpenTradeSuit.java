package com.formax.forex.TestCase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.formax.security.Fuction.OpenTrade;
import com.formax.security.utils.Driver;
import com.formax.security.utils.SnapshotListener;

import io.appium.java_client.android.AndroidDriver;

@Listeners({ SnapshotListener.class })
public class OpenTradeSuit {
	AndroidDriver androiddriver;
	@BeforeClass
	public void setUp() throws Exception{
		
		
		  androiddriver =Driver.GetDriver("5.1","8eaae845");
	}
	
	@Test(groups="first",alwaysRun=true)
	public void testOpenTrade(){
		OpenTrade open1 = new OpenTrade(androiddriver);
		open1.opentrade1();

	}
	@Test(dependsOnGroups="first")
	public void testOpenTrade1(){
		OpenTrade open2 = new OpenTrade(androiddriver);
		
		open2.opentradestep2();
	}
	
	@AfterTest
	 public void tearDown(){
		  //BootActivity.OpenBootActivity(androiddriver);
		  //login.loginout(androiddriver);
	      androiddriver.quit();
	   
	    }
}
