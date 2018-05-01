package com.salesforce.login;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.filefilter.FileFilterUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.sikuli.script.FindFailed;

import com.salesforce.util.TestUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Login {
	
	TestUtil Selenium=TestUtil.getInstance();
	public WebDriver driver;
	@Given("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_go_to_on(String URL,String browser)
	{
		Selenium.openbrowser(browser);
		Selenium.navigate(URL);
		System.out.println("Iam going to"+URL+"on"+browser);
	}
	
	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter_as(String object,String text)
	{
		System.out.println("Entering in"+object+"value"+text);
		Selenium.type(object,text);
		//Selenium.js();
		
	}
	@And("^I enter the \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter_the_as(String object,String text)
	{
		System.out.println("Entering in"+object+"value"+text);
		Selenium.type(object,text);
		//Selenium.js();
		
	}
	@And("^I click on loginbutton$")
	public void I_click_on_loginbutton()
	{
		Selenium.js();
		//System.out.println("clicking on"+object);
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@And("^I click on \"([^\"]*)\"$")
	public void I_click_on(String object)
	{   
		Selenium.click(object);
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Then("^I click on the caseXpath$")
	public void I_click_on_the_caseXpath()
	{   
		Selenium.mouseover();
	}
	@Then("^I click on the caseXpathnow$")
	public void I_click_on_the_caseXpathnow()
	{   
		Selenium.mouseover_search();
	}
	@And("^I click on the newcase \"([^\"]*)\"$")
	public void I_click_on_the_newcase(String object)
	{   
		//driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		Selenium.click(object);
	}
  /*   @Then("^I enter the title$")
	public void I_enter_the_title(DataTable d)
	{ 
		List<List<String>> data=d.raw();
		System.out.println(data.get(0).get(0));
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//*[@id='title']")).sendKeys(data.get(0).get(0));
		Select set=new Select(driver.findElement(By.xpath("//*[@id='caseForm']/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/select")));
	    set.selectByValue("Reviewing");
	}*/
	@Then("^I enter the title$")
	public void I_enter_the_title()
	{ 
		Selenium.testdata();
	}
	@Then("^I enter the searchtitle$")
	public void I_enter_the_searchtitle()
	{ 
		Selenium.testdata1();
	}
	
	
	@Then("^login should be \"([^\"]*)\"$")
	public void login_should_be(String ExpectedResult)
	{
		System.out.println("login successful");
		 boolean result=Selenium.isElementPresent("searchbutton");
		 String actualResult=null;
		 if(result)
			 actualResult="success";
			 else
			actualResult="failure";
	Assert.assertEquals(ExpectedResult,actualResult);
	
	}
	
	 @And("^I click on save button$")
	 public void I_click_on_save_button()
	 {
		 Selenium.save();
	 }
	 @And("^I search the case$")
	 public void I_search_the_case()
	 {
		 Selenium.search();
	 }
	 
	/* @And("^I click on \"([^\"]*)\"$")
	 public void I_click_on(String object)
	 {
		 Selenium.click(object);
	 }*/
	

@And("^I close the browser$")
public void I_close_the_browser()
{
Selenium.close();
}

@And("^I select the file$")
public void I_select_the_file()
{
	Selenium.exceldata();

}

@And("^I send a Mail$")
public void I_send_a_Mail()
{    
	   String reportFolder=System.getProperty("user.dir")+"\\test-output";
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       FileFilterUtils filter = new FileFilterUtils();
       File folder =  new File(reportFolder);
       File files[] = folder.listFiles();

//date

//String fileName=files[files.length-1].getName();
        String extentFilePath=reportFolder;
//   String xsltReportPath=reportFolder+"Reports.zip";

// mail extent reports
      String[] to={"shanthi.jayaraman7@gmail.com"};

      String[] cc={};
      String[] bcc={};

      //This is for yahoo

      Selenium.sendMail("shanthi_7583@yahoo.co.in",
         		            "7@oracle",
         		            "smtp.mail.yahoo.com",
         		            "587",
         		            "true",
         		            "true",
         		            true,
         		            "javax.net.ssl.SSLSocketFactory",
         		            "false",
         		            to,
         		            cc,
         		            bcc,
         		            "Automation Test Reports - Extent",
         		            "Please find the reports attached.\n\n Regards\nWebMaster",
         		            extentFilePath
         		            );
         
       /**8  // mail the xslt reports
         Zip.zipDir(System.getProperty("user.dir")+"//XSLT_Reports", xsltReportPath);
         SendMail.sendMail("vaibhavcool12312@yahoo.com",
		            "Pass@123",
		            "smtp.mail.yahoo.com",
		            "25",
		            "true",
		            "true",
		            true,
		            "javax.net.ssl.SSLSocketFactory",
		            "false",
		            to,
		            cc,
		            bcc,
		            "Automation Test Reports - XSLT",
		            "Please find the reports attached.\n\n Regards\nWebMaster",
		            xsltReportPath,
		            "Reports.zip");**/


}
}
