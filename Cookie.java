package Tatocautomation.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Cookie {
	
     WebDriver web;
       
     public Cookie(WebDriver web){
         this.web = web;
     } 
   
   
	

	public void proceedWithGeneratingTokenAndAddingCookie()
	{
    	Assert.assertEquals(web.findElement(By.cssSelector("a")).isDisplayed(),true);  
 	   web.findElement(By.cssSelector("a")).click();
 	   String Tokenvalue = web.findElement(By.id("token")).getText();            
 	   Tokenvalue = (Tokenvalue.substring(7));                                   
 	  Cookie cookie = new Cookie(web);
		                     
    
 	   web.findElement(By.linkText("Proceed")).click();
    }
}


