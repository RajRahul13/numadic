package com.numadic.pageEvents;

import org.testng.Assert;

import com.numadic.pageObjects.CareersPageObjects;
import com.numadic.utils.ElementFetch;

public class CareersPageEvents {
	
	ElementFetch ele = new ElementFetch();
	
	//Verify header text (JOIN OUR CREW)

	public void VerifyHeaderText() {
		Assert.assertTrue(ele.getWebElements("XPATH", CareersPageObjects.HeaderText).size()>0,"Element not found");	

	}
	
	//From the filter by dropdown, select ‘Engineering’
	public void selectFromDropdown() {
		ele.getWebElement("XPATH", CareersPageObjects.FilterDropdown).click();
		ele.getWebElement("XPATH", CareersPageObjects.EngineeringOption).click();
	}
	
	public void clickQAengLink() {
		ele.getWebElement("XPATH", CareersPageObjects.QAengineerLink).click();
		
	}
	
}
