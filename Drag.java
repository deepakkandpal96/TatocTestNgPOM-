package Tatocautomation.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;


public class Drag {
	
 
    private WebDriver web;
    WebElement dragbox;
    WebElement dropbox;
  
    public Drag(WebDriver web){
        this.web = web;
    }
    
   
    
    public void boxInDropBox(){

    	Actions action = new Actions(web); 
 	   Assert.assertEquals(web.findElement(By.id("dragbox")).isDisplayed(),true);
 	   WebElement drag = web.findElement(By.id("dragbox"));
 	   Assert.assertEquals(web.findElement(By.id("dropbox")).isDisplayed(),true);
 	   WebElement Drop = web.findElement(By.id("dropbox"));
 	   action.dragAndDrop (drag,Drop);                                           
 	   action.build().perform();                                                 
 	   web.findElement(By.cssSelector("a")).click();
        
      

    }

}



