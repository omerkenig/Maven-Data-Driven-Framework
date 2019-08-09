package com.w2a.utilites;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

import sun.security.jca.GetInstance;

public class ExtentManager {

	private static ExtentReports extent;

	public static ExtentReports GetInstance() {

		if (extent == null) {
			extent = new ExtentReports(System.getProperty(("user.dir") + "\\target\\surefire-reports\\html\\extent.html"));
		}
		return extent;
	}
}
