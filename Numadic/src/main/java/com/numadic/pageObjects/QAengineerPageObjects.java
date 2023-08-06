package com.numadic.pageObjects;

public interface QAengineerPageObjects {
	String ImInterestedBTN = "//lyte-button[@id='detail-page-applybtn']//button[@type='button']";
	
	//Basic Info
	String SalutationDropDown = "//lyte-drop-button[@data-zcqa='manual_Salutation']//span[@class='lyteDropPlaceholderNormal'][normalize-space()='-None-']";
	String selectMr = "//lyte-drop-item[@id='Lyte_Drop_Item_1']";
	String fname = "//*[@id=\"rec-form_53264000000003149\"]/div/lyte-input/div/input";
	String lname = "//*[@id=\"rec-form_53264000000003151\"]/div/lyte-input/div/input";
	String email = "//*[@id=\"rec-form_53264000000003155\"]/div/lyte-input/div/input";
	String mobile = "//*[@id=\"rec-form_53264000000003161\"]/div/div/lyte-input/div/input";
	
	//Address Information 
	String street = "//*[@id=\"rec-form_53264000000003169\"]/div/lyte-input/div/input";
	String city = "//*[@id=\"inputId\"]";
	String state = "//*[@id=\"rec-form_53264000000003173\"]/div/div/div/lyte-autocomplete/lyte-dropdown/div[1]/lyte-drop-button/lyte-input";
	String postal = "//*[@id=\"rec-form_53264000000003175\"]/div/div/div/lyte-autocomplete/lyte-dropdown/div[1]/lyte-drop-button/lyte-input";
	String country = "//*[@id=\"rec-form_53264000000003177\"]/div/lyte-input/div/input";
	
	//Professional Details
	String currentEmployer = "//*[@id=\"rec-form_53264000000003181\"]/div/lyte-input/div/input";
	String crntJobTitle = "//lyte-drop-button[contains(@data-zcqa,'manual_Current_Job_Title')]//span[contains(@class,'lyteDropPlaceholderNormal')][normalize-space()='-None-']";
	String fresherOptn = "//lyte-drop-item[@id='Lyte_Drop_Item_5']";
	String crntCTC = "//*[@id=\"rec-form_53264000000285107\"]/div/lyte-input/div/input";
	String expctdCTC = "//*[@id=\"rec-form_53264000000285115\"]/div/lyte-input/div/input";
	
	//Other Info
	String rsnForChng = "//*[@id=\"rec-form_53264000000279009\"]/div/lyte-input/div/input";
	String whyJoinNumadic = "//*[@id=\"rec-form_53264000000279013\"]/div/lyte-input/div/input";
	
	//Educational Details
	String addEducationBTN = "//rec-tabular-component[@id='rec-form_53264000000002559_53264000000201042']//a[contains(@class,'tabular-group-add')][normalize-space()='Add']";
	String institute = "//lyte-input[@id='53264000000201044_1_tab']//input[contains(@type,'text')]";
	String major = "//lyte-input[@id='53264000000201046_1_tab']//input[contains(@type,'text')]";
	String degree = "//lyte-input[@id='53264000000201048_1_tab']//input[contains(@type,'text')]";
	
	String frmmonthDRPDWN = "//lyte-dropdown[@id='cxd-53264000000201050_1_from_month']//lyte-icon[contains(@class,'dropdown')]";
	String frmselectMonth = "//lyte-drop-box[@id='cxdb-53264000000201050_1_from_month']//input[1]";
	String frmyearDRPDWN = "//lyte-dropdown[@id='cxd-53264000000201050_1_from_year']//lyte-icon[contains(@class,'dropdown')]";
	String frmselectYear = "//lyte-input[contains(@class,'lyteSearchInput lyteInput vertical lyteInputFocus')]//input[@id='inputId']";
	
	String tomnthDRPDWN = "//lyte-dropdown[@id='cxd-53264000000201050_1_to_month']//lyte-icon[contains(@class,'dropdown')]";
	String toselectMonth = "//lyte-input[@class='lyteSearchInput lyteInput vertical lyteInputFocus']//input[@id='inputId']";
	String toyearDRPDWN = "//lyte-dropdown[@id='cxd-53264000000201050_1_to_year']//lyte-icon[contains(@class,'dropdown')]";
	String toselectYear = "//lyte-input[@class='lyteSearchInput lyteInput vertical lyteInputFocus']//input[@id='inputId']";
	
	//Experience Details
	String addExperience = "//rec-tabular-component[@id='rec-form_53264000000002559_53264000000201078']//a[@class='tabular-group-add'][normalize-space()='Add']";
	String occupation = "//lyte-input[@id='53264000000201080_1_tab']//input[contains(@type,'text')]";
	String company = "//lyte-input[@id='53264000000201082_1_tab']//input[contains(@type,'text')]";
	String summary = "//textarea[contains(@autocomplete,'off')]";
	
	String wrkfrmMnth = "//lyte-dropdown[@id='cxd-53264000000201086_1_from_month']//lyte-icon[@class='dropdown']";
	String wrkfrmselectMonth ="//lyte-drop-box[@id='cxdb-53264000000201086_1_from_month']//input[1]";
	String wrkfrmYear = "//lyte-dropdown[@id='cxd-53264000000201086_1_from_year']//lyte-icon[contains(@class,'dropdown')]";
	String wrkfrmselectYear = "//lyte-input[@class='lyteSearchInput lyteInput vertical lyteInputFocus']//input[@id='inputId']";
	
	String wrktoMnth = "//lyte-dropdown[@id='cxd-53264000000201086_1_to_month']//lyte-icon[contains(@class,'dropdown')]";
	String wrktoselectMonth = "//lyte-input[@class='lyteSearchInput lyteInput vertical lyteInputFocus']//input[@id='inputId']";
	String wrktoYear = "//lyte-dropdown[@id='cxd-53264000000201086_1_to_year']//lyte-icon[contains(@class,'dropdown')]";
	String wrktoselectYear = "//lyte-input[@class='lyteSearchInput lyteInput vertical lyteInputFocus']//input[@id='inputId']";
	String currentlyWrkCHKBX = "//*[@id=\"53264000000201088_1_tab\"]/label/span";
	
	//Social Network 
	String linkdin = "//*[@id=\"rec-form_111222333445\"]/div/lyte-input/div/input";
	
	//submitBTN
	String submitBTN = "//lyte-yield[normalize-space()='Submit Application']";
	
}
