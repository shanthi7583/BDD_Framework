package com.salesforce.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.selenesedriver.AbstractElementFinder.ImplicitWait;
import org.openqa.selenium.support.ui.Select;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Screen;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

import org.apache.commons.io.filefilter.FileFilterUtils;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


import com.googlecode.totallylazy.pattern;

public class TestUtil {
	public Properties env=null;
	public WebDriver driver;
	static TestUtil E;

	 // Screen s=new Screen();
	  
	public TestUtil()
	{ 
		if(env==null){	
			try
			{
			env=new Properties();
			FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\salesforce\\config\\env.properties");
		    env.load(fs);
		 System.out.println(env.getProperty("URL"));
		  System.out.println(env.getProperty("browser"));
	   } catch(Exception e){
		System.out.println("error in init properties"+e);
	   }
	   
		}
	}
	
	public void openbrowser(String browsertype)
	{  
		System.setProperty("webdriver.gecko.driver","C:\\Users\\nikil kaarthi\\Downloads\\geckodriver.exe");
	   // System.setProperty("webdriver.chrome.driver","C:\\Users\\nikil kaarthi\\Downloads\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		
	 //  System.out.println(env.get("browser"));
		if(browsertype.equals("Chrome"))
		{	
		    driver=new ChromeDriver();
		    
		}
		else if(browsertype.equals("mozilla"))
		{
			File pathToBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
			FirefoxProfile firefoxProfile = new FirefoxProfile();
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\nikil kaarthi\\Downloads\\geckodriver.exe");       
			 driver = new FirefoxDriver(ffBinary,firefoxProfile);
		}
	 else
	   {
			System.out.println("browser not found");
		}
	
				
	}
		

	public void navigate(String URL)
	{
		driver.get(env.getProperty(URL));
		System.out.println(URL);
	}
	public void js()
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement button=driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input"));
		js.executeScript("arguments[0].click();",button);
		
	}
	
	public void mouseover()
	{
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver.switchTo().frame("mainpanel");
		WebElement E= driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[7]/a"));
		Action Mouseover=act.moveToElement(E).build();
		Mouseover.perform();

	}
	public void mouseover_search()
	{
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		//driver.switchTo().frame("mainpanel");
		WebElement E= driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[7]/a"));	
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		Action Mouseover=act.moveToElement(E).build();
		//js.executeScript("$('E').hover();");
		Mouseover.perform();

	}
	public void js1()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('password').value='7@oracle'");
	
	}
  public void click(String objectname)
  {
	 // driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	  driver.findElement(By.xpath(env.getProperty(objectname))).click();
  }
  
  public void type(String objectname,String text)
  {
	  driver.findElement(By.xpath(env.getProperty(objectname))).sendKeys(text);
  }
  public void select(String text,String objectname)
  {
	  driver.findElement(By.xpath(env.getProperty(objectname))).sendKeys(text); 
  }  
  public boolean isElementPresent(String objectname)
  {
	int count= driver.findElements(By.xpath(env.getProperty(objectname))).size();
	 if(count==0)
		 return false;
	 else
		 return true;
  }
	 
  public static TestUtil getInstance()
  { 
	  if(E==null)
		  E=new TestUtil();
	  return E;	  
  }
  public void testdata()
  {
	  
	   driver.findElement(By.id("title")).sendKeys("Mr.steve");
		Select set=new Select(driver.findElement(By.xpath("//*[@id='caseForm']/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/select")));
	   set.selectByValue("Reviewing");
	   
  }
  public void testdata1()
  {
	  
	   driver.findElement(By.name("cs_keyword")).sendKeys("Mr.steve");
  }	  
  public void save()
  {
	  driver.findElement(By.xpath(env.getProperty("savexpath"))).click();
  }
  
  public void search()
  {
	    Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		//driver.switchTo().frame("mainpanel");
		WebElement E= driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[7]/a"));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		Action Mouseover=act.moveToElement(E).build();
		//js.executeScript("$('E').hover();");
		Mouseover.perform();
		driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[7]/ul/li[2]")).click();
		
  }
  public void close()
  {
	  driver.quit();
  }
  
 public void exceldata()
  {
	  Set<String> li=driver.getWindowHandles();
	  System.out.println(li.size()); 
	  Iterator<String> window=li.iterator();
	  String mainwindow=(String) window.next();
	  if(window.hasNext())
	  {
	  driver.switchTo().window(mainwindow);
	 // s.click("C:/Users/nikil kaarthi/Desktop/excel.png");
	  }
	  else
		 System.out.println("no switch");
		  
  }
 public boolean sendMail(
		 
	 		final String userName,
	 		final String passWord,
	 		String host,
	 		String port,
	 		String starttls,
	 		String auth,
	 		boolean debug,
	 		String socketFactoryClass,
	 		String fallback,
	 		String[] to,
	 		String[] cc,
	 		String[] bcc,
	 		String subject,
	 		String text,
	 		String attachmentPath){



	 	Properties props = new Properties();
	     props.put("mail.smtp.starttls.enable", starttls);
	     props.put("mail.smtp.auth",auth);
	     props.put("mail.smtp.host", host);
	     props.put("mail.smtp.port", port);

	 try

	 {

	 	Session session = Session.getInstance(props,
	 	          new javax.mail.Authenticator() {
	 	            protected PasswordAuthentication getPasswordAuthentication() {
	 	                return new PasswordAuthentication(userName, passWord);
	 	            }
	 	          });

	      MimeMessage msg = new MimeMessage(session);
	     msg.setText(text);

	     msg.setSubject(subject);
	     //attachment start
	     // create the message part 
	    
	     Multipart multipart = new MimeMultipart();
	     MimeBodyPart messageBodyPart = new MimeBodyPart();
	     DataSource source = 
	       new FileDataSource(attachmentPath);
	     messageBodyPart.setDataHandler(
	       new DataHandler(source));
	    // messageBodyPart.setFileName(attachmentName);
	     multipart.addBodyPart(messageBodyPart);
	     
	     // attachment ends

	     // Put parts in message
	     msg.setContent(multipart);
	     msg.setFrom(new InternetAddress(userName));

	                 for(int i=0;i<to.length;i++){

	     msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to[i]));

	                 }

	                 for(int i=0;i<cc.length;i++){

	     msg.addRecipient(Message.RecipientType.CC, new InternetAddress(cc[i]));

	                 }

	                 for(int i=0;i<bcc.length;i++){

	     msg.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc[i]));

	                 }

	     msg.saveChanges();

	                 Transport transport = session.getTransport("smtp");

	                 transport.connect(host,userName,passWord);

	                 transport.sendMessage(msg,msg.getAllRecipients());

	                 transport.close();

	                 return true;

	 }

	 catch (Exception mex)

	 {

	     mex.printStackTrace();

	                 return false;
	}
		 
		
	} 

 }




  
