package com.demo.pageobjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFormS {
	
	@FindBy(xpath="html/body/div[1]/div[5]/div[2]/div/div/form/fieldset/div[12]/p/strong/label")
	WebElement continentsLabel;
	
	@FindBy(id="continents")
	WebElement continentsComboBox;
	
	@FindBy(xpath="html/body/div[1]/div[5]/div[2]/div/div/form/fieldset/div[13]/p/strong/label")
	WebElement seleniumCmdLabel;
	
	@FindBy(id="selenium_commands")
	WebElement seleniumCmdComboBox;
	
	@FindBy(id="submit")
	WebElement submitBtn;
	
	@FindBy(className="bcd")
	WebElement text1Span;
	
	@FindBy(id="NextedText")
	WebElement text2Label;
	

}
