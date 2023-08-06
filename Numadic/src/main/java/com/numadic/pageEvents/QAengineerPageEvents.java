package com.numadic.pageEvents;

import static org.testng.Assert.assertEquals;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.numadic.base.baseTest;
import com.numadic.pageObjects.QAengineerPageObjects;
import com.numadic.utils.ElementFetch;

public class QAengineerPageEvents {
	ElementFetch ele = new ElementFetch();

	public void verifyPageitle() {
		String actualTitle = baseTest.driver.getTitle();
		Assert.assertEquals("Numadic Iot Pvt. Ltd. - QA Engineer in", actualTitle);
		System.out.println(actualTitle);
	}

	public void ImInterestedBTN() {
		ele.getWebElement("XPATH", QAengineerPageObjects.ImInterestedBTN).click();
	}

	public void basicInfo() {
		ele.getWebElement("XPATH", QAengineerPageObjects.SalutationDropDown).click();
		ele.getWebElement("XPATH", QAengineerPageObjects.selectMr).click();
		ele.getWebElement("XPATH", QAengineerPageObjects.fname).sendKeys("testfname");
		ele.getWebElement("XPATH", QAengineerPageObjects.lname).sendKeys("testlname");
		ele.getWebElement("XPATH", QAengineerPageObjects.email).sendKeys("test@test.com");
		ele.getWebElement("XPATH", QAengineerPageObjects.mobile).sendKeys("1234512345");
	}

	public void addressinfo() {
		ele.getWebElement("XPATH", QAengineerPageObjects.street).sendKeys("teststreet");
		ele.getWebElement("XPATH", QAengineerPageObjects.city).sendKeys("testcity");
		ele.getWebElement("XPATH", QAengineerPageObjects.state).sendKeys("teststate");
		ele.getWebElement("XPATH", QAengineerPageObjects.postal).sendKeys("12344");
		ele.getWebElement("XPATH", QAengineerPageObjects.country).sendKeys("testcountry");
	}

	public void personalDetails() {
		ele.getWebElement("XPATH", QAengineerPageObjects.currentEmployer).sendKeys("testCompany");
		ele.getWebElement("XPATH", QAengineerPageObjects.crntJobTitle).click();
		ele.getWebElement("XPATH", QAengineerPageObjects.fresherOptn).click();
		ele.getWebElement("XPATH", QAengineerPageObjects.crntCTC).sendKeys("5LAKHS");
		ele.getWebElement("XPATH", QAengineerPageObjects.expctdCTC).sendKeys("9LAKHS");
	}

	public void otherInfo() {
		ele.getWebElement("XPATH", QAengineerPageObjects.rsnForChng).sendKeys("testReason");
		ele.getWebElement("XPATH", QAengineerPageObjects.whyJoinNumadic).sendKeys("testReason");
	}

	public void educationDetails() throws InterruptedException {
		ele.getWebElement("XPATH", QAengineerPageObjects.addEducationBTN).click();
		ele.getWebElement("XPATH", QAengineerPageObjects.institute).sendKeys("testInstitute");
		ele.getWebElement("XPATH", QAengineerPageObjects.major).sendKeys("testMajor");
		ele.getWebElement("XPATH", QAengineerPageObjects.degree).sendKeys("testDegree");
		
		ele.getWebElement("XPATH", QAengineerPageObjects.frmmonthDRPDWN).click();
		ele.getWebElement("XPATH", QAengineerPageObjects.frmselectMonth).sendKeys("Feb");
		Thread.sleep(100);
		ele.getWebElement("XPATH", QAengineerPageObjects.frmselectMonth).sendKeys(Keys.ENTER+ ""+ Keys.ENTER);
		ele.getWebElement("XPATH", QAengineerPageObjects.frmyearDRPDWN).click();
		ele.getWebElement("XPATH", QAengineerPageObjects.frmselectYear).sendKeys("2015");
		Thread.sleep(100);
		ele.getWebElement("XPATH", QAengineerPageObjects.frmselectYear).sendKeys(Keys.ENTER+""+ Keys.ENTER);
		ele.getWebElement("XPATH",QAengineerPageObjects.tomnthDRPDWN).click(); 
		ele.getWebElement("XPATH",QAengineerPageObjects.toselectMonth).sendKeys("Mar");
		Thread.sleep(100);
		ele.getWebElement("XPATH",QAengineerPageObjects.toselectMonth).sendKeys(Keys.ENTER+ ""+ Keys.ENTER);
		ele.getWebElement("XPATH",QAengineerPageObjects.toyearDRPDWN).click(); 
		ele.getWebElement("XPATH",QAengineerPageObjects.toselectYear).sendKeys("2019");
		Thread.sleep(100);
		ele.getWebElement("XPATH",QAengineerPageObjects.toselectYear).sendKeys(Keys.ENTER+ ""+ Keys.ENTER);
		
		/*
		 * Actions action = new Actions(baseTest.driver);
		 * action.click().build().perform();
		 */
	}
	
	public void experienceDetails() throws InterruptedException {
		ele.getWebElement("XPATH", QAengineerPageObjects.addExperience).click();
		ele.getWebElement("XPATH", QAengineerPageObjects.occupation).sendKeys("testOccupation");
		ele.getWebElement("XPATH", QAengineerPageObjects.company).sendKeys("testCompany");
		ele.getWebElement("XPATH", QAengineerPageObjects.summary).sendKeys("testSummary");
		
		ele.getWebElement("XPATH", QAengineerPageObjects.wrkfrmMnth).click();
		ele.getWebElement("XPATH", QAengineerPageObjects.wrkfrmselectMonth).sendKeys("jul");
		Thread.sleep(100);
		ele.getWebElement("XPATH", QAengineerPageObjects.wrkfrmselectMonth).sendKeys(Keys.ENTER+ ""+ Keys.ENTER);
		ele.getWebElement("XPATH", QAengineerPageObjects.wrkfrmYear).click();
		ele.getWebElement("XPATH", QAengineerPageObjects.wrkfrmselectYear).sendKeys("2020");
		Thread.sleep(100);
		ele.getWebElement("XPATH", QAengineerPageObjects.wrkfrmselectYear).sendKeys(Keys.ENTER+""+ Keys.ENTER);
		ele.getWebElement("XPATH",QAengineerPageObjects.wrktoMnth).click(); 
		ele.getWebElement("XPATH",QAengineerPageObjects.wrktoselectMonth).sendKeys("Mar");
		Thread.sleep(100);
		ele.getWebElement("XPATH",QAengineerPageObjects.wrktoselectMonth).sendKeys(Keys.ENTER+ ""+ Keys.ENTER);
		ele.getWebElement("XPATH",QAengineerPageObjects.wrktoYear).click(); 
		ele.getWebElement("XPATH",QAengineerPageObjects.wrktoselectYear).sendKeys("2023");
		Thread.sleep(100);
		ele.getWebElement("XPATH",QAengineerPageObjects.wrktoselectYear).sendKeys(Keys.ENTER+ ""+ Keys.ENTER);
		ele.getWebElement("XPATH", QAengineerPageObjects.currentlyWrkCHKBX).click();
	}
	public void socialNetwork(){
		ele.getWebElement("XPATH", QAengineerPageObjects.linkdin).sendKeys("rahul.raj//ksmkk908");
	}
	
	public void submitBTN() {
		ele.getWebElement("XPATH", QAengineerPageObjects.submitBTN).click();
	}

}
