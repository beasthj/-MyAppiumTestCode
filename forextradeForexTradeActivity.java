package com.formax.security.Activity;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import io.appium.java_client.pagefactory.AndroidBy;

public class forextradeForexTradeActivity extends formaxappmainMainActivity {
	
	//行情tab
	@FindBys({@FindBy(id="com.formax.security:id/as5")})
	public List<WebElement> Quotes;
	//外汇tab
	@FindBy(xpath="//android.widget.TextView[contains(@text,'外汇')]")
	public WebElement ForexTab;
	
	//品种Symbol; 选EURUSD
//	@FindBy(name="EURUSD")
	@FindBys({@FindBy(id="com.formax.security:id/mn")})
	public List<WebElement>  Symbol;
	//浮层中的交易菜单
	@FindBy(id="com.formax.security:id/al5")
	public WebElement TradeBtn;
	
	//交易页面确认交易按钮
	@FindBy(id="com.formax.security:id/ack")
	public WebElement ConfirmTradeBtn;

}
