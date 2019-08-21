package com.w2a.testcases;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.java.swing.plaf.windows.WindowsTreeUI.ExpandedIcon;
import com.w2a.base.TestBase;
import com.w2a.utilites.ExcelReader;
import com.w2a.utilites.TestUtil;

public class OpenAccountTest extends TestBase {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void openAccountTest(String custumer, String currency)
			throws InterruptedException {
		
		

	}

}