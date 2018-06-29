package Tatocautomation.Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import junit.framework.Assert;

public class GridGate {
	
	
	    WebElement greenbox;
	    WebElement redbox;
	    WebDriver web;
	    


	    public GridGate(WebDriver web) {
	        this.web = web;
	    }


	    public void clickOnGreenBox() {
            greenbox = web.findElement(By.className("greenbox"));
            Assert.assertEquals("[Assertion Failed]: "+greenbox.getText()+"is not displayed",true ,greenbox.isDisplayed());
	        greenbox.click();
	    }

		
	}



