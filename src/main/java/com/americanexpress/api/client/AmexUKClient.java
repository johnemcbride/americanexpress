package com.americanexpress.api.client;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

//import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.americanexpress.api.model.AmexUKLoginRequest;
import com.americanexpress.api.model.AmexUKLoginResponse;


public class AmexUKClient {

	private static String amexUKBaseUrl = "https://global.americanexpress.com";
	//private static String amexUKBaseUrl = "http://localhost:8080";
	private static String amexUKLoginUrl = "/myca/intl/moblclient/emea/svc/v1/loginSummary.do?Face=en_GB";
	private AmexUKLoginResponse loginResp;
	
	public AmexUKLoginResponse getLoginResp() {
		return loginResp;
	}

	public AmexUKClient(String username, String password)
	{
		java.util.logging.Logger.getLogger("org.springframework.web.client.RestTemplate").setLevel(Level.OFF);
	 	java.util.logging.Logger.getLogger("log4j.logger.httpclient.wire;").setLevel(Level.OFF);
	 	java.util.logging.Logger.getLogger("org.springframework.http.converter.json.MappingJackson2HttpMessageConverter").setLevel(Level.OFF);
	
		 AmexUKLoginRequest loginReq = new AmexUKLoginRequest(username, password);
		 RestTemplate restTemplate = new RestTemplate();
		 
		 
		 List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		 MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		 List<MediaType> mediaTypes = new ArrayList<MediaType>();
		 mediaTypes.add(MediaType.TEXT_HTML);
		 converter.setSupportedMediaTypes(mediaTypes);
		 messageConverters.add(converter);
		 restTemplate.setMessageConverters(messageConverters);
		 
	     AmexUKLoginHeaderInterceptor loginInt = new AmexUKLoginHeaderInterceptor();
	     loginInt.setLoginRequest(loginReq);
	     List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
	     interceptors.add(loginInt); 
	     
	     restTemplate.setInterceptors(interceptors);

	    
	    
	     try{
	    	  loginResp =restTemplate.postForObject(amexUKBaseUrl + amexUKLoginUrl, loginReq, AmexUKLoginResponse.class) ;
	    	 
	     }
	     catch(Exception e) {
	    	 System.out.println(e);
	     }
	   
	    //Greeting[] greetings = restTemplate.getForObject( "http://localhost:8080/greeting", new Greeting[0].getClass());
	       
	     
	 
	
	}

}
;