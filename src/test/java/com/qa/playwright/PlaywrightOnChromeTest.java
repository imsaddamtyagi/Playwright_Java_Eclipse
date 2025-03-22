package com.qa.playwright;

import org.testng.annotations.Test;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightOnChromeTest {
	
    @Test(enabled=false)
    public void Playwright_Chrome_Headless()
    {

         Playwright playwright = Playwright.create();
         Browser browser = playwright.chromium().launch();
         Page page = browser.newPage();
         page.navigate("https://ecommerce-playground.lambdatest.io/");
         String pageTitle = page.title();
         assertEquals(pageTitle, "Your Store");
    }

    
    @Test(enabled=true)
    public void Playwright_Chrome() 
    {
         Playwright playwright = Playwright.create(); 	           	
         BrowserType.LaunchOptions options = new BrowserType.LaunchOptions(); 
    	 options.setHeadless(false);                                      
 	      
         Browser browser = playwright.chromium().launch(options);   	        
    	 Page page = browser.newPage();
    	 page.navigate("https://ecommerce-playground.lambdatest.io/");
    	 String pageTitle = page.title();
         assertEquals(pageTitle, "Your Store");
    	    }
    
    	    private static void assertEquals(String actual, String expected) {
    	        if (!actual.equals(expected)) {
    	            throw new AssertionError("Expected: " + expected + " but got: " + actual);
    	        }
    	    }
    

    
    
    
}
