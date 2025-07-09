package com.hacksack.testsuites;

import java.awt.Desktop;
import java.awt.peer.DesktopPeer;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.hackensack.utils.BaseTest;

public class SetupNteardown extends BaseTest{
	@BeforeSuite
	public static void setup() throws IOException {
		init("chrome");
	}
	@BeforeClass
	public static void launch() throws IOException {
		launchBrowser();
	}
	@BeforeMethod
	public static void startTest(Method method) {
		test=extents.createTest(method.getName());
	}
	@AfterMethod
    public void teardownMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.fail("Test failed: " + result.getThrowable());

            // Take screenshot on failure
            TakesScreenshot ts = (TakesScreenshot) driver;
            String screenshotPath = "test-output/screenshots/" + result.getName() + ".png";
            try {
                File src = ts.getScreenshotAs(OutputType.FILE);
                File dest = new File(screenshotPath);
                org.openqa.selenium.io.FileHandler.copy(src, dest);
                test.addScreenCaptureFromPath(screenshotPath);
            } catch (Exception e) {
                test.warning("Screenshot capture failed: " + e.getMessage());
            }

        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test passed");
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.skip("Test skipped: " + result.getThrowable());
        }
    }

    @AfterClass
    public void quitBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void flushReport() throws IOException {
        if (extents != null) {
            extents.flush();
            Desktop.getDesktop().browse(new File("C:/ProgramData/Jenkins/.jenkins/workspace/basic/report.html").toURI());
        }
    }
}
