package Tatocautomation.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import junit.framework.Assert;

public class FrameDungeon {
	
    WebDriver web;
    
    
    
    public FrameDungeon(WebDriver web) {
        this.web = web;
    }

   
    public void repaintBox() {
        
      
    	 web.switchTo().frame("main"); 
  	   Assert.assertEquals(web.findElement(By.id("answer")).isDisplayed(),true);
  	   String box1 = web.findElement(By.id("answer")).getAttribute("class");        
  	   while(true)
  	        {
  	          web.findElement(By.cssSelector("a")).click(); 
  	          web.switchTo().frame("child");
  	          String box2 = web.findElement(By.id("answer")).getAttribute("class");
  	          web.switchTo().parentFrame(); 
  	          if(box1.equals(box2))                                                
  	            {
  	                web.findElement(By.linkText("Proceed")).click();
  	                break;
  	            }
  	        }
        
       
        

    }
}