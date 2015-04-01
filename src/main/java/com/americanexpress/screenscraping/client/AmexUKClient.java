package com.americanexpress.screenscraping.client;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import com.gargoylesoftware.htmlunit.Cache;
import com.gargoylesoftware.htmlunit.CookieManager;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlHeading3;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;


public class AmexUKClient{
	static final WebClient browser;

    static {
        browser = new WebClient();
        //browser.
        browser.getOptions().setJavaScriptEnabled(true);
        browser.getOptions().setCssEnabled(false);
       
    }
    
	
	public static BigDecimal fetchBalance(String username, String password) {
		// TODO Auto-generated method stub
		HtmlPage currentPage = null;
		BigDecimal balance = new BigDecimal(0);
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
		//nf.setCurrency(Currency.getInstance(Locale.ENGLISH));
		
		try {
			currentPage = browser.getPage("http://www.americanexpress.com/uk");
			((HtmlTextInput)currentPage.getElementByName("UserID")).setValueAttribute(username);
			((HtmlPasswordInput)currentPage.getElementByName("Password")).setValueAttribute(password);
			currentPage = ((HtmlAnchor)currentPage.getElementById("loginButton")).click();
			HtmlAnchor myAnch = (HtmlAnchor) currentPage.getFirstByXPath("//div[@id='card-list']/div/div[2]//a");
			currentPage = myAnch.click();
			String balanceDisplayed = ((HtmlHeading3)currentPage.getFirstByXPath("//div[@id='card-balance']/h3")).getAttribute("data").toString();

			
			balance = BigDecimal.valueOf(nf.parse(balanceDisplayed).doubleValue());
			browser.closeAllWindows();
			browser.setCache(new Cache());
			browser.setCookieManager(new CookieManager());
			
		} catch (FailingHttpStatusCodeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	
	}
}
