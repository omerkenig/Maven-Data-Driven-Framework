package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;
import com.w2a.base.TestBase;
import com.w2a.utilites.TestUtil;

public class BankManagerLoginTest extends TestBase{
	
	@Test
	public void loginAsBankManager() throws InterruptedException
	{
		log.debug("Inside Login Test !!!" );
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();

		Assert.assertTrue(IsElementPresent(By.cssSelector(OR.getProperty("addCustBTN"))), "Login not successful !");
		
		log.debug("Login Successfully executed!!!" );
		
		Assert.fail("Login not Successfully");		
	}
}
