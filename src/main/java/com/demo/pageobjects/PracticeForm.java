package com.demo.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeForm {

	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/h1")
	WebElement practiceFormHeading;
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/legend/strong")
	WebElement personalInfoLabel;
	
	
}
