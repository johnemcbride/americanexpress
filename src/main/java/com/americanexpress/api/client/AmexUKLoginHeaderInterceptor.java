package com.americanexpress.api.client;


import java.io.IOException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import com.americanexpress.api.model.AmexUKLoginRequest;

public class AmexUKLoginHeaderInterceptor implements ClientHttpRequestInterceptor {
	
	
	private AmexUKLoginRequest loginReq;
	
	void setLoginRequest(AmexUKLoginRequest loginReq){  this.loginReq = loginReq;}
	
	
    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {

    	//TODO - update the header keys with actual values from sniffing device
        HttpHeaders headers = request.getHeaders();
        headers.add("deviceId", loginReq.getHardwareId());
        headers.add("User-Agent", AmexUKLoginRequest.getUserAgent());
        headers.add("Face", AmexUKLoginRequest.getFace());
        headers.add("oSversion", AmexUKLoginRequest.getoSversion());
         
        return execution.execute(request, body);
    }
}