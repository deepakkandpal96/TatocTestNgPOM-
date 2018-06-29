package Tatocautomation.Testng;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Popup {
	
    
    WebDriver web;
       
    public Popup(WebDriver web){
        this.web = web;
    }
    
    public void launchWindowEnterTextAndProceed(){
    	web.findElement(By.cssSelector("a")).click();
 	   String parentWindowHandler = web.getWindowHandle();                      
        web.findElement(By.cssSelector("a")).click(); 
 	   String subWindowHandler = null;
        Set<String> handles = web.getWindowHandles();
 	    		    
 	   Iterator<String> iterator = handles.iterator();                          
 	   while (iterator.hasNext())
 	        {
 	    	 subWindowHandler = iterator.next();
 	    	}
 	   web.switchTo().window(subWindowHandler); 
 	   web.findElement(By.id("name")).sendKeys("deepak");
 	   web.findElement(By.id("submit")).click();
        web.switchTo().window(parentWindowHandler); 
 	   web.findElement(By.linkText("Proceed")).click();
 	  
       }
    	
    
}


