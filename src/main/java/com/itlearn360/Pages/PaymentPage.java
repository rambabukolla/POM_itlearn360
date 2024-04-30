package com.itlearn360.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class PaymentPage {
	
	WebDriver driver;

	//Constructor
	public PaymentPage(WebDriver lDriver) {
		
		this.driver = lDriver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="label[for='payment_method_stripe']") WebElement stripeClick;
	//#learn-press-checkout-place-order  //learn_press_checkout_place_order
	@FindBy(name="learn_press_checkout_place_order") WebElement placeorderBtn;
	//@FindBy(css="input[value='de@gmail.com']") WebElement Stripe_Email;
	//iframe Enter card details-full frame  xpath=/html/body/iframe[1]
	//@FindBy() WebElement frameelement; name="cardnumber"
	//@FindBy(xpath="/html/body/div/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input") WebElement cardnum;
	@FindBy(name="exp-date") WebElement expdate;
	@FindBy(name="cvc") WebElement cvc;
	
	@FindBy(css="#payment-button") WebElement paynowBtn;
	//String cardnum_enter, 
	public void PaymentOptions(String expdate_num, String cvc_num) {
		
		stripeClick.click();
		placeorderBtn.submit(); //upto here test executed
		//driver.switchTo().frame(frameelement); 
		//cardnum.sendKeys(cardnum_enter);
		expdate.sendKeys(expdate_num);
		cvc.sendKeys(cvc_num);
		
		driver.switchTo().defaultContent();
		
		paynowBtn.click();
	}
}
