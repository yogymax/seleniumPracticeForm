package com.demo.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFormV {
	
		
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
