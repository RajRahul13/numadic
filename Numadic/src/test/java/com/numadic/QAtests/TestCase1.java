package com.numadic.QAtests;

import org.testng.annotations.Test;

import com.numadic.base.baseTest;
import com.numadic.pageEvents.*;

public class TestCase1 extends baseTest {
	CareersPageEvents cpe = new CareersPageEvents();
	QAengineerPageEvents qpe = new QAengineerPageEvents();

	@Test
	public void careerPageScript(){
		cpe.VerifyHeaderText();
		cpe.selectFromDropdown();
		cpe.clickQAengLink();

		qpe.verifyPageitle();
		qpe.ImInterestedBTN();
		qpe.basicInfo();
		qpe.personalDetails();
		qpe.addressinfo();
		qpe.otherInfo();
		try {
			qpe.educationDetails();
			qpe.experienceDetails();
			qpe.socialNetwork();
			qpe.submitBTN();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
