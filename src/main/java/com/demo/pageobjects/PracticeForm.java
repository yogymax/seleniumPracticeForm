package com.demo.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeForm {

	/**
	 * Yogesh
	 */
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/h1")
	WebElement practiceFormHeading;
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/legend/strong")
	WebElement personalInfoLabel;
	
	@FindBy(partialLinkText="Partial Link Test")
	WebElement partialLinkText;
	
	@FindBy(linkText="Link Test")
	WebElement linkText;
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[1]/strong[1]")
	WebElement firstNameLbl;
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[1]/input[1]")
	WebElement firstNameInput;

	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[1]/strong[2]")
	WebElement lastNameLbl;
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[1]/input[2]")
	WebElement lastName;
	
	@FindBy(id="content")
	WebElement practiceFormInfo;

	@FindBy(name="sex")
	List<WebElement> radioBtns;
	
	@FindBy(name="exp")
	List<WebElement> yearsOfExpRadioBtns;
	
	@FindBy(name="profession")
	List<WebElement> profession;
	
	
	@FindBy(id="datepicker")
	WebElement date;
	
	
	
	/**
	 * Sangeeta
	 */
	
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

	
	/**
	 * Vasudha
	 */
	
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[5]/strong/label")
	WebElement ProfilePictureAttach;
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[5]/input")
	WebElement BrowseProfilePicture;
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[7]/strong")
	WebElement DowloadFramework;

	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[8]/a")
	WebElement LinkHybridFramework;
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[9]/a")
	WebElement LinkDownloadTestFile;
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[11]/strong/label")
	WebElement LabelAutomationTool;
	
	@FindBy(name="tool")
	List<WebElement> Tools; 

	
	
}
