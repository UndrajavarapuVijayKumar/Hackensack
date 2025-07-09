package com.hackensack.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest {
	public static String projectpath = System.getProperty("user.dir");
	
	public static FileInputStream fis;
	
	public static Properties data;
	public static Properties mainProp;
	public static Properties childProp;
	
	public static WebDriver driver;
	
	public static ExtentReports extents;
	public static ExtentSparkReporter spark;
	public static ExtentTest test;
	
	public static void init(String browser) throws IOException {
		fis = new FileInputStream(projectpath+"//dataSources//commondata.properties");
		data = new Properties();
		data.load(fis);
		
		switch (browser){
        case "ff": case "firefox":
            driver = new FirefoxDriver();
            break;
        case "gc": case  "chrome":
            driver = new ChromeDriver();
            break;
        case "edge": case  "edgebrowser":
            driver = new EdgeDriver();
            break;
        default:
            driver = new ChromeDriver();
            break;
    }
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.manage().deleteAllCookies();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");

    extents = new ExtentReports();
//    spark = new ExtentSparkReporter("hackensackreport.html");
    spark = new ExtentSparkReporter("report.html");

    extents.attachReporter(spark);
    
	}
	public static void launchBrowser() throws IOException{
		fis = new FileInputStream(projectpath+"//dataSources//environment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectpath+"//dataSources//"+e+".properties");
		childProp = new Properties();
		childProp.load(fis);
		String webUrl = childProp.getProperty("hackensack");
		System.out.println(webUrl);
		
        driver.navigate().to(webUrl);
        System.err.println("Page launched!");
    }
	

}
