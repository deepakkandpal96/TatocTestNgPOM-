package Tatocautomation.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import junit.framework.Assert;

public class basicCourse {
	
	GridGate grid;
	WebDriver web;
	WebElement Course ;
	
	  public  basicCourse(WebDriver web) {
	        this.web = web;
	  }
	
	   
	  public void clickOnBasicCourse() {
		 
		  Course = web.findElement(By.xpath("//a[@href='/tatoc/basic']"));
		  Assert.assertEquals("[Assertion Failed]: "+Course.getText()+" is not displayed",true ,Course.isDisplayed());
	      Course.click();
	         
	  	}
}