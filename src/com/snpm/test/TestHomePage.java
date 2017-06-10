package com.snpm.test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.snpm.util.BaseUtil;

public class TestHomePage extends TestBase {
	private ExtentTest test;
	private final String pageName = "[GenericPageName]: ";

	// TC2 : Test if Date input field is present
	@Test(priority = 1)
	public void enterInputs() throws Exception {

		test = reports.createTest("TestCase1","Sample test to validate Webpage title");
		if (homePage.validateTitle(test)) {
			test.pass("Text is Successfully inserted.");
			//test.log(LogStatus.PASS, "Text is Successfully inserted.");
			BaseUtil.CaptureScreen(driver,passScreenShotPath + this.getClass().getSimpleName().replaceAll("Test", "") + "//isTitleCorrect");
		} else {
			BaseUtil.CaptureScreen(driver,failScreenShotPath + this.getClass().getSimpleName().replaceAll("Test", "") + "//isTitleCorrect");
			test.fail("Text is not Successfully inserted.");
			//test.log(LogStatus.FAIL, "Text is not Successfully inserted.");
		}
		reports.flush();
		// Thread.sleep(5000);
	}

}